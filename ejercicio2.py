import random

def sumar():
    print ('Suma')
    n = int(input("Dame el valor de x:\n"))
    sumar_15 = lambda x: x + 15
    resultado = sumar_15(n)
    print(resultado)

def multiplicar():
    print ('Multiplicar')
    x = int(input("Dame el valor de x:\n"))
    y = int(input("Dame el valor de y:\n"))
    multiplicar = lambda x, y: x * y
    resultado1 = multiplicar(x,y)
    print(resultado1)

def dividir ():
    print('Dividir')
    n=int(input(("Ingrese el valor de x: \n"))) 
    y=random.randint(1,10)
    dividir= lambda x,y: x/y
    resultado=dividir(n,y)
    print(resultado)


def main():
    sumar()
    multiplicar()
    dividir()

if __name__=="__main__":
    main()