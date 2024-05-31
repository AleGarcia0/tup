import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exmane {
    public static void main(String[] args) {
        ArrayList<String> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del vehículo a agregar: ");
                    String nombreVehiculo = scanner.nextLine();
                    agregarVehiculo(vehiculos, nombreVehiculo);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del vehículo a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    buscarVehiculo(vehiculos, nombreBuscar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del vehículo a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    eliminarVehiculo(vehiculos, nombreEliminar);
                    break;
                case 4:
                    listarVehiculos(vehiculos);
                    break;
                case 5:
                    ordenarVehiculos(vehiculos);
                    break;
                case 6:
                    System.out.print("Ingrese el índice del vehículo a editar: ");
                    int indiceEditar = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea después de leer el entero
                    System.out.print("Ingrese el nuevo nombre del vehículo: ");
                    String nuevoNombre = scanner.nextLine();
                    editarVehiculo(vehiculos, indiceEditar, nuevoNombre);
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
        System.out.println("GESTIÓN DE VENTA DE VEHÍCULOS - MENÚ DE OPCIONES");
        System.out.println("==================================");
        System.out.println("1. Agregar vehículo");
        System.out.println("2. Buscar vehículo");
        System.out.println("3. Eliminar vehículo");
        System.out.println("4. Listar vehículos");
        System.out.println("5. Ordenar vehículos alfabéticamente");
        System.out.println("6. Editar vehículo por índice");
        System.out.println("7. Salir");
        System.out.println("==================================");
    }

    private static void agregarVehiculo(ArrayList<String> vehiculos, String nombreVehiculo) {
        vehiculos.add(nombreVehiculo);
        System.out.println("Vehículo agregado exitosamente.");
    }

    private static void buscarVehiculo(ArrayList<String> vehiculos, String nombreBuscar) {
        int indice = vehiculos.indexOf(nombreBuscar);
        if (indice != -1) {
            System.out.println("El vehículo se encuentra en la posición: " + (indice + 1));
        } else {
            System.out.println("El vehículo no se encuentra en la lista.");
        }
    }

    private static void eliminarVehiculo(ArrayList<String> vehiculos, String nombreEliminar) {
        if (vehiculos.remove(nombreEliminar)) {
            System.out.println("Vehículo eliminado exitosamente.");
        } else {
            System.out.println("El vehículo no se encuentra en la lista.");
        }
    }

    private static void listarVehiculos(ArrayList<String> vehiculos) {
        System.out.println("Listado de vehículos:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i));
        }
    }

    private static void ordenarVehiculos(ArrayList<String> vehiculos) {
        Collections.sort(vehiculos);
        System.out.println("Vehículos ordenados alfabéticamente.");
    }

    private static void editarVehiculo(ArrayList<String> vehiculos, int indiceEditar, String nuevoNombre) {
        if (indiceEditar >= 1 && indiceEditar <= vehiculos.size()) {
            vehiculos.set(indiceEditar - 1, nuevoNombre);
            System.out.println("Vehículo editado exitosamente.");
        } else {
            System.out.println("Índice fuera de rango. No se pudo editar el vehículo.");
        }
    }
}
