import java.util.Random;

public class Car {
    private String model;
    private int speed;
    private int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }
    public Car(){

    }
    public void start() throws Exception {
        Random random = new Random();
        int a = random.nextInt(20);
            if (a % 2 != 0) {
                System.out.println("Автомобиль " + getModel() + " завелся");
            } else {
                throw new Exception();
            }
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
