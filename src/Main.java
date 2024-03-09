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

}