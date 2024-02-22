# variabila = zona din memoria unui calculator care tine date
# variabila = cutiuta in care punem valori

# am declarat (i-am dat un nume - marca) si initializat variabila marca
marca_masina = 'Volvo'
model_masina = 'XC 60'

# nu putem sa punem spatiu in numele variabilei
# o variabila incepe cu litera mica

# loosely typed - nu trebuie sa specificam tipurile

print(f'Am cumparat o masina marca : {marca_masina}')
print(f'Este modelul : {model_masina}')

# suprascriere
model ='XC 60 facelift'
print(f'Am cumparat o masina marca : {marca_masina}')
print(f'Este modelul : {model_masina}')

# concatenare de stringuri
nume = 'Simion'
prenume = 'Tabeea'
varsta = 27
print(nume + ' ' + prenume)
print(f'{nume} {prenume} si am varsta de {varsta} de ani.')