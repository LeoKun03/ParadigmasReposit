import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc objCalc = new Calc();
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 13) {
            System.out.println("\n Bienvenido a la mejor calculadora del mundo calculador\n");
            System.out.println("\n\nSelecciona una opción:");
            System.out.println("1. Suma entera");
            System.out.println("2. Suma float");
            System.out.println("3. Suma double");
            System.out.println("4. Resta entera");
            System.out.println("5. Resta float");
            System.out.println("6. Resta double");
            System.out.println("7. Multiplicación entera");
            System.out.println("8. División double");
            System.out.println("9. Multiplicar float");
            System.out.println("10. Multiplicar double");
            System.out.println("11. Dividir float");
            System.out.println("12. Dividir double");
            System.out.println("13. Salir");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    int suma = objCalc.suma();
                    System.out.println("\n\nEl resultado de la suma entera es: " + suma);
                    break;
                case 2:
                    float sumaf = objCalc.sumaf();
                    System.out.println("\n\nEl resultado de la suma float es: " + sumaf);
                    break;
                case 3:
                    double sumadou = objCalc.sumadou();
                    System.out.println("\n\nEl resultado de la suma con double es: " + sumadou);
                    break;
                case 4:
                    int resta = objCalc.resta();
                    System.out.println("\n\nEl resultado de la resta es: " + resta);
                    break;
                case 5:
                    float restaf = objCalc.restaf();
                    System.out.println("\n\nEl resultado de la resta flotante es: " + restaf);
                    break;
                case 6:
                    double restadou = objCalc.restadou();
                    System.out.println("\n\nEl resultado de la resta double es: " + restadou);
                    break;
                case 7:
                    int multiplicacion = objCalc.multiplicacion();
                    System.out.println("\n\nEl resultado de la multiplicación con algoritmo es: " + multiplicacion);
                    break;
                case 8:
                    double division = objCalc.division();
                    System.out.println("\n\nEl resultado de la división double es: " + division);
                    break;
                case 9:
                    float multiplicar = objCalc.multiplicar();
                    System.out.println("\n\nEl resultado de multiplicar es: " + multiplicar);
                    break;
                case 10:
                    double multiplicardou = objCalc.multiplicardou();
                    System.out.println("\n\nEl resultado de multiplicar double es: " + multiplicardou);
                    break;
                case 11:
                    float dividir = objCalc.dividir();
                    System.out.println("\n\nEl resultado de dividir es: " + dividir);
                    break;
                case 12:
                    double dividirdou = objCalc.dividirdou();
                    System.out.println("\n\nEl resultado de dividir double es: " + dividirdou);
                    break;
                case 13:
                    System.out.println("\n\nGracias por usar la mejor calculadora del mundo calculador :D!");
                    break;
            }
        }
    }
}