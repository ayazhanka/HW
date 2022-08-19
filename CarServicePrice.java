package CarService;
import HomeWork.Car;
import HomeWork.HomewWorkEnum.Price;

public class CarServicePrice {
    public void priceCarsShow (Car[] cars, Price price) {
        for (Car car: cars) {
            if (car.getPrice() == price) {
                System.out.println(car);
            }
        }
    }
}
