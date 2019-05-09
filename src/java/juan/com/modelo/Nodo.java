package juan.com.modelo;

/**
 *
 * @author juan
 */
public class Nodo {
    
    private Integer valor;
    private Nodo derecha;
    private Nodo izquierda;

    public Nodo(Integer valor, Nodo derecha, Nodo izquierda) {
        this.valor = valor;
        this.derecha = derecha;
        this.izquierda = izquierda;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    
}
