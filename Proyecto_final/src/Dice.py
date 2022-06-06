
from random import randint

class Dice():
    def __init__(self):
        self.value = 1          # el valor minimo de un dado es 1

    def throw(self):
        self.value = randint(1, 6)
