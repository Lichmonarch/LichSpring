package hr.tvz.vujic.hardwareapp;
import javax.validation.constraints.*;

public class HardwareCommand {
@NotBlank(message = "Name must be filled in")
    private String name;

@NotBlank(message = "Code must be filled in")
    private String idCode;

@NotNull(message = "Price must be filled in")
@PositiveOrZero(message = "Price must be 0 or greater")
    private double price;

@NotNull(message = "Type must be chosen")
    private Type type;

@NotNull(message = "Number of available units must be entered")
@PositiveOrZero(message = "Number of available units must be 0 or greater")
   private Integer numberOfAvailableUnits;

    public String getName() {
        return name;
    }

    public String getIdCode() {
        return idCode;
    }

    public double getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public Integer getNumberOfAvailableUnits() {
        return numberOfAvailableUnits;
    }

}
