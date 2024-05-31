import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class biblioteca {
    private static ArrayList<String> libros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero
            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    buscarLibro();
                    break;
                case 3:
                    eliminarLibro();
                    break;
                case 4:
                    listarLibros();
                    break;
                case 5:
                    ordenarLibros();
                    break;
                case 6:
                    editarLibro();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("==================================");
        System.out.println("BIBLIOTECA - MENÚ DE OPCIONES");
        System.out.println("==================================");
        System.out.println("1. Agregar libro");
        System.out.println("2. Buscar libro");
        System.out.println("3. Eliminar libro");
        System.out.println("4. Listar libros");
        System.out.println("5. Ordenar libros alfabéticamente");
        System.out.println("6. Editar libro indicando índice");
        System.out.println("7. Salir");
        System.out.println("==================================");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarLibro() {
        System.out.print("Ingrese el nombre del libro a agregar: ");
        String nombreLibro = scanner.nextLine();
        libros.add(nombreLibro);
        System.out.println("Libro agregado exitosamente.");
    }

    private static void buscarLibro() {
        System.out.print("Ingrese el nombre del libro a buscar: ");
        String nombreBuscar = scanner.nextLine();
        int indice = libros.indexOf(nombreBuscar);
        if (indice != -1) {
            System.out.println("El libro se encuentra en la posición: " + (indice + 1));
        } else {
            System.out.println("El libro no se encuentra en la lista.");
        }
    }

    private static void eliminarLibro() {
        System.out.print("Ingrese el nombre del libro a eliminar: ");
        String nombreEliminar = scanner.nextLine();
        if (libros.remove(nombreEliminar)) {
            System.out.println("Libro eliminado exitosamente.");
        } else {
            System.out.println("El libro no se encuentra en la lista.");
        }
    }

    private static void listarLibros() {
        System.out.println("Listado de libros:");
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i));
        }
    }

    private static void ordenarLibros() {
        Collections.sort(libros);
        System.out.println("Libros ordenados alfabéticamente.");
    }

    private static void editarLibro() {
        System.out.print("Ingrese el índice del libro a editar: ");
        int indiceEditar = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de leer el entero
        if (indiceEditar >= 1 && indiceEditar <= libros.size()) {
            System.out.print("Ingrese el nuevo nombre del libro: ");
            String nuevoNombre = scanner.nextLine();
            libros.set(indiceEditar - 1, nuevoNombre);
            System.out.println("Libro editado exitosamente.");
        } else {
            System.out.println("Índice fuera de rango. No se pudo editar el libro.");
        }
    }
}
