package doctor.form.core.service.impl;


import doctor.form.core.mapper.PatientMapper;
import doctor.form.core.model.PatientDto;
import doctor.form.core.repository.PatientRepository;
import doctor.form.core.repository.entity.Patient;
import doctor.form.core.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    PatientMapper patientMapper;

    @Override
    public PatientDto getPatientHistory(UUID patientId) {
        return patientMapper.toDto(patientRepository.findById(patientId).get());
    }

    @Override
    public List<PatientDto> getDoctorPatients(UUID doctorId) {
        return null;
    }

    @Override
    public PatientDto savePatient(PatientDto patientDto) {
        Patient patient = patientRepository.save(patientMapper.toEntity(patientDto));
        return patientMapper.toDto(patient);
    }

}
