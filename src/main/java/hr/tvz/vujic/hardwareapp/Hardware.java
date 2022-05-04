package hr.tvz.vujic.hardwareapp;
import lombok.Data;

import java.util.List;
import java.util.Optional;


@Data
public class Hardware implements HardwareRepository{
    String name;
    String id;
    double price;
    Type type;
    Integer numberOfAvailableUnits;

    @Override
    public List<Hardware> findAll() {
        return null;
    }

    @Override
    public Optional<Hardware> findByCode(String code) {
        return Optional.empty();
    }

    @Override
    public Optional<Hardware> save(Hardware hardware) {
        return Optional.empty();
    }

    @Override
    public void deleteByIdCode(String idCode) {

    }

    @Override
    public Optional<Hardware> update(String idCode, Hardware updatedHardware) {
        return Optional.empty();
    }


    public Hardware(String name, String id, double price, Type type, Integer numberOfAvailableUnits) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.type = type;
        this.numberOfAvailableUnits = numberOfAvailableUnits;
    }
}
