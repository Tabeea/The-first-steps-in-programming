from oop.cont_bancar import ContBancar

cont1 = ContBancar('Tabeea S', 'RO001')
cont2 = ContBancar('Nadia S', 'RO002')

cont1.activareCont(7777)
cont2.activareCont(3333)
cont2.activareCont(7777)

cont1.alimentareCont(300)
cont2.alimentareCont(700)
cont2.alimentareCont(300)

cont1.plataCard(500)
cont1.plataCard(300) # 0
cont2.plataCard(100)
cont2.plataCard(200) # 700

cont1.interogareSold()
cont2.interogareSold()

# tema:
# clasa angajat: nume, prenume, salariu, vechime,
# constructor : nume, prenume, salariu, functie, vechime,
# metode:
# descriere
# marire salariu in functie de vechime ( daca are sub 5 ni se mareste cu 300. peste 5 ani cu 500)
# actualizare vechime (param noua vechime)




