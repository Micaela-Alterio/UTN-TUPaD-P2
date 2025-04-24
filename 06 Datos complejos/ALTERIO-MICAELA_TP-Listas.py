#Ejercicio 1
#Programa para crear una lista de numeros multiplos de 4 comprendidos entre 1 y 100.
lista_multiplos=list(range(4,101,4))
print (lista_multiplos)


#/////////////////////////////////////////////////////////////////////////////////////////////////////


#Ejercicio 2
#Programa que muestra el penultimo elemento de un lista de 5
lista_colores= ["rosa","celeste","lila","violeta","fucsia"]
#Con numero positivo:
print (lista_colores[3])
#Con numero negativo:
print (lista_colores[-2])


#/////////////////////////////////////////////////////////////////////////////////////////////////////


#Ejercicio 3
#Programa que crea una lista y luego le añade tres elementos.
aves=[]
aves.append("paloma")
aves.append("aguila")
aves.append("canario")
print(aves)


#/////////////////////////////////////////////////////////////////////////////////////////////////////


#Ejercicio 4
#Programa que reemplaza algunos elementos por otors.
animales= ["perro", "gato", "conejo"]
animales [1]= "loro"
animales [2]= "oso"
print (animales)


#/////////////////////////////////////////////////////////////////////////////////////////////////////


#Ejercicio 5

#El programa siguiente lo que hace es eliminar el valor maximo que se encuentra
# dentro de la lista llamada "numeros" y luego lo imprime en pantalla.

#numeros=[8,15,3,22,7]
#numeros.remove(max(numeros))
#print (numeros)


#/////////////////////////////////////////////////////////////////////////////////////////////////////


#Ejercicio 6
#Programa que crea una lista de numero de multiplos de 5 entre 10 y 30
# e imprime los dos primeros valores por pantalla
numeros=list(range(10,31,5))
print(numeros[0:2])


#/////////////////////////////////////////////////////////////////////////////////////////////////////


#Ejercicio 7
#Programa que reemplaza los dos valores centrales e imprime la lista por pantalla
autos =["sedan", "polo", "suran", "gol"]
autos [1]="toyota"
autos [2]= "bmw"
print (autos)


#/////////////////////////////////////////////////////////////////////////////////////////////////////


#Ejercicio 8
#Programa que crea una lista vacia y luego agrega elementos y los muestra por pantalla
dobles=[]
dobles.append(2*5)
dobles.append(2*10)
dobles.append(2*15)
print (dobles)


#/////////////////////////////////////////////////////////////////////////////////////////////////////


#Ejercicio 9
#Programa que crea listas anidadas y agrega, modifica y elimina algunos elementos.
compras=[["pan","leche"],["arroz","fideos","salsa"],["agua"]]
compras[2].append("jugo")
compras[1][1]= "Tallarines"
compras[0].remove("pan")
print (compras)


#/////////////////////////////////////////////////////////////////////////////////////////////////////


#Ejercicio 10
#Programa que crea una lista anidada y luego la imprime por pantalla
lista_anidada=[15,True,[25.5,57.9,30.6],False] 
print (lista_anidada)