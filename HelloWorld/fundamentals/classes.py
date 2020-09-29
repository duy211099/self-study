class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def move(self):
        print('move')

    def draw(self):
        print('draw')


point1 = Point(12, 20)
# point1.draw()

class Person:
    def __init__(self, name):
        self.name = name

    def talk(self):
        print(f'{self.name}: Woof woof')


duy = Person('Duy')
duy.talk()

ml = Person('My Linh')
ml.talk()