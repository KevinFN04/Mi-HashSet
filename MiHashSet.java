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
    
    /**
     * Comprueba si el elemento dado esta en la lista, true = si esta, false = no esta.
     */
    public boolean contains(int elemento)
    {
        return lista.contains(elemento);
    }
    
    /**
     * Comprueba si la lista esta vacia. true = vacia, false = contiene algun dato.
     */
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    
    /**
     * Elimina un elemento dado de la lista.
     */
    public boolean remove(int elemento)
    {
        boolean eliminado = false;
        if (lista.contains(elemento) == true){
            lista.remove(lista.indexOf(elemento));
            eliminado = true;
        }
        return eliminado;
    }
    
    /**
     * Devuelve la cantidad de elementos que hay en la lista.
     */
    public int size()
    {
        return lista.size();
    }
    
    /**
     * devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     */
    public String toString()
    {
        String elementosLista = "[" + lista.get(0);
        for (int count = 1; size() > count; count++){
            elementosLista = elementosLista + ", "  + lista.get(count);
        }
        elementosLista = elementosLista + "]";
        return elementosLista;
    }
    
    /**
     * devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean igual = true;
        for (int count = 0; size() > count; count++){
            if (!otroConjunto.contains(lista.get(count))){
                igual = false;
            }
        }
        return igual;
    }
}
