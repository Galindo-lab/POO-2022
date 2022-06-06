import pygame

class Player(pygame.sprite.Sprite):

    RADIUS = 25
    STEP = 60
    
    def __init__(self, color, x, y):
        self.position = 0       # celda actual 
        self.coord = pygame.math.Vector2(x,y)
        self.color = color

    def draw(self, display):
        pygame.draw.circle(display,
                           self.color,
                           self.coord,
                           Player.RADIUS, 0)

    def moveTo(self,  Cell ):
        self.coord = Cell.coord + pygame.math.Vector2(Player.RADIUS+ 5, Player.RADIUS+ 5)
        self.position = Cell.position
        
        

    def update(self, dt):
        pass
        # self.coord = ( 1, 0 ) * self.position
        
        
