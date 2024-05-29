

import java.util.Scanner;

public class MenuInteractivo {
    public static void sumas(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    }
    public static void Resta(Scanner scanner){
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int resta = num1 - num2;
        System.out.println("La resta de " + num1 + " y " + num2 + " es " + resta);
    }
    public static void Multiplicacion(Scanner scanner){
        System.out.print("Ingrese un numero");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero");
        double num2 = scanner.nextDouble();
        double multiplicacion = num1 * num2;
        System.out.print("La multiplicacion de " + num1 + " y " + num2 + " es " + multiplicacion);
    }
    public static void division(Scanner scanner){
        System.out.print("Ingrese un numero");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero");
        double num2 = scanner.nextDouble();
        double division = num1 / num2;
        System.out.print("La division de " + num1 + " y " + num2 + " es " + division);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostramos el menú
            System.out.println("Menú:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            // Leemos la opción ingresada por el usuario
            opcion = scanner.nextInt();

            // Limpia el buffer después de leer el número
            scanner.nextLine();

            // Procesamos la opción
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opción 1(Suma).");
                    sumas(scanner);
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2.");
                    Resta(scanner);
                    break;
                case 3:
                    System.out.println("Has elegido la opción 3.");
                    Multiplicacion(scanner);
                    break;
                case 4:
                    System.out.println("Has elegido la opcion 4");
                    division(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del menu");
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        } while (opcion != 5);

        // Cerramos el scanner al salir del bucle
        scanner.close();
    }
}
