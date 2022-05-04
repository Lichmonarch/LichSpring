package hr.tvz.vujic.hardwareapp;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HardwareClassService implements Serializable, HardwareService {


    private final HardwareRepository hardwareRepository;

    public HardwareClassService(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }


    @Override
    public List<HardwareDTO> findAll() {
        return hardwareRepository.findAll().stream().map(this::mapHardwareToDTO).collect(Collectors.toList());
    }

    @Override
    public Optional<HardwareDTO> findByCode(String code) {
        return hardwareRepository.findByCode(code).map(this::mapHardwareToDTO);
    }

    @Override
    public Optional<HardwareDTO> save(final HardwareCommand hardwareCommand) {
        return hardwareRepository.save(mapCommandToHardware(hardwareCommand)).map(this::mapHardwareToDTO);
    }

    private HardwareDTO mapHardwareToDTO(final Hardware hardware){
        return new HardwareDTO(hardware.getName(), hardware.getId(), hardware.getPrice());
    }

    private Hardware mapCommandToHardware(final HardwareCommand hardwareCommand) {
        return new Hardware(hardwareCommand.getName(), hardwareCommand.getIdCode(), hardwareCommand.getPrice(),
                hardwareCommand.getType(), hardwareCommand.getNumberOfAvailableUnits() );
    }
    @Override
    public void deleteByIdCode(final String idCode) {
        hardwareRepository.deleteByIdCode(idCode);
    }

    @Override
    public Optional<HardwareDTO> update(final String idCode, final HardwareCommand updatedHardwareCommand) {
        return hardwareRepository.update(idCode, mapCommandToHardware(updatedHardwareCommand)).map(this::mapHardwareToDTO);
    }
}
