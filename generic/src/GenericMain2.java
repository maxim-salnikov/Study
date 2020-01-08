public class GenericMain2 {
    public static void main(String[] args) {
        Box<Integer> boxInt = new Box<>();
        boxInt.setItem(123);

        Integer item = boxInt.getItem();

        print(boxInt);

        Box<String> boxStr = new Box<>();
        boxStr.setItem("Test");

        String item2 = boxStr.getItem();

        print(boxStr);
    }
    private static void print(Box box){
        System.out.println(box.getItem());
    }
}
