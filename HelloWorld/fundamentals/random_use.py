import random

for i in range(3):
    print(random.random())
    print(random.randint(10, 20))

members =['ML', 'HN', 'FA', 'Study']
chosen_one = random.choice(members)
print(chosen_one)


class Dice:
    def roll(self):
        first = random.randint(1, 6)
        second = random.randint(1, 6)
        return first, second
        # return tuple don't need to use (first, second)


dice1 = Dice()
print(dice1.roll())
