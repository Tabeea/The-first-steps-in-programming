'''
Operatori:
aritmetici: +, -, *, /, %
de comparare: <>,==, !=, <-, >=
logici: and, or, !
'''

# Operatori aritmetici:
a = 3
b = 5
print(a + b) # 3+5 => 8

# Operatori de comparare:
print(a == b) # a este egal cu b? False

# Operatori logici:
print(a<b and a<4) #3<5? true SI 3<4? true => True and true =>true
print(a<b or a<4) #True SAU False => True

#Exemplu pt true and false
# la sedinta cu parintii poti veni
# cu mama sau tata sau (cu bunicu si bunica)
# Daca vine doar mama este in regula? Da
# Daca vine doar tata este in regula? Da
# Daca vine doar bunicu este in regula? Nu, bunicu trebuie sa vina cu bunica impreuna
# Daca vine mama, bunicu si bunica este in regula? Da

mama = True
tata = False
bunicu = True
bunica = False
print(mama or tata or (bunicu and bunica))

#Programatorii traduc in cod ( ca din romana in engleza)