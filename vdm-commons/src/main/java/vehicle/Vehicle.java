package vehicle;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue
    private int vehicleId;

    private int mYear;
    private String color;
    private int engineCapacity;
    private String transmissionType;


}
