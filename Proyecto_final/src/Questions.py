
import json

class Questions():
    """Pregunta"""

    QUESTIONS = [
        {
            "pregunta": "¿Como se representa el oro en la tabla periodica?",
            "respuesta": "AU",
            "alternativas": [
                "OR", "OS", "AT", "AU"
            ]
        },
        {
            "pregunta": "¿Como se representa el hidrogeno en la tabla periodica?",
            "respuesta": "H",
            "alternativas": [
                 "O", "Hg", "He", "H"
            ]
        },
        {
            "pregunta": "¿Como se representa el hierro en la tabla periodica?",
            "respuesta": "Fe",
            "alternativas": [
                "Fe", "He", "Na", "H"
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
            "pregunta": "10 * 3",
            "respuesta": "30",
            "alternativas": [
                "13","7","26","30"
            ]
        },
        {
            "pregunta": "25+16",
            "respuesta": "41",
            "alternativas": [
                "41","467","43","60"
            ]
        },
        {
            "pregunta": "250 + 465",
            "respuesta": "715",
            "alternativas": [
                "100","86","4","715"
            ]
        },
        {
            "pregunta": "19-7",
            "respuesta": "12",
            "alternativas": [
                "12","13","11","10"
            ]
        },
        {
            "pregunta": "¿Cual es el estado de agregacion del sol?",
            "respuesta": "Plasma",
            "alternativas": [
                "Plasma","Solido","Liquido","Gas"
            ]
        },
        {
            "pregunta": "¿Cual es el estado de agregacion del butano?",
            "respuesta": "Gas",
            "alternativas": [
                "Solido","Gas","Plasma","Liquido"
            ]
        }
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
    
        
