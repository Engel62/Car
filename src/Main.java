import transport.Car;
import transport.Transport;

public class Main {
    public static void main(String[] args) {
        Transport lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Transport audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Transport bmw = new Car("BMW", "Z8", 0, "черный", 2021, "Германия");
        Transport kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Transport hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        printInfo((Car) lada);
        printInfo((Car) audi);
        printInfo((Car) bmw);
        printInfo((Car) kia);
        printInfo((Car) hyundai);
    }

    private static void printInfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", год выпуск: " + car.getProductionYear() +
                        ", страна сборки " + car.getProductionCountry() +
                        ", цвет кузова: " + car.getColor() +
                        ", объем двигателя: " + car.getEngineVolume() +
                        ", коробка передач: " + car.getGears() +
                        ", тип кузова " + car.getTypeOfBody() +
                        ", рег. номер " + car.getRegNumber() +
                        ", количество мест " + car.getSeatsCount() +
                        ",   " + (car.isSummerTyers() ? "летняя" : "зимняя") + " резина"
        );
    }
}