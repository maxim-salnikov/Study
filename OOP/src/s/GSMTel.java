package s;

public class GSMTel extends Tel {
    public void sendSms(){
        System.out.println("Уже улетела");
    }

    public void playSnake(){
        System.out.println("Играем в змейку");
    }

    @Override
    public void stop() {

    }

    //    @Override
//    public void call() {
//
//    }
}
