package hr.tvz.vujic.hardwareapp;
import java.util.List;
import java.util.Optional;

public interface HardwareRepository {
    List<Hardware> findAll();
    Optional<Hardware> findByCode(String code);
    Optional<Hardware> save(Hardware hardware);
    void deleteByIdCode(String idCode);

    Optional<Hardware> update(String idCode, Hardware updatedHardware);
}
