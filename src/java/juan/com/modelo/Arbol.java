package juan.com.modelo;

/**
 *
 * @author juan
 */
public class Arbol {

    private Nodo raiz;
    
    public void agregar(Integer value) {
        raiz = agregar(raiz, value);
    }

    public Nodo agregar(Nodo nodo, Integer valor) {
        if (nodo == null) {
            return new Nodo(valor, null, null);
        }

        if (valor < nodo.getValor()) {
            nodo.setIzquierda(agregar(nodo.getIzquierda(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDerecha(agregar(nodo.getDerecha(), valor));
        } else {
            return nodo;
        }

        return nodo;
    }
    
    public Nodo ancestor(Nodo nodo, Integer valor1, Integer valor2) {
        if(nodo == null) {
            return null;
        }
        
        if(buscar(nodo, valor1) == null) {
            return null;
        }
        
        if(buscar(nodo, valor2) == null) {
            return null;
        }
        
        if(nodo.getValor() > valor1 && nodo.getValor() > valor2) {
            return ancestor(nodo.getIzquierda(), valor1, valor2);
        }
        
        if(nodo.getValor() < valor1 && nodo.getValor() < valor2) {
            return ancestor(nodo.getDerecha(), valor1, valor2);
        }
        
        return nodo;
    }
    
    public Nodo buscar(Nodo nodo, Integer valor) {
        if (nodo != null) {
            if (valor.equals(nodo.getValor())) {
                return nodo;
            } else {
                return valor < nodo.getValor() ? buscar(nodo.getIzquierda(), valor) : buscar(nodo.getDerecha(), valor);
            }
        }
        return null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
