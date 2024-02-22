def printGreeting():
    print("Buna ziua! Bine ati venit")

def printGreetingByName(nume, prenume):
    print(f'Buna ziua {nume} {prenume}')

def mediaNr(a, b, c):
    return (a + b + c) / 3

def piValue():
    return 3.14 # return trebuie sa fie ultima instructiune

# exercitiu
# daca persoane e majora, altfel false
def verificareMajor(varsta):
    if varsta >= 18:
        return True
    else:
        return False

# zona de apelare (desktop)
printGreeting()
printGreeting()
printGreetingByName('S','T')
printGreetingByName('S','S')
printGreetingByName('S','N')
print(mediaNr(1,2,3))
print(piValue())
print(verificareMajor(17))

# se ia varsta utilizatorului
age = int(input('introduceti varsta dvs'))
if verificareMajor(age):
    print('Cont creat. Bine ai venit in aplicatie')
else:
    print('Nu ai varsta minima necesara (18) pentru a paria')

# oop
# variabila => atribute, proprietati sau fields
# functii => metode

