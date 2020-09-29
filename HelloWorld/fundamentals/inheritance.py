class Mammal:
    def walk(self):
        print('walk')


class Dog(Mammal):
    pass


class Cat(Mammal):
    def be_annoying(self):
        print('annoying')


duy = Dog()
duy.walk()

mang = Cat()
mang.be_annoying()