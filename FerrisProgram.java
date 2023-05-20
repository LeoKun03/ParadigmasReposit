import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class FerrisProgram {
    private static final int CAPACITY = 10;
    private static Stack<String> portos = new Stack<>();
    private static Queue<String> celebrian = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("exit")) {
            System.out.println("Ingrese la matrícula del auto (o 'exit' para salir):");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("exit")) {
                System.out.println("¿En cuál ferri irá? (P - Portos, C - Celebrian):");
                String ferry = scanner.nextLine().toUpperCase();
                if (ferry.equals("P")) {
                    insertIntoPortos(input);
                } else if (ferry.equals("C")) {
                    insertIntoCelebrian(input);
                } else {
                    System.out.println("Opción inválida.");
                }
                printFerrisContent();
            }
        }

        simulateJourney();
    }

    private static void insertIntoPortos(String licensePlate) {
        if (portos.size() >= CAPACITY) {
            System.out.println("El ferri Portos está lleno.");
        } else {
            portos.push(licensePlate);
        }
    }

    private static void insertIntoCelebrian(String licensePlate) {
        if (celebrian.size() >= CAPACITY) {
            System.out.println("El ferri Celebrian está lleno.");
        } else {
            celebrian.add(licensePlate);
        }
    }

    private static void simulateJourney() {
        System.out.println("\nIniciando viaje...");

        while (!portos.isEmpty()) {
            String licensePlate = portos.pop();
            System.out.println("Auto saliendo de Portos: " + licensePlate);
            printFerrisContent();
        }

        while (!celebrian.isEmpty()) {
            String licensePlate = celebrian.poll();
            System.out.println("Auto saliendo de Celebrian: " + licensePlate);
            printFerrisContent();
        }

        System.out.println("\nViaje completado.");
    }

    private static void printFerrisContent() {
        System.out.println("\nContenido de Portos:");
        if (portos.isEmpty()) {
            System.out.println("Vacio");
        } else {
            for (String licensePlate : portos) {
                System.out.println(licensePlate);
            }
        }

        System.out.println("\nContenido de Celebrian:");
        if (celebrian.isEmpty()) {
            System.out.println("Vacio");
        } else {
            for (String licensePlate : celebrian) {
                System.out.println(licensePlate);
            }
        }
    }
}
