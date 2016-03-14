import java.util.*;
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    private ArrayListInt lista;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        lista = new ArrayListInt();
    }

    /**
     * Añade un valor a la lista de valores
     */
    public boolean add(int valor)
    {
        boolean noContiene = false;
        if (!lista.contains(valor)){
            lista.add(valor);
        }
        else{
            noContiene = true;
        }
        return noContiene;
    }
    
    /**
     * Elimina todos los elementos de la lista
     */
    public void clear()
    {
        lista.clear();
    }
}
