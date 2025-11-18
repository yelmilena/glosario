package GLOSARIO;

public class Corazon {
        public static void main(String[] args) {
        int size = 10; // Tamaño del corazón

        // Dibujar la parte superior del corazón
        for (int i = size / 2; i <= size; i += 2) {
            // Espacios en blanco antes de la primera "X"
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            // Primera "X"
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            // Espacios en blanco entre las dos "X"
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Segunda "X"
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        // Dibujar la parte inferior del corazón
        for (int i = size; i >= 1; i--) {
            // Espacios en blanco antes de la "X"
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            // "X" para la parte inferior
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}


    

