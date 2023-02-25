package proyecto2.pkg1;

public class Proyecto2 {
   /*
    2. Ingresar a una lista enlazada simple n elementos y calcular cual es el mayor de la 
    lista. Imprimir el número mayor y luego la lista.
    */
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarElemento(95);
        lista.agregarElemento(85);
        lista.agregarElemento(75);
        lista.agregarElemento(96);
        lista.agregarElemento(85);
        lista.agregarElemento(92);
        lista.agregarElemento(74);
        lista.agregarElemento(91);

    
        Nodo nodoActual = lista.primerNodo;
        while (nodoActual != null) {
            System.out.print(nodoActual.valor + " ");
            nodoActual = nodoActual.siguiente;
        }
        int mayor = lista.obtenerMayor();
        System.out.println("El número mayor es: " + mayor);
    }
}
