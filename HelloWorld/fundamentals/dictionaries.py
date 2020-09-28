customer = {
    "name": "Duy Pham",
    "age": 8,
    "is_verified": True
}
customer['name'] = 'Tommy'
customer['new_key'] = 'value'
print(customer['new_key'])

numbers = {
    '1': 'One',
    '2': 'Two',
    '3': 'Three',
    '4': 'Four',
    '5': 'Five',
    '6': 'Six',
    '7': 'Seven',
    '8': 'Eight',
    '9': 'Nine'
}

input_numbers = input('Number: ')

output = ''
for number in input_numbers:
    output += numbers.get(number, '!') + ' '
print(output)