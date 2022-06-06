from src.Player import Player
from src.Cell import Cell
from src.Questions import Questions


import pygame
from random import randint

pygame.font.init()

class Board():
    # Colores lo los jugadores
    
    COLOR = [
        (156,  74,  57),        # Rojo
        (110, 157, 131),        # Azul
        (210, 244,  49),        # Verde
        (255, 187,  31),        # Amarillo
        (215, 132,  37)         # Naraja
    ]

    # Me dio flojera buscar como generar esta secuencia
    # Puramente estetico y no define ningun comportamiento del
    # tablero: https://pin.it/63ue7sT
    
    SEQUENCE = [
         1,  2,  3,  4,  5,  6,
        12, 11, 10,  9,  8,  7,
        13, 14, 15, 16, 17, 18,
        24, 23, 22, 21, 20, 19,
        25, 26, 27, 28, 29, 30
    ]

    ESCALERAS = {
         2: 21,
         4:  7,
        10: 25,
        19: 28
    }

    SERPIENTES = {
        26:  0,
        20:  8,
        18:  6,
        16:  3
    }

    # Numero de celdas
    N_CELLS = 30

    FONT = pygame.font.SysFont('Consolas', 20)






    

    def __init__(self, screen_width, screen_height, n_players):

        # numero de jugadores
        self.n_players = n_players

        # turno actual
        self.turn = 0

        # quiz time
        self.quiz_time = False

        # preguntas
        self.questions = Questions()

        # ganador
        self.winner = None
        
        self.cells = []
         # inicializar Celdas
        for i in range(0, Board.N_CELLS):
            self.cells.append( Cell(
                (i % 6) * Cell.WIDTH + 30,
                (screen_height - Cell.HEIGHT) - (i//6) * Cell.HEIGHT - 30,
                i + 1
            ))

        self.players = []
        # inicializar Jugadores
        for i in range(0, n_players):
            self.players.append(Player(
                Board.COLOR[i],
                Player.RADIUS + 35,
                screen_height - Player.RADIUS - 35
            ))





    def draw_board(self, display):
        cell_center = pygame.Vector2(Cell.WIDTH/2, Cell.HEIGHT/2)
        
        for cell in self.cells:
            cell.draw(display)

        for key in Board.SERPIENTES:
             pygame.draw.line(
                display,
                (255,0,0),
                self.getCell(key).coord + cell_center ,
                self.getCell(Board.SERPIENTES[key]).coord + cell_center
            )

        for key in Board.ESCALERAS:
             pygame.draw.line(
                display,
                (0,255,0),
                self.getCell(key).coord + cell_center,
                self.getCell(Board.ESCALERAS[key]).coord + cell_center
            )


    def display_text(self, display, text, x, y):
        text_surface = Board.FONT.render(
            text,
            False,
            (255,255,255)
        )
        
        display.blit(
            text_surface,
            pygame.math.Vector2( x,  y )
        )
        


    def draw_ui(self, display):

        if(self.winner != None):
            self.display_text(
                display,
                "EL JUGADOR " + str(self.winner+1) + " GANA",
                30,
                40
            )

        if(self.quiz_time and self.winner == None):
            self.display_text(
                display,
                self.questions.get_pregunta(),
                30,
                40
            )

            for i,v in enumerate(self.questions.get_alternativas()):
                self.display_text(
                    display,
                    str(i+1) + ") " + v,
                    50,
                    (i+1) * 20 + 60
                )
        
        
        # Turno actual
        self.display_text(display, "Turno", 550, 380)
        pygame.draw.circle(
                display,
                Board.COLOR[self.turn],
                pygame.math.Vector2(580,450),
                35,
                0
            )

        # jugaodres
        self.display_text(display, "Jugadores", 520, 510)
        for i in range(0, self.n_players):
            pygame.draw.circle(
                display,
                Board.COLOR[i],
                pygame.math.Vector2(530,550) + pygame.math.Vector2(25 * i, 0),
                10,
                0
            )



            
            
    def draw(self, display):   
        self.draw_board(display)
        self.draw_ui(display)

        for player in self.players:
            player.draw(display)



            
            

            
    def current_player_position(self):
        """Posición del jugador actual"""
        return self.get_player().position




    

    

    
    def quiz_event(self):
        foo = self.current_player_position()
        return foo in Board.ESCALERAS
        



    def next_turn(self):
        if self.turn == self.n_players-1:
            self.turn = 0
        else:
            self.turn += 1


            
            
    def update(self, dt):      
        # Controles del juego, presiona espacio para lanzar el dado
        player = self.get_player()
        position = self.current_player_position()
        keys = pygame.key.get_pressed()
        
        if(keys[pygame.K_SPACE] and not self.quiz_time):
            pygame.time.wait(500)
            self.playerTurn( randint(1,3) )
            self.quiz_time = self.quiz_event()
            if not self.quiz_time: self.next_turn()
           

        if( self.quiz_time ):
            
            respuesta = -1

            if(keys[pygame.K_1]): respuesta = 0
            elif(keys[pygame.K_2]): respuesta = 1
            elif(keys[pygame.K_3]): respuesta = 2
            elif(keys[pygame.K_4]): respuesta = 3
                
            if(position in Board.ESCALERAS and
                 self.questions.check(respuesta) and
                 respuesta != -1):
                
                print("ESCALERA!! tiempo para quiz")
                player.moveTo(self.getCell(Board.ESCALERAS.get(position)))
                self.quiz_time = False
                self.questions.numero_pregunta += 1
                self.next_turn()

        if(position in Board.SERPIENTES):        
                print("SERPIENTE!! tiempo para quiz")
                player.moveTo(self.getCell(Board.SERPIENTES.get(position)))






            
    def getCell(self, index):
        """Retorna una celda"""
        return self.cells[index]



    
    
    
    def get_player(self):
        """Retorna el jugador con el turno actual"""
        return self.players[self.turn]


    
    
    
    def lastCell(self):
        """Ultima celda"""
        return self.cells[Board.N_CELLS - 1]


    
    
    def playerTurn(self, cells):
       player = self.get_player()
       currentCell = self.current_player_position()
       
       if( currentCell + cells >= Board.N_CELLS ):
           # movel a la ultima celda
           player.moveTo(self.lastCell())
           self.winner = self.turn
       else:
           player.moveTo(self.getCell(currentCell + cells))
       
