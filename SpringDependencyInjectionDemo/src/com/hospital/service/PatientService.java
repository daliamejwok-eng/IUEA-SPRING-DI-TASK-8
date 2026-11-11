package com.hospital.service;

import com.hospital.repository.PatientRepository;

public class PatientService {
    private final PatientRepository patientRepository;

    // Constructor Injection
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void processPatientRecord(String patientId) {
        String record = patientRepository.fetchPatientRecord(patientId);
        System.out.println("[DI Service Processing] " + record);
    }
}