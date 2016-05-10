/*
 * Entidad lista de profesores
 */
package profes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usu21
 */
public class ListaProfesores implements Serializable {
    
        private ArrayList<Profesor> lista;

    public ListaProfesores() {
        lista = new ArrayList<>();
    }
        
    public void altaProfesor(Profesor p){
        lista.add(p);
    }
        

    public ArrayList<Profesor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Profesor> lista) {
        this.lista = lista;
    }

    
}
