package zebsoft.edu.dsman.ds.exception;

public class StackEmptyException extends Exception
{

    /**
     * Constante para serialización
     */
    private static final long serialVersionUID = 5445659725991433594L;
    
    public StackEmptyException(String mensaje)
    {
        super(mensaje);
    }
}
