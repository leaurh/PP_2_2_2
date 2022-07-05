package web.model;

public class Car {
    private int age;
    private String series;
    private String model;

    public Car(int age, String series, String model) {
        this.age = age;
        this.series = series;
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
