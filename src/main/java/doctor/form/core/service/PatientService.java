package doctor.form.core.service;

import doctor.form.core.model.PatientDto;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;


public interface PatientService {

    PatientDto getPatientHistory(UUID patientId);

    List<PatientDto> getDoctorPatients(UUID doctorId);

    PatientDto savePatient(PatientDto patientDto);
}
