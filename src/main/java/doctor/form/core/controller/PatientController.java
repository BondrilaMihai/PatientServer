package doctor.form.core.controller;

import doctor.form.core.model.PatientDto;
import doctor.form.core.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patient-history/{patientId}")
    public PatientDto getPatientHistory(@PathVariable UUID patientId) {
        return patientService.getPatientHistory(patientId);
    }

    @GetMapping("/doctor-patients/{doctorId}")
    public List<PatientDto> getDoctorPatients(@PathVariable UUID doctorId) {
        return patientService.getDoctorPatients(doctorId);
    }

    @PostMapping("/save-patient")
    public PatientDto savePatientInformation(@RequestBody PatientDto patient) {
        return patientService.savePatient(patient);
    }
}
