/**
 * 
 */
package zebsoft.edu.dsman.ds.implementation;

import zebsoft.edu.dsman.ds.IStack;
import zebsoft.edu.dsman.ds.exception.StackEmptyException;

/**
 * @author Sebastián Carabali
 */
public class ArrayStack<T extends Comparable<? super T>> implements IStack<T>
{

    // ----------------
    // Constantes
    // ----------------
    private static final int DEFAULT_CAPACITY = 10;

    // ----------------
    // Atributos
    // ----------------
    private T[]              array;
    private int              topOfStack;

    // ----------------
    // Constructor
    // ----------------
    /**
     * Creau una pila vacia.
     */
    @SuppressWarnings("unchecked")
    public ArrayStack()
    {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    // ----------------
    // Métodos
    // ----------------
    @Override
    public boolean isEmpty()
    {
        return (topOfStack == -1);
    }

    @Override
    public void push(T element)
    {
        if (topOfStack + 1 == array.length)
            array = doubleArraySize();
        array[++topOfStack] = element;
    }

    @SuppressWarnings("unchecked")
    private T[] doubleArraySize()
    {
        T[] tmp = (T[]) new Object[2 * array.length];
        System.arraycopy(tmp, 0, array, 0, array.length);
        System.out.println(tmp.length);
        array = tmp;
        return array;
    }

    @Override
    public T top() throws StackEmptyException
    {
        if (isEmpty())
            throw new StackEmptyException();
        return array[topOfStack];
    }

    @Override
    public T pop() throws StackEmptyException
    {
        if (isEmpty())
            throw new StackEmptyException();
        return array[topOfStack--];
    }

    @Override
    public void makeEmpty()
    {
        topOfStack = -1;
    }

}
