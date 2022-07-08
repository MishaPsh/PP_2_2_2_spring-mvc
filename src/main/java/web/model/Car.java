package web.model;

public class Car {
    private String autoBrand;
    private String carModel;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String autoBrand, String carModel, int yearOfProduction) {
        this.autoBrand = autoBrand;
        this.carModel = carModel;
        this.yearOfProduction = yearOfProduction;
    }

    public String getAutoBrand() {
        return autoBrand;
    }

    public void setAutoBrand(String autoBrand) {
        this.autoBrand = autoBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "autoBrand='" + autoBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
