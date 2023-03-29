#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
#define num 1000
int buscar(int*, int);
void ordenamiento_burbuja(int * );
void genera(int i,int *arreglo);

int main(){
    int arreglo[10];
    int i;
    int numerobus;
    // para almacenar el tiempo de ejecución del código
    double time_spent = 0.0;
    clock_t begin = clock();
    genera( i,arreglo);
    printf("\ningrese el numero a buscar ");
    scanf("%d", &numerobus);
    int resultado = buscar(arreglo, numerobus);
    printf("La posición del número %d es: %d\n", numerobus, resultado);
    ordenamiento_burbuja( arreglo);
    printf("el orden es ");
    for(i=0;i<num;i++){
        printf("%d, ",arreglo[i]);
    }
    clock_t end = clock();
    time_spent += (double)(end - begin) / CLOCKS_PER_SEC;
    printf("el tiempo de ejecucion total del programa %f segundos", time_spent);
}
//numeros a buscar
int buscar(int* arreglo, int numerobus){
    int i;
    for (i = 0; i < num; i++)
    {
        if (arreglo[i] == numerobus)
        return i+1; // se devuelve la posición en la que se encuentra el número buscado
    }
    return -1; // si el número no se encuentra en el arreglo, se devuelve -1
}
// ordenamiento de busbuja 
void ordenamiento_burbuja(int arreglo[]){
    int i, j;
    for (i = 0; i < num; i++) {
        for (j = 0; j < num - i - 1; j++) {
            if (arreglo[j] > arreglo[j+1]) {
                // intercambiar arr[j] y arr[j+1]
                int temp = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = temp;
            }
        }
    }
}
void genera(int i,int *arreglo){
    int i;
    srand(time(NULL)); // Sembramos rand() con una semilla aleatoria
    for (i = 0; i < num; i++) {
        arreglo[i] = rand()%1000; // Generamos un número aleatorio y lo almacenamos en el arreglo
    }
    printf("\nLos numeros aleatorios generados son: \n");
    for (i = 0; i < num ; i++) {
        printf("%d ", arreglo[i]); // Imprimimos cada número generado en el arreglo
    }
}
