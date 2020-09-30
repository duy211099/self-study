from pathlib import Path

path = Path()
path.mkdir()
path.rmdir()

#path.glob('*.*')
#path.glob('*')
for file in path.glob('*.py'):
    print(file)
