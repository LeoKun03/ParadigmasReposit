#-------------------------Declaracion de la clase calculadora
class Calculadora:
    def __init__(self, a, b):
        self.a = a
        self.b = b
        self.resultado = 0

    def suma(self):
        self.resultado = self.a + self.b

    def resta(self):
        self.resultado = self.a - self.b

    def multiplicacion(self):
        self.resultado = self.a * self.b

    def division(self):
        self.resultado = self.a / self.b

    def modulo(self):
        self.resultado = self.a % self.b
#-------------------------Inicializacion de variables
#Tipo de dato entero
a= 10
b= 5
#Tipo de dato flotante
c= 3.1415926535897
d= 2.7182818284590
#Tipo de dato double
e= 314159265358979323846264338327950288419716939937510582097494459
f= 271828182845904523536028747135266249775724709369995957496696762

#-------------------------Llamada a las funciones en los enteros
resultadoEnteros= Calculadora(a,b)

resultadoEnteros.suma()
print(f"Los enteros para hacer operaciones son: {a} y {b}\n")
print(f"La suma es igual a: {resultadoEnteros.resultado}")
resultadoEnteros.resta()
print(f"La resta es igual a: {resultadoEnteros.resultado}")
resultadoEnteros.multiplicacion()
print(f"La multiplicacion es igual a: {resultadoEnteros.resultado}")
resultadoEnteros.division()
print(f"La division es igual a: {resultadoEnteros.resultado}")
resultadoEnteros.modulo()
print(f"El modulo es igual a: {resultadoEnteros.resultado}")

#-------------------------Llamada de las funciones en los flotantes
resultadoFlotantes= Calculadora(c,d)

resultadoFlotantes.suma()
print(f"Los flotantes para hacer operaciones son: {c} y {d}\n")
print(f"La suma es igual a: {resultadoFlotantes.resultado}")
resultadoFlotantes.resta()
print(f"La resta es igual a: {resultadoFlotantes.resultado}")
resultadoFlotantes.multiplicacion()
print(f"La multiplicacion es igual a: {resultadoFlotantes.resultado}")
resultadoFlotantes.division()
print(f"La division es igual a: {resultadoFlotantes.resultado}")
resultadoFlotantes.modulo()
print(f"El modulo es igual a: {resultadoFlotantes.resultado}")

#-------------------------Llamada de las funciones en los double

resultadoDouble= Calculadora(e,f)

resultadoDouble.suma()
print(f"Los double para hacer operaciones son: {e} y {f}\n")
print(f"La suma es igual a: {resultadoDouble.resultado}")
resultadoDouble.resta()
print(f"La resta es igual a: {resultadoDouble.resultado}")
resultadoDouble.multiplicacion()
print(f"La multiplicacion es igual a: {resultadoDouble.resultado}")
resultadoDouble.division()
print(f"La division es igual a: {resultadoDouble.resultado}")
resultadoDouble.modulo()
print(f"El modulo es igual a: {resultadoDouble.resultado}")