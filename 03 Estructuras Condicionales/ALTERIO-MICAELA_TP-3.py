#Ejercicio 1:
edad = int (input ("Ingrese su edad: "))
#Estructura condicional para evaluar si la edad ingresada es mayor a 18, si lo es, se imprimira el mensaje.
if edad>18:
    print ("Es mayor de edad")
    
#Ejercicio 2:
nota=float(input("Ingrese su nota: "))
#Estructura condicional para evaluar si la nota es mayor o igual a 6,
# si lo es, se imprimira el mensaje de aprobado. De lo contrario se imprimira el mensaje de desaprobado.
if nota>=6:
    print ("Aprobado")
else:
    print ("Desaprobado")

#Ejercicio 3:
numero=int (input("Ingrese un numero: "))
#Estructura condicional para evaluar si el numero ingresado es par,
# si lo es, se imprimira el mensaje "Ha ingresado un numero par". De lo contrario se imprimira
# el mensaje "Por favor, ingrese un numero par".
if numero % 2==0:
    print ("Ha ingresado un número par.")
else:
    print ("Por favor, ingrese un número par.")

#Ejercicio 4:
edad=int(input("Ingrese su edad: "))
#Estructura condicional que evalua dentro de que rango se clasifica la edad
# y se informa por pantalla a que grupo etario pertenece
if edad>0 and edad >=30:
    print ("Adulto/a.")
elif edad >0 and edad >= 18:
    print ("Adulto/a joven.")
elif edad>0 and edad >= 12:
    print ("Adolescente.")
elif edad >0 and edad < 12:
    print ("Niño/a.")
else:
    print ("La edad ingresada es incorrecta.")

#Ejercicio 5:
clave=input("Ingrese una contraseña: ")
#Funcion para contar la cantidad de caracteres ingresados.
cantidad=len(clave)
#Estructura condicional que evalua si la cantidad de caracteres ingresados esta dentro del rango 8/14.
if cantidad >=8 and cantidad<=14:
    print ("Ha ingresado una contraseña correcta.")
else:
    print ("Por favor, ingrese una contraseña de entre 8 y 14 caracteres.")

#Ejercicio 6:
#funciones que debo importar para resolver el ejercicio
import random
import statistics
#Codigo para generar una lista de 50 numeros de manera aleatoria.
numeros_aleatorios = [random.randint(1, 100) for i in range(50)]
#Codigo para calcular la moda, la mediana y la media.
moda=statistics.mode (numeros_aleatorios)
mediana=statistics.median (numeros_aleatorios)
media=statistics.mean (numeros_aleatorios)
#Estructura condicional que evalua la moda, media y mediana, y determina si
# hay sesgo positivo, negativo o no hay sesgo. Luego imprime el resultado por pantalla.
if media>mediana and media>moda:
    print ("Hay sesgo positivo.")
elif media<mediana and mediana<moda:
    print ("Hay sesgo negativo.")
elif media==mediana and mediana==moda:
    print ("No hay sesgo.")

#Ejercicio 7:
#funcion para determinar si la ultima letra ingresada es una vocal. 
def vocal (texto):
    return texto.lower().endswith(("a", "e", "i", "o", "u"))
cadena=input ("Ingrese una palabra o frase (no finalizar con signos de puntuación): ")
#Estructura condicional que evalua si la ultima letra ingresada es una vocal
# e imprime el string con un signo "!" Si la cadena termina con una vocal,
# o la cadena ingresada sin modificaciones si no termina con una vocal.
if vocal(cadena):
    print (f"{cadena}!")
else:
    print (cadena)

#Ejercicio 8:
nombre=input("Ingrese su nombre: ")
opcion=int (input("Elija una opción: \n1 Si desea que su nombre se imprima en mayúsculas. \
    \n2 Si desea que su nombre se imprima en minúsculas.\
    \n3 Si desea que su nombre se imprima con la primera letra en mayúscula: " ))
#Estructura condicional que evalua la opcion ingresada e imprime lo solicitado por pantalla.
#utilizando las funciones upper(), lower() y title().
if opcion == 1:
    print (nombre.upper())
elif opcion == 2:
    print(nombre.lower())
elif opcion == 3:
    print (nombre.title())

#Ejercicio 9:
magnitud=float(input("Ingrese la magnitud del terremoto: "))
#Estructura condicional que evalua el numero ingresado
# e imprime por pantalla el resultado segun su clasificacion
if magnitud >=7:
    print ("Extremo.\nPuede causar graves daños a gran escala")
elif magnitud >=6:
    print ("Muy Fuerte.\nPuede causar daños significativos.")
elif magnitud >=5:
    print ("Fuerte.\nPuede causar daños en estructuras débiles.")
elif magnitud >=4:
    print ("Moderado.\nSentido por personas, pero generalmente no causa daños.")
elif magnitud >=3:
    print("Leve.\nLigeramente perceptible.")
else:
    print ("Muy leve.\nImperceptible")

#Ejercicio 10:
hemisferio=int(input("Ingrese por favor en que hemisferio se encuentra.\
    \nUsar '1' para Norte o '2' para Sur: "))
mes=int(input("Ingrese en que mes se encuentra (expresado en números): "))
dia=int(input("Ingrese el día (expresado en números): "))
#Estructura condicional que evalua los datos ingresados
# e imprime por pantalla el resultado segun su clasificacion
if (mes==12 and dia >=21) or mes==1 or mes==2 or (mes==3 and dia<21):
    if hemisferio==1:
        print ("Usted se encuentra en invierno.")
    elif hemisferio ==2:
        print ("Usted se encuentra en verano.")
elif (mes==3 and dia >=21) or mes==4 or mes==5 or (mes==6 and dia<21):
    if hemisferio ==1:
        print ("Usted se encuentra en primavera.")
    elif hemisferio ==2:
        print ("Usted se encuentra en otoño.")
elif (mes==6 and dia >=21) or mes==7 or mes==8 or (mes==9 and dia<21):
    if hemisferio ==1:
        print ("Usted se encuentra en verano.")
    elif hemisferio ==2: 
        print ("Usted se encuentra en invierno.")
elif (mes==9 and dia >=21) or mes==10 or mes==11 or (mes==12 and dia<21):
    if hemisferio ==1:
        print ("Usted se encuentra en otoño.")
    elif hemisferio ==2:
        print ("Usted se encuentra en primavera.")