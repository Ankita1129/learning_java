package oopl;

public class carFactory {
    public static Car buildCar(carType model) {
        Car car = null;
        switch (model) {
            case LuxuryCar:
                car = new LuxuryCar();
                break;
            case Small:
                car = new Small();
                break;
            case Sedan:
                car = new Sedan();
                break;
        }
        return car;
    }
}
