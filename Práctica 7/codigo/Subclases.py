
from codigo.Bird import *

class Red(Bird):
    def __init__(self, peso, size, nombre):
        Bird.__init__(self, peso, size, nombre)
        
    def ataque(self):
        print("El pajaro Red atacó")

class Chuck(Bird):
    def __init__(self, peso, size, nombre, velocidad):
        self.velocidad = velocidad
        Bird.__init__(self, peso, size, nombre)

    def ataque(self):
        print("El pájaro Chuck atacó y se hizo más veloz")
        
class Blue(Bird):
    def __init__(self, peso, size, nombre):
        Bird.__init__(self, peso, size, nombre)

    def ataque(self):
        print("El pajaro Blue atacó y se dividio en 3")

class Bomb(Bird):
    def __init__(self, peso, size, nombre, explosion):
        self.explosion = explosion
        Bird.__init__(self, peso, size, nombre)

    def ataque(self):
        print("El pajaro Bomb atacó y explotó")
