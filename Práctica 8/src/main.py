from Equipo import *
from Jugador import *
from Torneo import *

torneoA = Torneo("Copa extranjera","Nacional")
torneoB = Torneo("Copa local","Mexico")

EquipoA = Equipo("A","1","pepe")
EquipoB = Equipo("B","1","pepe2")
EquipoC = Equipo("C","1","pepe3")
EquipoD = Equipo("D","1","pepe4")

A = Jugador(1,"Pepe2",1.50)
B = Jugador(2,"Pepe3",1.70)
C = Jugador(3,"Pepe2",1.80)
D = Jugador(4,"Pepe3",1.50)
E = Jugador(5,"Pepe2",1.30)
F = Jugador(6,"Pepe3",1.40)
G = Jugador(7,"Pepe2",1.50)
H = Jugador(8,"Pepe3",1.60)

A.puntos_anotados = 3
B.puntos_anotados = 10
C.puntos_anotados = 4
D.puntos_anotados = 20
E.puntos_anotados = 7
F.puntos_anotados = 0
G.puntos_anotados = 2
H.puntos_anotados = 10

EquipoA.agregar_jugador(A)
EquipoB.agregar_jugador(B)
EquipoC.agregar_jugador(C)
EquipoD.agregar_jugador(D)
EquipoA.agregar_jugador(E)
EquipoB.agregar_jugador(F)
EquipoC.agregar_jugador(G)
EquipoD.agregar_jugador(H)

torneoA.agregar_equipo(EquipoA)
torneoA.agregar_equipo(EquipoB)
torneoA.agregar_equipo(EquipoC)
torneoA.agregar_equipo(EquipoD)
