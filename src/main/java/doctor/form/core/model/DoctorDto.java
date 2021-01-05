package doctor.form.core.model;


import doctor.form.core.model.enums.Specialization;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {

    private UUID id;
    private String lastName;
    private String firstName;
    private Float notes;
    private Specialization specialization;
}
