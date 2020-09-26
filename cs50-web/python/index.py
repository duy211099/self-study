import sys
# from squares import square

# name = input("Name: ")

# print("Hello " + name)
# print(f"Hello, {name}")


# n = int(input("Number: "))
# if n > 0:
#     print("n is postitive")
# elif n<0:
#     print("n is negative")
# else:
#     print("n is zero")

# list
names = ["BDuy", "ATom", "Trinh"]

# print(names)

# names.append("Who")

# names.sort()

# print(names)


# set

# s=set()

# s.add(1)
# s.add(2)
# s.add(3)
# s.add(4)
# s.add(3)

# s.remove(2)

# print(s)

# print(f"the set has {len(s)} elements")

# loop

# for i in [1, 2, 3, 4, 5]:
#     print(i)

# for i in range(100):
#     print(i)

# for name in names:
#     print(name)
#     for character in name:
#         print(character)

# dictionaries

# houses = {"Harry": "Gryffindor", "Draco": "Slytherin"}

# houses["Hermione"] = "Gryffindor"

# print(houses["Hermione"])


# funtion

# for i in range(10):
#     print(f"The square of {i} is {square(i)}.")

# oop
# class


# class Point:
#     def __init__(self, x, y):
#         self.x = x
#         self.y = y


# p = Point(2, 8)
# print(p.y)
# print(p.x)


# class Flight:
#     def __init__(self, capacity):
#         self.capacity = capacity
#         self.passengers = []

#     def add_passenger(self, name):
#         if not self.open_seats():
#             return False
#         self.passengers.append(name)
#         return True

#     def open_seats(self):
#         return self.capacity - len(self.passengers)

# flight = Flight(3)

# people=["Harry", "Ron", "Hermione", "Ginny"]

# for person in people:
#     if flight.add_passenger(person):
#         print(f"Added {person} to flight successfully.")
#     else:
#         print(f"No available seat for {person}.")



# decorators


# def annouce(f):
#     def wrapper():
#         print("Before")
#         f()
#         print("After")
#     return wrapper

# @annouce
# def hello():
#     print("Hello, World!")

# hello()

# lambda

# people =[
#     {"name": "Harry", "house": "Gryffindor"},
#     {"name": "Cho", "house": "Ravenclaw"},
#     {"name": "Draco", "house": "Slytherin"}
# ]

# def f(person):
#     return person["name"]

# # people.sort(key=f)

# people.sort(key=lambda person: person["name"])

# print(people)


# exceptions
try:
    x = int(input("x: "))
    y = int(input("y: "))
except:
    print("Error: input.")
    sys.exit(1)

try:
    result =x/y
except ZeroDivisionError:
    print("Error: cannot devide by 0.")
    sys.exit(1)

print(f"{x} / {y} = {result}")
