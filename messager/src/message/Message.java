package message;

import java.util.Date;

public class Message implements IMessage<String> {
//    private final User user;
    private Date date;
    private String data;

    @Override
    public MessageType getType() {
        return null;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    @Override
    public void setDate(Date date) {

    }

    @Override
    public String getData() {
        return null;
    }

    @Override
    public void setData(String data) {

    }
}
