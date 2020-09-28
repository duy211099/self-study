has_high_income = True
has_good_credit = True

if has_good_credit and has_high_income:
    print('Eligible for loan.')
elif has_good_credit and not has_high_income:
    print('something.')
elif has_good_credit or has_high_income:
    print('something else.')

name = "Duy Pham"

if len(name) < 3:
    print('Name must be long than 3 charaters.')
elif len(name) > 50:
    print('Name can be a maximun of 50 charaters.')
else:
    print('Name looks good!')