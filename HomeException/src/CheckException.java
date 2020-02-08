public class CheckException extends Throwable {
    public CheckException(String message){
        super(message);
    }
    public CheckException(double i){
        super(String.valueOf(i));
    }
}
