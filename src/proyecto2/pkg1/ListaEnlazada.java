package proyecto2.pkg1;

public class ListaEnlazada {
    public Nodo primerNodo;
    
    public void agregarElemento(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            Nodo ultimoNodo = primerNodo;
            while (ultimoNodo.siguiente != null) {
                ultimoNodo = ultimoNodo.siguiente;
            }
            ultimoNodo.siguiente = nuevoNodo;
        }
    }
    
    public int obtenerMayor() {
        if (primerNodo == null) {
            return Integer.MIN_VALUE;
        } else {
            int mayor = primerNodo.valor;
            Nodo nodoActual = primerNodo.siguiente;
            while (nodoActual != null) {
                if (nodoActual.valor > mayor) {
                    mayor = nodoActual.valor;
                }
                nodoActual = nodoActual.siguiente;
            }
            return mayor;
        }
    }
}
