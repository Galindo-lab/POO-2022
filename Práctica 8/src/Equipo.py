class Equipo:

    def __init__(self, nombre, división, entrenador):
        self.nombre = nombre
        self.división = división
        self.entrenador = entrenador
        self.torneos_ganados = 0
        self.torneos_perdidos = 0
        self.jugadores = []

    def agregar_jugador(self, jugador):
        jugador.numero_uniforme = self.jugadores_registrados()
        self.jugadores.append(jugador)

    def jugadores_registrados(self):
        return len(self.jugadores)

    def goles_totales(self):
        return sum([x.puntos_anotados for x in self.jugadores])
