
import json

class Questions():
    """Pregunta"""

    QUESTIONS = [
        {
            "pregunta": "5 * 2",
            "respuesta": "10",
            "alternativas": [
                "7","45","2","10"
            ]
        },
        {
            "pregunta": "5 * 2",
            "respuesta": "10",
            "alternativas": [
                "7","45","2","10"
            ]
        },
        {
            "pregunta": "5 * 2",
            "respuesta": "10",
            "alternativas": [
                "7","45","2","10"
            ]
        },
    ]
    
    def __init__(self):
        self.numero_pregunta = 0

    def curret_question(self, param=None):
        index = self.numero_pregunta
        if(param == None): return Questions.QUESTIONS[index]
        return Questions.QUESTIONS[index][param]
        
    def get_pregunta(self):
        return self.curret_question("pregunta")
        
    def get_alternativas(self):
        return self.curret_question("alternativas")
    
    def get_respuesta(self):
        index = self.numero_pregunta
        return self.curret_question("respuesta")
        
    def check(self, respuesta_jugador):
        return (self.curret_question("respuesta") ==
                self.get_alternativas()[respuesta_jugador] )
    
        
