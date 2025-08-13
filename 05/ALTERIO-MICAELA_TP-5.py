#EJERCICIO 1:

#FUNCION:

#Funcion que devuelve un mensaje y lo imprime por pantalla
def imprimir_hola_mundo():
    print ("Hola mundo!")

#PROGRAMA:

#Programa que imprime el mensaje "Hola mundo!" llamado a una funcion.
imprimir_hola_mundo()


#/////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 2:

#FUNCION:

#Funcion que establece un parametro, devuelve un mensaje y lo imprime por pantalla
def saludar_usuario (nombre):
    print(f"Hola {nombre}!")

#PROGRAMA:

#Programa que solicita un argumento y llama a una funcion para que retorne un mensaje
nombre= input("Ingrese su nombre:")
saludar_usuario (nombre)


#//////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 3:

#FUNCION:

#Funcion que establece cuatro parametros, devuelve un mensaje y lo imprime por pantalla
def informacion_personal(a,b,c,d):
    print(f"Soy {a} {b}, tengo {c} años y vivo en {d}.")


#PROGRAMA:

#Programa que solicita 4 argumentos y llama a una funcion para que retorne un mensaje
nombre=input("Ingrese su nombre:")
apellido=input("Ingrese su apellido:")
edad=input("Ingrese su edad:")
residencia=input("Ingrese su lugar de residencia:")
informacion_personal(nombre,apellido,edad,residencia)


#//////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 4:

from math import pi

#FUNCIONES:

#Funcion que recibe el radio y calcula el area de un circulo.
def calcular_area_circulo (a):
    area= pi * a**2
    print(f"El area del circulo es {area:.2f}")

#Funcion que recibe el radio y calcula el perimetro de un circulo.
def calcular_perimetro_circulo (b):
    perimetro= 2* pi *b
    print(f"El perimetro del circulo es {perimetro:.2f}")
    
#PROGRAMA:

#Programa que solicita el radio al usuario y luego 
# llama a dos funciones para informar el area y el perimetro
radio=int(input("Ingrese el radio:"))
calcular_area_circulo(radio)
calcular_perimetro_circulo (radio)


#//////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 5:

#FUNCIONES:

#Funcion que recibe la cantidad de segundos, calcula e imprime por pantalla su equivalencia en horas.
def segundos_a_horas(seg):
    min=seg/60
    H=min/60
    M=min%60
    S=seg%60
    print(f"Los segundos ingresados corresponden a {int(H)} horas,\
 {int(M)} minutos, {S} segundos.")

#PROGRAMA:

#Programa que solicita la cantidad de segundos 
# y luego llama a una funcion que calcula la equivalencia del valor ingresado a horas.
segundos=int(input("Ingrese la cantidad de segundos:"))
segundos_a_horas(segundos)


#//////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 6:

#FUNCION:

#Funcion que recibe un numero y calcula e imprime por pantalla su tabla de multiplicar.
def tabla_multiplicar(numero):
    for i in range (10):
        print (f"{numero} * {i+1} = {(numero)*(i+1)}")
        
#PROGRAMA:

#Programa que imprime la tabla de multiplicar del numero ingresado.
numero=int(input("Ingrese un numero entero:"))
tabla_multiplicar(numero)


#//////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO7:

#FUNCION:

#Funcion que recibe dos valores y calcula e informa el resultado de 
#sumarlos, restarlos, multiplicarlos y dividirlos.
def operaciones_basicas(a,b):
    print (f"La suma de {a} + {b} es: {a+b}\nLa resta de {a} - {b} es: {a-b}\
\nEl producto de {a} * {b} es: {a*b}\nLa division de {a} / {b} es: {(a/b):.1f}")

#PROGRAMA:

#Programa que calcula la suma, resta, multiplicacion y division de dos numeros dados.
a=int(input("Ingrese un numero:"))
b=int(input("Ingrese otro numero:"))
operaciones_basicas(a,b)


#//////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 8:

#FUNCION:

#Funcion que recibe el peso y altura y luego calcula e informa por pantalla el IMC.
def calcular_imc(peso,altura):
    print(f"Su IMC es: {(peso/altura**2):.2f}")

#PROGRAMA:

#Programa que calcula el Indice de Masa Corporal.
peso=int(input("Ingrese su peso:"))
altura=float(input("Ingrese su altura:"))
calcular_imc(peso,altura)


#//////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 9:

#FUNCION:

#Funcion que recibe un valor en grados celsius y calcula e imprime por pantalla su valor en Fahrenheit.
def celsius_a_fahrenheit(grados):
    print(f"La equivalencia en grados Fahrenheit del valor ingresado es: {(grados*1.8+32):.2f} grados F.")

#PROGRAMA:

#Programa para pasar de grados Celsius a grados Fahrenheit.
celsius=float(input("Ingrese la temperatura en grados Celsius:"))
celsius_a_fahrenheit(celsius)


#//////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 10:

#FUNCION:

#Funcion que establece tres parametros para calcular su promedio.
def calcular_promedio(a,b,c):
    return ((a+b+c)/3)

#PROGRAMA:

#Programa para calcular el promedio de tres valores.
a=int(input("Ingrese un numero:"))
b=int(input("Ingrese otro numero:"))
c=int(input("Ingrese otro numero:"))
promedio=calcular_promedio(a,b,c)
print(f"El promedio de los numeros ingresados es: {(promedio):.2f}")