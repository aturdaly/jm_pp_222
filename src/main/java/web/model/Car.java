package web.model;

public class Car {
    private Long price;
    private String name;
    private Long series;

    public Car() {}

    public Car(Long price, String name, Long series) {
        this.price = price;
        this.name = name;
        this.series = series;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = name;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }
}
