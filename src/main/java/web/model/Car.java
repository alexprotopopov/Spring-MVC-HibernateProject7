package web.model;

public class Car {
    private int id;
    private String model;
    private String series;
    private Integer maxSpeed;

    public Car(int id, String model, String series, Integer maxSpeed) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.maxSpeed = maxSpeed;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }
}


