#Ejercicio 1:
#Ciclo for para imprimir los numeros del 1 al 100 en forma creciente.
for i in range(101):
    print (i)

#Ejercicio 2:
numero=int(input("Ingrese un numero:"))
#funcion para convertir el numero en positivo (en caso de ser necesario),
#y luego lo convierta en una cadena de caracteres y la recorra.
digitos=len(str(abs(numero)))
print (f"El numero ingresado tiene {digitos} digitos.")

#Ejercicio 3:
num1=int(input("Ingrese un numero:"))
num2=int(input("Ingrese otro numero:"))
suma=0
#ciclo for para sumar los numeros comprendidos entre los dos valores dados.
for i in range((num1+1),num2):
    suma+=i 
print (f"La suma de todos los numeros comprendidos entre {num1} y {num2} \
excluyendo los valores dados es {suma}")

#Ejercicio 4:
numero=int(input("Ingrese un numero:"))
acumulador=0
#Ciclo while para acumular todos los numeros que ingrese el usuario.
while (numero!=0):
    acumulador+=numero
    numero=int(input("Ingrese un numero:")) 
print (f"La suma de todos los numeros ingresados es {acumulador}")

#Ejercicio 5:
import random
numero=int(input("Adivine el numero comprendido entre 0 y 9:"))
contador=1
#funcion para generar el numero aleatorio a adivinar.
aleatorio= random.randint(0, 9)
#Ciclo para ingresar el numero y contar la cantidad de intentos.
while (numero!=aleatorio):
    numero=int(input("No has adivinado. Ingresa otro numero:"))
    contador+=1
print (f"Has adivinado! El numero es {aleatorio}. Cantidad de intentos: {contador}.")

#Ejercicio 6:
#ciclo para imprimir por pantalla los numeros pares entre 0 y 100 de forma decreciente)
for i in range(100,0,-2):
    print (i)
    
#Ejercicio 7:
num=int(input("Ingrese un numero entero positivo:"))
suma=0
#ciclo for para acumular todos los numeros comprendidos entre 0 y el numero dado por el usuario.
for i in range(0,num+1):
    suma+=i
print (f"La suma de todos los numeros comprendidos entre 0 y {num} inclusive es: {suma}.")

#Ejercicio 8:
par=0
impar=0
positivo=0
negativo=0
#Ciclo for para ingresar los numeros 
for i in range(100):
    num=int(input("Ingrese un numero:"))
#estructura condicional que evalua si el numero es positivo, negativo,
#par o impar y cuenta segun su clasificacion.
    if num %2==0:
        par+=1
    else:
        impar+=1
    if num>0:
        positivo+=1
    elif num<0:
        negativo+=1
print (f"Total de numeros pares:{par}\n\
Total de numeros impares:{impar}\n\
Total de numeros positivos:{positivo}\n\
Total de numeros negativos:{negativo}")

#Ejercicio 9:
cont=0
acu=0
#Ciclo for para ingresar los numeros, contarlos y acumularlos.
for i in range(100):
    num=int(input("Ingrese un numero:"))
    cont+=1
    acu+=num
print (f"El promedio de los numeros ingresado es {acu/cont}.")

#Ejercicio 10:
num=int(input("Ingrese un numero:"))
#Funcion que convierte el numero ingresado en una cadena de caracteres,
# la invierte y la vuelve a convertir a un numero.
invertir=int(str(num)[::-1])
print (f"El numero ingresado invertido es: {invertir}.")