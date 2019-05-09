package juan.com;

import javax.ejb.Stateless;
import juan.com.modelo.Arbol;

/**
 * @author juan
 */
@Stateless
public class ArbolStateless {

    private Arbol arbol;

    public ArbolStateless() {
        arbol = new Arbol();
        arbol.agregar(70);
        arbol.agregar(84);
        arbol.agregar(85);
        arbol.agregar(78);
        arbol.agregar(80);
        arbol.agregar(76);
        arbol.agregar(49);
        arbol.agregar(54);
        arbol.agregar(51);
        arbol.agregar(37);
        arbol.agregar(40);
        arbol.agregar(37);
        arbol.agregar(22);
    }

    public Arbol getArbol() {
        return arbol;
    }

    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }
}
