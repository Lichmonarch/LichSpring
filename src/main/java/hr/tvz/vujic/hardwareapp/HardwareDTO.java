package hr.tvz.vujic.hardwareapp;

import lombok.Data;

@Data

public class HardwareDTO {
    String name;
    String id;
    double price;
    Type type;
    Integer numberOfAvailableUnits;

    public HardwareDTO(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public HardwareDTO(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public Integer getNumberOfAvailableUnits() {
        return numberOfAvailableUnits;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "HardwareDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
