package transport;

public abstract class Transport {
    private  String brand;
    private  String model;
    private   int productionYear;
    private   String productionCountry;
    private String color;
    private  int maxSpeed;

    public  Transport(String brand, String model,
                     int productionYear, String productionCountry,
                     String color, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;


        if (productionYear <= 0 ) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            productionCountry = "default";}
        this.productionCountry = productionCountry;

        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "Белый";
        }
        this.color = color;

        if (maxSpeed <= 0 ) {
            maxSpeed = 120;
        }
        this.maxSpeed = maxSpeed;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
    }

    public  String getBrand() {
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

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
