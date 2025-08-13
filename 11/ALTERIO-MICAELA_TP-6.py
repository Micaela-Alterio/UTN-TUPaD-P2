#EJERCICIO 1

#Funcion recursiva que calcula el factorial de un numero.

def factorial (n):
    if n==0 or n==1:
        return 1
    else:
        return n * factorial (n-1)

#Programa que calcula el factorial de todos los numeros entre 1 y el número que indique el usuario
    
numero=int(input("Ingrese un numero:"))

for x in range (1, numero+1):
    print (factorial (x))


#///////////////////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 2:

#Funcion recursiva que calcula el valor de la serie de Fibonacci en la posición indicada.

def fibonacci (n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return fibonacci (n-1) + fibonacci (n-2)
        
#Programa que muestra la serie completa hasta la posición que el usuario indique.        
        
numero=int(input("Ingrese un numero:"))        
        
for x in range (0, numero +1):
    print (fibonacci(x))
    

#////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 3:

#Función recursiva que calcule la potencia de un número base elevado a un exponente

def pot (base,exp):
    if exp==0:
        return 1
    else:
        return base * pot (base, exp - 1)

#Programa que calcula la potencia de un numero ingresado por el usuario por
#un exponente tambien ingresado por el usuario

numero=int(input("Ingrese un numero:"))
exponente=int(input("Ingrese otro numero:"))

print (f"El numero {numero}, elevado a {exponente} es: {pot(numero,exponente)}")


#///////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 4:

#Funcion recursiva que calcula el numero binario correspondiente a un numero con base decimal 
def binario (n):
    if n==0:
        return ""
    else:
        return binario (n // 2) + str(n % 2)

#Programa que calcula el numero binario de un numero decimal ingresado por el usuario

numero=int(input("Ingrese un numero con base decimal:"))

print (f"El numero {numero} convertido a binario es: {binario(numero)}")


#//////////////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 5:

#Funcion recursiva que determina si una palabra es un palindromo

def es_palindromo(palabra):
    if len(palabra) <= 1:
        return True
    if palabra[0] != palabra[-1]:
        return False
    return es_palindromo(palabra[1:-1])    

#Programa que evalua si una palabra ingresada por el usuario es o no es un palindromo

palabra=input("Ingrese una palabra:")

if es_palindromo(palabra)==True:
    print (f"La palabra {palabra} es palindromo")
else:
    print (f"La palabra {palabra} no es palindromo")
    

#///////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 6:

#Funcion recursiva que que recibe un número ingresado por el usuario y devuelve
#la suma de todos sus dígitos.

def suma_digitos(n):
    if n < 10:
        return n
    else:
        return n % 10 + suma_digitos(n // 10)
    
numero=int(input("Ingrese un numero:"))

print(f"La suma de todos los digitos de {numero} es: {suma_digitos(numero)}")


#/////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 7:

#Funcion recursiva que calcula la cantidad de bloques necesarios para armar una piramide,
#teniendo en cuenta que el numero ingresado por el usuario es la base

def bloques(n):
    if n == 1:
        return 1
    else:
        return n + bloques(n - 1)
    
cantidad=int(input("Ingrese la cantidad de bloques:"))

print(f"El total de bloques necesarios para construir la piramide es: {bloques(cantidad)}")


#////////////////////////////////////////////////////////////////////////////////////////////////


#EJERCICIO 8:

#Funcion recursiva que que recibe un número y un dígito y devuelva cuántas veces
#aparece ese dígito dentro del número.

def contar_digito(numero, digito):
    if numero == 0:
        return 0
    else:
        ultimo = numero % 10
        if ultimo == digito:
            return 1 + contar_digito(numero // 10, digito)
        else:
            return contar_digito(numero // 10, digito)
        

numero=int(input("Ingrese un numero: "))
digito=int(input("Ingrese un numero del 0 al 9:"))

print (f"La cantidad de veces que {digito} aparece en {numero} es: {contar_digito(numero,digito)}")