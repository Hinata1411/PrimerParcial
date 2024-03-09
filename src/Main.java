import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("        BÚSQUEDA BINARIA        ");
        int miarray[] = {1, 2, 3, 4, 10, 6, 5, 8, 9, 7};
        BusquedaBinaria buscarBin = new BusquedaBinaria(); //Instancia
        System.out.println("El arreglo original es: " + Arrays.toString(miarray)); //Arreglo original en consola
        Arrays.sort(miarray); //Arreglo ordenado
        System.out.println("Arreglo ordenado: " + Arrays.toString(miarray)); //Arreglo ordenado en consola
        System.out.println("Ingrese el número a buscar en el arreglo: ");
        Scanner sr = new Scanner(System.in);
        int buscar = sr.nextInt();
        int resultadoBin = buscarBin.BusquedaBin(miarray, buscar);
        if(resultadoBin == -1)
            System.out.println("El número ingresado no se encuentra dentro de la lista de datos");
        else
            System.out.println("El número a buscar por búsqueda Binaria esta en el indice " + resultadoBin);

    }


    public static void main2(String[] args) {

        SuperGangas nuevo = new SuperGangas(20);
        int valor;
        int opcion;

        do {
            System.out.println("Elija la opción");
            System.out.println("1. Agregar electrodoméstico");
            System.out.println("2. Eliminar electrodoméstico");

            System.out.println("Ingrese la opción deseada");
            opcion = obtenerEntero();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese el electrodoméstico a comprar: ");
                    valor = obtenerEntero();
                    nuevo.enqueue(valor);
                    break;
                case 2:
                    System.out.print("Ingrese el electródoméstico que desea eliminar");
                    valor = obtenerEntero();
                    nuevo.dequeue();
                    break;

                default:
                    System.out.println("Opción no válida. Ingrese un dato válido.");
                    break;
            }

        } while (opcion != 0);
    }

    private static int obtenerEntero() {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            return scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error");
            System.out.println("Por favor ingrese un electrodoméstico valido");
            return 0;
        }

    }

}