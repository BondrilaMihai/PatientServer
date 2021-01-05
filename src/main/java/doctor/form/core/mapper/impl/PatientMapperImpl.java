package doctor.form.core.mapper.impl;

import doctor.form.core.mapper.PatientMapper;
import doctor.form.core.model.PatientDto;
import doctor.form.core.repository.entity.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public Patient toEntity(PatientDto patientDto) {

        Patient patient = new Patient();
        patient.setId(patientDto.getId());
        patient.setLastName(patientDto.getLastName());
        patient.setFirstName(patientDto.getFirstName());
        patient.setCnp(patientDto.getCnp());
        patient.setAddress(patientDto.getAddress());
        patient.setSubscriptionType(patientDto.getSubscriptionType());

        return patient;
    }

    @Override
    public PatientDto toDto(Patient patient) {

        PatientDto patientDto = new PatientDto();

        patientDto.setId(patient.getId());
        patientDto.setLastName(patient.getLastName());
        patientDto.setFirstName(patient.getFirstName());
        patientDto.setCnp(patient.getCnp());
        patientDto.setAddress(patient.getAddress());
        patientDto.setSubscriptionType(patient.getSubscriptionType());

        return patientDto;
    }
}
