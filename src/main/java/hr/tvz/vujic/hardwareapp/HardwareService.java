package hr.tvz.vujic.hardwareapp;

import java.util.List;
import java.util.Optional;

public interface HardwareService {
    List<HardwareDTO> findAll();
    Optional<HardwareDTO> findByCode(String code);
    Optional<HardwareDTO> save(HardwareCommand hardwareCommand);
    void deleteByIdCode(String idCode);

    Optional<HardwareDTO> update(String idCode, HardwareCommand updatedHardwareCommand);
}
