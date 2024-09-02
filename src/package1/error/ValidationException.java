package package1.error;

public class ValidationException extends Throwable {
    public String message;

    public ValidationException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    
}
