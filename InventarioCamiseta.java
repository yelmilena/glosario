package GLOSARIO;


    import java.util.Scanner;

	public class InventarioCamiseta {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo"};
	        int[] stock = new int[4]; // Índices: 0=Rojo, 1=Azul, etc.

	        System.out.println("=== INVENTARIO DE CAMISETAS ===");

	        // 1. Registrar cantidades por color
	        for (int i = 0; i < colores.length; i++) {
	            System.out.print("Ingrese la cantidad de camisetas " + colores[i] + ": ");
	            stock[i] = scanner.nextInt();
	        }

	        // 2. Mostrar total en stock
	        int total = calcularTotal(stock);
	        System.out.println("\nTotal de camisetas en stock: " + total);

	        // 3. Mostrar color con más unidades
	        String colorMayor = obtenerColorMayorStock(colores, stock);
	        System.out.println("Color con más stock: " + colorMayor);

	        scanner.close();
	    }

	    // Método para calcular el total
	    public static int calcularTotal(int[] stock) {
	        int suma = 0;
	        for (int cantidad : stock) {
	            suma += cantidad;
	        }
	        return suma;
	    }

	    // Método para encontrar el color con más stock
	    public static String obtenerColorMayorStock(String[] colores, int[] stock) {
	        int maxIndex = 0;
	        for (int i = 1; i < stock.length; i++) {
	            if (stock[i] > stock[maxIndex]) {
	                maxIndex = i;
	            }
	        }
	        return colores[maxIndex];
	    }
	}
    

