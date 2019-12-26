package s;

public abstract class HttpSender {
    protected final void sendData(String url, Object data){
        System.out.println(String.format("Отпавляю данные %s на %s", data, url));
    }
}
