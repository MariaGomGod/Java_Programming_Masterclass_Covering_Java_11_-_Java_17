public class BinarySearch {

     int find(int numberToSearch, int[] array) {
         if (array == null || array.length == 0) { // comprobamos si el array es nulo o está vacío
             return -1;
         }

         return find(numberToSearch, array, 0, array.length - 1);
     }

     private int find(int numberToSearch, int[] array, int left, int right) {
         if (right - left == 0) { // implementación para una única casilla
             if (numberToSearch == array[right]) {
                 return right;
             } else {
                 // Devolvemos -1 ya que significaría que el número a buscar no se encuentra en el array.
                 // Devolvemos -1, pues la primera posición válida dentro de un array es el 0, independientemente
                 // de la longitud del array
                 return -1;
             }
         } else { // caso en el que tengamos que partir la porción de array que tenemos por la mitad
             int mid = (right + left) / 2; // estamos calculando la media aritmética de las dos posiciones
             // que delimitan la porción del array
             int midValue = array[mid];

             if (numberToSearch == midValue) {
                 return mid;
             } else if (numberToSearch > midValue) {
                 return find(numberToSearch, array, mid + 1, right);
             } else {
                 return find(numberToSearch, array, left, mid - 1);
             }
         }
     }
}
