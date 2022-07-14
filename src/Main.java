public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", 250, 1500);
        Car car1 = new Car("BMW", 250, 1300);
        Car car2 = new Car("Lada", 100, 400);
        try {
            car.start();
            } catch (Exception e){
            System.out.println("Не завелcя");
        }
        try {
            car1.start();
        } catch (Exception e){
            System.out.println("Не завелся");
        }
        try {
            car2.start();
        } catch (Exception e){
            System.out.println("Не завелся");
        }
    }
}
