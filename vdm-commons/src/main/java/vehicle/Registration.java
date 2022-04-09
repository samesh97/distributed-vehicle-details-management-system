package vehicle;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Registration {

    @Id
    @GeneratedValue
    private int id;

    private int vehicleId;
    private int ownerId;
    private Date date;
    private int previousOwnerCount;
}
