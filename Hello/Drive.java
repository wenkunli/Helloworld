import java.util.Scanner;
public class Drive {
        public static void main(String[] args) {
            Car car = new Car("911", 1966, "Porsche", "Coupe", 140);
            System.out.println(car.currentSpeed());
            car.accelerate(10);
            System.out.println(car.currentSpeed());
            car.isStopped();
            car.stop();
        }
    }
