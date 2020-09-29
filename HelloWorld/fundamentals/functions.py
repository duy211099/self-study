def greet_user(first_name, last_name):
    print(f'Hi, {first_name} {last_name}!')
    print('Welcome to dalat')


def square(number):
    return number*number


print('Start')
greet_user('John', 'Pham')
greet_user(first_name='John', last_name='Pham')
print('End')
