class Torneo:
    def __init__(self,nombre, región):
        self.nombre = nombre
        self.región = región
        self.equipos_participantes = []
        self.partidos_jugados = 0
        self.partidos_pendientes = 0

    def agregar_equipo(self, equipo):
        self.equipos_participantes.append(equipo)
        
        
