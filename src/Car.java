public class Car {
    private String brandAndModel;
    private int yearOfProduction;
    private double price;
    private String colour;
    private double engineCapacity;

    public Car(String brandAndModel, int yearOfProduction, double price, String colour, double engineCapacity) {
        this.brandAndModel = brandAndModel;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.colour = colour;
        this.engineCapacity = engineCapacity;
    }

    public String getBrandAndModel() {
        return brandAndModel;
    }

    public void setBrandAndModel(String brandAndModel) {
        this.brandAndModel = brandAndModel;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandAndModel='" + brandAndModel + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
