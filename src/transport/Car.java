package transport;
public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private   String gears;
    private final  String typeOfBody;
    private String  regNumber;
    private final int seatsCount;
    private boolean summerTyers;
    private Key key;

    public Car(String brand,
                String model,
        double engineVolume,
        String color,
        int productionYear,
        String productionCountry,
        String gears,
        String typeOfBody,
        String regNumber,
        int seatsCount,
        boolean summerTyers,
        Key key) {

            if (brand == null || brand.isEmpty()) {
                brand = "default";
            }
            this.brand = brand;

        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        this.productionYear = productionYear;
        if (productionCountry == null || productionCountry.isEmpty()) {
            productionCountry = "default";}
        this.productionCountry = productionCountry;

        if (typeOfBody == null || typeOfBody.isEmpty()) {
        typeOfBody = "Седан";
    }
        this.typeOfBody = typeOfBody;


        if (gears == null || gears.isEmpty()) {
        gears = "Механическа КПП";
    }
        this.gears = gears;

        if (regNumber == null || regNumber.isEmpty()) {
        regNumber = "x000xx000";
    }
        this.regNumber = regNumber;

        if (key == null) {
        this.key = new Key();
    } else {
        this.key = key;
    }
        this.seatsCount = seatsCount;
        this.summerTyers = summerTyers;
}

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this(
                brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                "Механическа КПП",
                "Седан",
                "x000xx000",
                5,
                true,
                new Key()
        );
    }



    @Override
    public String toString () {
        return brand + " " + model + ", объем двигателя " + engineVolume + " л. , цвет " + color + ", год выпуска " + productionYear + ", страна сборки " + productionCountry + ".";
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "Механическа КПП";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyers() {
        return summerTyers;
    }

    public void setSummerTyers(boolean summerTyers) {
        this.summerTyers = summerTyers;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void changeTyers() {
        summerTyers = !summerTyers;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars  = regNumber.toCharArray();
        if (Character.isAlphabetic(chars[0]) || Character.isAlphabetic(chars[4]) || Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return  true;
    }

public static class Key {

    private final boolean remoteRunEngine;

    private final boolean withoutKeyAcces;

    public Key(boolean remoteRunEngine, boolean withoutKeyAcces) {
        this.remoteRunEngine = remoteRunEngine;
        this.withoutKeyAcces = withoutKeyAcces;
    }

    public Key() {
        this(false,false);
    }

    public boolean isRemoteRunEngine() {
        return remoteRunEngine;
    }

    public boolean isWithoutKeyAcces() {
        return withoutKeyAcces;
    }
}

}