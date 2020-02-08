package dto.message.api;

import dto.User;

import java.util.Date;

public interface IMessage<T> {
    User getUser();
    MessageType getType();

    Date getDate();
    void setDate(Date date);

    T getData();
    void setData(T data);
}
