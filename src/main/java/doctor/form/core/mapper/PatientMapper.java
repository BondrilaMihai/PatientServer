package doctor.form.core.mapper;

import doctor.form.core.model.PatientDto;
import doctor.form.core.repository.entity.Patient;


public interface PatientMapper {

    Patient toEntity(PatientDto patientDto);

    PatientDto toDto(Patient patient);
}
