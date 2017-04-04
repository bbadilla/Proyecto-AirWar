/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 * @author Bryan
 */
public class Nodo {
    // Variable en la cual se va a guardar el valor.
    private Enemigos enemigo;
    // Variable para enlazar los nodos.
    private Nodo siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void nodo()
    {
        this.enemigo = enemigo;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public Enemigos getValor() {
        return enemigo;
    }

    public void setValor(Enemigos valor) {
        this.enemigo = enemigo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
}