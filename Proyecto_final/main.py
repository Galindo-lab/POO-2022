import pygame, time
from conf import *


from src.Board import Board


board = Board(
    WINDOW_DIMENSION[0],
    WINDOW_DIMENSION[1],
    2
)


pygame.init()
pygame.font.init()

pygame.display.set_caption(WINDOW_TITLE)

window = pygame.display.set_mode(WINDOW_DIMENSION)
canvas = pygame.Surface(WINDOW_DIMENSION)
clock = pygame.time.Clock()
running = True

while running:
    dt = clock.tick(60) * .001 * TARGET_FPS
    
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
            
    canvas.fill( (0,0,0) )
    board.update(dt)
    board.draw(canvas)
    
    window.blit(canvas, (0,0))
    pygame.display.update()

pygame.quit()
