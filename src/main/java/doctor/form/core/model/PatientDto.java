package doctor.form.core.model;

import doctor.form.core.model.enums.SubscriptionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {

    private UUID id;
    private String lastName;
    private String firstName;
    private String cnp;
    private String address;
    private SubscriptionType subscriptionType;
    private UUID doctorId;

}
