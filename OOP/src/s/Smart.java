package s;

public class Smart extends GSMTel{
    public void openInternet(){
        System.out.println("IE немного глю.");
    }

    public void playMusic(){
        System.out.println("Шальная императрица всегда актуальна");
    }

//    @Override
//    public void call(){
//        call("911");
//    }

    public void call(String number){
        this.call(number, false);
    }

    public void call(String number, boolean stopCall){
        System.out.println("Отключить интернет...");
        System.out.println("Набираю " + number);
        if(stopCall){
            System.out.println("Неожиданно бросаем телефон");
        }
        System.out.println("Включить интернет...");
    }
}
