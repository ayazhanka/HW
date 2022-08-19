package HomeWorkRunner;

import CarService.CarService;
import CarService.CarServiceModel;
import CarService.CarServicePrice;
import HomeWork.Car;
import HomeWork.HomewWorkEnum.Mark;
import HomeWork.HomewWorkEnum.Model;
import HomeWork.HomewWorkEnum.Price;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CarService CarService = new CarService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number or mark");
        System.out.println("BMW");
        System.out.println("MERS");
        String markStr = sc.next();
        CarService.markCarsShow(getCars(), Mark.valueOf(markStr));

        CarServiceModel CarServiceModel= new CarServiceModel();
        System.out.println("Input model");
        System.out.println("X5");
        System.out.println("TAYCAN");
        String modelStr = sc.next();
        CarServiceModel.modelCarsShow(getCars(), Model.valueOf(modelStr));

        CarServicePrice CarServicePrice = new CarServicePrice();
        System.out.println("Input price:");
        String priceStr = sc.next();
        CarServicePrice.priceCarsShow(getCars(), Price.valueOf(priceStr));

    }
    public static Car[] getCars() {
        Car[] cars = new Car[3];
        cars[0] = new Car(1,  LocalDate.of(1998, 1, 1),"White",470, 786,
                Mark.BMW, Model.X5);
        cars[1] = new Car(2, LocalDate.of(1999, 1, 1),"Black", 570, 342,
                Mark.BMW, Model.X5);
        cars[2] = new Car(3,  LocalDate.of(2001, 1, 1),"Black", 1450, 246,
                Mark.MERS, Model.TAYCAN);

        return cars;
    }
}
