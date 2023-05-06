package com.andreiosgf.ejemploarreglos;
import java.util.Arrays;
import java.util.Random;

public class EjemploArreglos {

    private double[] arreglo;

    public EjemploArreglos(int n) {
        arreglo = new double[n];
    }

    public void llenarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 10;
        }
    }

    public void imprimirArreglo() {
        System.out.print("Arreglo: ");
        for (double elem : arreglo) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public double[] devolverArreglo() {
        return arreglo;
    }

    public double obtenerElementoMaximo() {
        double maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }

    public double obtenerElementoMinimo() {
        double minimo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        return minimo;
    }

    public double sumarArreglo() {
        double suma = 0;
        for (double elem : arreglo) {
            suma += elem;
        }
        return suma;
    }

    public double[] sumarArreglos(double[] otroArreglo) {
        if (arreglo.length != otroArreglo.length) {
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud");
        }
        double[] resultado = new double[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[i] + otroArreglo[i];
        }
        return resultado;
    }

    public double calcularProductoPunto(double[] otroArreglo) {
        if (arreglo.length != otroArreglo.length) {
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud");
        }
        double resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i] * otroArreglo[i];
        }
        return resultado;
    }

    public void ordenarArreglo() {
        Arrays.sort(arreglo);
    }

    public double calcularMedia() {
        double suma = sumarArreglo();
        return suma / arreglo.length;
    }

    public static void main(String[] args) {
        EjemploArreglos arre = new EjemploArreglos(5);
        arre.llenarArreglo();
        arre.imprimirArreglo();

        double[] otroArreglo = {1.0, 2.0, 3.0, 4.0, 5.0};

        System.out.println("Elemento máximo: " + arre.obtenerElementoMaximo());
        System.out.println("Elemento mínimo: " + arre.obtenerElementoMinimo());
        System.out.println("Suma del arreglo: " + arre.sumarArreglo());
        System.out.println("Resultado de la suma de arreglos: " + Arrays.toString(arre.sumarArreglos(otroArreglo)));
        System.out.println("Producto punto: " + arre.calcularProductoPunto(otroArreglo));
        arre.ordenarArreglo();

System.out.print("Arreglo ordenado: ");
arre.imprimirArreglo();
System.out.println("Media del arreglo: " + arre.calcularMedia());
}
}

//-----------------------------------Parte 2
public class EjercicioMatrices {
    private double[][] matriz; // Se define un atributo matriz de tipo double

    public void crearMatriz() {
        Scanner input = new Scanner(System.in); // Se crea un objeto de la clase Scanner para solicitar datos al usuario
        System.out.print("Ingrese el número de filas: "); // Se solicita al usuario el número de filas de la matriz
        int filas = input.nextInt();
        System.out.print("Ingrese el número de columnas: "); // Se solicita al usuario el número de columnas de la matriz
        int columnas = input.nextInt();

        matriz = new double[filas][columnas]; // Se inicializa la matriz con las dimensiones indicadas por el usuario
        Random rand = new Random(); // Se crea un objeto de la clase Random para generar números aleatorios
        for (int i = 0; i < filas; i++) { // Se recorre la matriz por filas
            for (int j = 0; j < columnas; j++) { // Se recorre la matriz por columnas
                matriz[i][j] = rand.nextDouble(); // Se asigna un número aleatorio entre 0 y 1 a cada elemento de la matriz
            }
        }
    }

    public void imprimirMatriz() {
        for (double[] fila : matriz) { // Se recorre la matriz por filas utilizando un for each
            for (double elemento : fila) { // Se recorre cada fila de la matriz utilizando otro for each
                System.out.print(elemento + " "); // Se imprime cada elemento de la matriz separado por un espacio en blanco
            }
            System.out.println(); // Se imprime una línea en blanco para separar las filas de la matriz
        }
    }

    public double getMaximo() {
        double max = matriz[0][0]; // Se inicializa el máximo con el primer elemento de la matriz
        for (double[] fila : matriz) { // Se recorre la matriz por filas utilizando un for each
            for (double elemento : fila) { // Se recorre cada fila de la matriz utilizando otro for each
                if (elemento > max) { // Si el elemento actual es mayor que el máximo encontrado hasta ahora
                    max = elemento; // Se actualiza el valor máximo
                }
            }
        }
        return max; // Se devuelve el valor máximo encontrado
    }

    public double getMinimo() {
        double min = matriz[0][0]; // Se inicializa el mínimo con el primer elemento de la matriz
        for (double[] fila : matriz) { // Se recorre la matriz por filas utilizando un for each
            for (double elemento : fila) { // Se recorre cada fila de la matriz utilizando otro for each
                if (elemento < min) { // Si el elemento actual es menor que el mínimo encontrado hasta ahora
                    min = elemento; 
                }
            }
        }
        return min; // Se devuelve el valor mínimo encontrado
    }

    public double[][] getMatriz() { // Se crea un método para devolver la matriz
        return matriz; 
    }

    public EjercicioMatrices sumarMatrices(EjercicioMatrices otraMatriz) { // Se crea un método para sumar dos matrices
        double[][] otra = otraMatriz.getMatriz(); // Se obtiene la matriz a sumar mediante el método getMatriz()
        int filas = matriz.length; // Se obtiene el número de filas del arreglo 
    }
}