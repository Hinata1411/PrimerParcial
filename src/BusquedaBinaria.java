public class BusquedaBinaria {

    int BusquedaBin(int miarray[], int datoabuscar) {

        int inicio = 0;

        int totaldeDatos = miarray.length - 1;

        //Inicio menor o igual al total de datos
        while (inicio <= totaldeDatos) {

            //Lo divide en 2
            int m = inicio + (totaldeDatos - inicio) / 2;

            //Si es igual
            if (miarray[m] == datoabuscar) {
                return m;
            } //Si es menor
            if (miarray[m] < datoabuscar) {
                inicio = m + 1;
            } else { //Si es mayor
                totaldeDatos = m - 1;
            }
        } return -1; //Si no está o no existe
    }
}
