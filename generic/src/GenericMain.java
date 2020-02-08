
public class GenericMain {

    public static void main(String[] args) {
        BoxObject badBox = new BoxObject();
        badBox.setItem("Test");

        Integer item = (Integer) badBox.getItem();
    }
}
