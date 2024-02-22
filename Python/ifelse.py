#if
piesa_faina = True
print('pornim radio')
if piesa_faina == True:
    print('dam mai tare')
    print('fredonam')
print('oprim radio')

# if else
# Daca nr este par printam acest lucru, altfel printam impar
nr = -5
# Ce inseamna ca un numar este par? Daca se imparte exact la 2
# Ce inseamna ca se imparte la 2? Ne da restul 0

if nr % 2 == 0:
    print('nr par')
else:
    print('impar')

# este un nr pozitiv?
if (nr > 0):
    print('pozitiv')
else:
    print('nr nu este pozitiv')

# if, else if, else
# Cum ne saluta robotelul in functie de ora?
#ora = input('Introdu ora')
#print(ora == 17)  # dupa ce introduc ora (scriu 17 & enter) o sa imi afiseze False

#luam date de la tastatura
#ne asiguram ca sunt transformate din str in int
ora = int(input('Introdu ora'))
print(ora == 17)

if ora<0:
    print('ora invalida. ora mai mare decat 24')
# esti pe autostrada si vezi localitatile (optiunile)
elif ora <= 11:
    print('Buna dimineata!')
elif ora <= 18:
    print('Buna ziua!')
elif ora <= 21:
    print('Buna seara!')
elif ora <= 24:
    print('Noapte buna!')

else: #iesirea de pe autostrada (Nu ai gasit nicio localitate satisfacatoare)
    print('ora invalida. ora mai mare decat 24')

# CTRL + / - selectare/deselectare cod

# Exemplu: Robotel telefonic
optiunea = int(input('alege o optiune'))
if optiunea == 0:
    print('meniu anterior')
elif optiunea == 1:
    print('ati ales ro')
elif optiunea == 2:
    print('ati ales eng')
else:
    print('nu am identificat optiunea, mai incearca')