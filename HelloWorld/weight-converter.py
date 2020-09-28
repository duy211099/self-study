weight = float(input('Weight: '))
quantity = input('(L)bs or  (K)g: ')

if quantity.lower() == 'l':
    print(f'{weight*0.45} kilograms.')
elif quantity.lower() == 'k':
    print(f'{weight/0.45} pounds.')
else:
    print('Wrong quantity.')