package GLOSARIO;


    import java.util.ArrayList;
import java.util.Scanner;

class Piercing {
    private String tipo;
    private String ubicacion;
    private double precio;

    public Piercing(String tipo, String ubicacion, double precio) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Ubicación: " + ubicacion + ", Precio: $" + precio;
    }
}

public class EstudioPiercing {
    private ArrayList<Piercing> piercings = new ArrayList<>();

    public void agregarPiercing(String tipo, String ubicacion, double precio) {
        piercings.add(new Piercing(tipo, ubicacion, precio));
        System.out.println("Piercing agregado con éxito.");
    }

    public void listarPiercings() {
        if (piercings.isEmpty()) {
            System.out.println("No hay piercings registrados.");
        } else {
            for (Piercing p : piercings) {
                System.out.println(p);
            }
        }
    }

    public void buscarPorTipo(String tipo) {
        boolean encontrado = false;
        for (Piercing p : piercings) {
            if (p.getTipo().equalsIgnoreCase(tipo)) {
                System.out.println(p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron piercings del tipo: " + tipo);
        }
    }

    public static void main(String[] args) {
        EstudioPiercing estudio = new EstudioPiercing();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar Piercing");
            System.out.println("2. Listar Piercings");
            System.out.println("3. Buscar por Tipo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tipo de piercing: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingrese la ubicación: ");
                    String ubicacion = scanner.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();
                    estudio.agregarPiercing(tipo, ubicacion, precio);
                    break;
                case 2:
                    estudio.listarPiercings();
                    break;
                case 3:
                    System.out.print("Ingrese el tipo de piercing a buscar: ");
                    String tipoBusqueda = scanner.nextLine();
                    estudio.buscarPorTipo(tipoBusqueda);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
    

