
import pygame

pygame.font.init()

class Cell:
    """Celda de el tablero"""
    # constantes de clase
    COLOR = (255,255,255)
    WIDTH = 60
    HEIGHT = 60
    BORDER = 1
    FONT = pygame.font.SysFont('Consolas', 20)
    ANTIALIASING = False

    # variables de clase
    _id = 0

    def __init__(self, x, y, value):
        self.coord = pygame.math.Vector2( x, y)
        self.rect = pygame.Rect(x, y, Cell.WIDTH, Cell.HEIGHT)
        self.num = "%02d"%(value)
        self.position = Cell._id
        # orden de creacion, no representa el numero inferior
        Cell._id += 1

    
    def draw(self, canvas):
        # dibujar el borde
        pygame.draw.rect(
            canvas,
            Cell.COLOR,
            self.rect,
            Cell.BORDER
        )

        # dibujar el numero
        self.render_num(canvas)

    def render_num(self, canvas):
        text_surface = Cell.FONT.render(
            self.num,
            Cell.ANTIALIASING,
            Cell.COLOR
        )
        
        canvas.blit(
            text_surface,
            self.coord + pygame.math.Vector2( Cell.WIDTH/2, Cell.WIDTH/2 )
        )
