
from codigo.Bird import *
from codigo.Subclases import *

Pajaros = []
Pajaros.append(Bird(10,2,"Pepe"))
Pajaros.append(Bird(13,4,"Juan"))
Pajaros.append(Bird(17,5,"Fransisco"))
Pajaros.append(Bird(11,2,"Alex"))
Pajaros.append(Bird(3,2,"Carlos"))

red = Red(10, 1, "Red")
chuck = Chuck(20, 1.5, "Chuck", 10)
blue = Blue(5, 0.5, "Blue")
bomb = Bomb(3, 1.5, "Bomb", 50)

red.ataque()
chuck.ataque()
blue.ataque()
bomb.ataque()
