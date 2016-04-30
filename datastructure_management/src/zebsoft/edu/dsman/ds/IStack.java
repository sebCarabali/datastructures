package zebsoft.edu.dsman.ds;

import zebsoft.edu.dsman.ds.exception.StackEmptyException;

public interface IStack<T extends Comparable<? super T>>
{
    /**
     * Verifica si la pila se encuentra vacia.
     * @return <code>true</code> si la pila está vacia <code>false</code> de lo contrario.
     */
    public boolean isEmpty();
    
    /**
     * Inserta un nuevo elemento en la pila.
     * 
     * @param element
     */
    public void push(T element);
    
    /**
     * Obtiene el elemento en el tope de la pila sin retirarlo de esta.
     * @return Elemento en el tope de la pila.
     * @throws StackEmptyException Se lanza si la pila se encuentra vacia.
     */
    public T top() throws StackEmptyException;
    
    /**
     * Obtiene el elemento en el tope de la pila y es retirado de esta.
     * @return Elemento en el tope de la pila.
     * @throws StackEmptyException Se lanza si la pila se encuentra vacia.
     */
    public T pop() throws StackEmptyException;
    
}
