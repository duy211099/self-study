names = ['Duy', 'Tom', 'Linh', 'My', 'Son']
# rint(names[-1])
# print(names[1:3])

names[0] = 'Du'
# print(names)

numbers = [3, 6, 2, 8, 4, 10]
max_num = numbers[0]
for number in numbers:
    if max_num < number:
        max_num = number
# print(number)

matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

numbers.clear()
numbers = [2, 5, 42, 12, 5, 45]
numbers.append(21)
numbers.insert(0, 10)
numbers.remove(42)
numbers.count(5)
numbers.sort()
numbers.reverse()
numbers2=numbers.copy()
print(numbers2)