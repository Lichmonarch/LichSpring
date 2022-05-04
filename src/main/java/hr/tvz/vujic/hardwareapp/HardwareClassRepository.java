package hr.tvz.vujic.hardwareapp;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.*;

import static hr.tvz.vujic.hardwareapp.Type.CPU;
import static hr.tvz.vujic.hardwareapp.Type.GPU;


@Repository
public class HardwareClassRepository implements HardwareRepository, Serializable {

   List<Hardware> hardcodedHardware = new ArrayList<>(
            Arrays.asList(new Hardware("RTX 3090", "1", 10000, GPU, 2),
                          new Hardware("I7 7700k", "2", 8500, CPU, 7))
    );

    @Override
    public List<Hardware> findAll() {
        return hardcodedHardware;
    }

    @Override
    public Optional<Hardware> findByCode(String code) {
        return hardcodedHardware.stream().filter(a->a.id.equals(code)).findAny();
    }

    @Override
    public Optional<Hardware> save(final Hardware hardware) {
        if(!hardcodedHardware.contains(hardware)){
            hardcodedHardware.add(hardware);
            return Optional.of(hardware);
        } else {
            return Optional.empty();
        }
    }
    @Override
    public void deleteByIdCode(final String idCode) {
        hardcodedHardware.removeIf(it -> Objects.equals(it.getId(), idCode));
    }
    @Override
    public Optional<Hardware> update(final String idCode, final Hardware updatedHardware) {
        boolean exists = hardcodedHardware.removeIf(
                it -> Objects.equals(it.getId(), idCode) && Objects.equals(it.getId(), updatedHardware.getId())
        );

        if(exists){
            hardcodedHardware.add(updatedHardware);
            return Optional.of(updatedHardware);
        } else {
            return Optional.empty();
        }
    }
}
