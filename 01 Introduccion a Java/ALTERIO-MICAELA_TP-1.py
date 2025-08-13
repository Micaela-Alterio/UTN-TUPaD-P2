#Ejercicio1
print ("hola mundo!")
#Ejercicio2
nombre = input ("Escriba su nombre:")
print (f"Hola {nombre}!")
#Ejercicio3
nombre = input ("Escriba su nombre:")
apellido = input ("Escriba su apellido:")
edad = input ("Escriba su edad:")
lugar = input ("Escriba su lugar de residencia:")
print (f"Soy {nombre} {apellido}, tengo {edad} años y vivo en {lugar}.")
#Ejercicio4
radio = float (input ("Ingrese el radio del círculo:"))
area = 3.1416 * radio **2
perimetro = 2 * 3.1416 * radio
print (f"El área del círculo es, {area} y su perímetro es, {perimetro}")
#Ejercicio5
segundos = int (input ("Ingrese la cantidad de segundos:"))
horas = segundos / 3600
print (f"La cantidad de horas que equivalen {segundos} segundos, es : {round (horas, 1)} horas")
#Ejercicio6
numero = int (input ("Ingrese un número:"))
print (f"{numero} * 1 = {(1*numero)}")
print (f"{numero} * 2 = {(2*numero)}")
print (f"{numero} * 3 = {(3*numero)}")
print (f"{numero} * 4 = {(4*numero)}")
print (f"{numero} * 5 = {(5*numero)}")
print (f"{numero} * 6 = {(6*numero)}")
print (f"{numero} * 7 = {(7*numero)}")
print (f"{numero} * 8 = {(8*numero)}")
print (f"{numero} * 9 = {(9*numero)}")
print (f"{numero} * 10 = {(10*numero)}")
#Ejercicio7
a = int (input ("Ingrese un número distinto de 0:"))
b = int (input ("Ingrese otro número distinto de 0:"))
print (f"El resultado de sumar {a} + {b} es: {a+b}. El resultado de dividir {a} por {b} es: {a/b}. El resultado de multiplicar {a} * {b} es: {a*b} y el resultado de restar {a} - {b} es: {a-b}")
#Ejercicio8
altura = float (input ("Ingrese su altura:"))
peso = float (input ("Ingrese su peso:"))
imc = peso/altura**2
print (f"Su índice de masa corporal es: {round (imc, 2)}")
#Ejercicio9
temperatura = int (input("Ingrese una temperatura en grados celsius:"))
temperatura = (9/5) * temperatura + 32
print (f"La conversión de la temperatura ingresada a grados Fahrenheit es: {temperatura}")
#Ejercicio10
a = int (input("Ingrese un número:"))
b = int (input("Ingrese otro número:"))
c = int (input("Ingrese otro número:"))
print (f"El promedio de los números ingresados es: {((a+b+c)/3)}")