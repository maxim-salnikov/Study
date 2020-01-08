package s;

public class Car {
    int price;

    public Car(){
        this.price = 10;
    }

    public Car(int price) {
        this.price = price;
    }

    private Car(boolean flagi){
        if(flagi){
            this.price = 99999;
        } else {
            this.price = 0;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Car newInstance(){
        return new Car(false);
    }
}
