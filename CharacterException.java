package rebuildJDR;

public class CharacterException extends Exception {

    public CharacterException() {
        this( "Invalid Parameter" );
    }

    public CharacterException( String message ) {
        super( message );
    }
    
    public CharacterException( String message, Throwable cause ) {
        super( message, cause );
    }
}
