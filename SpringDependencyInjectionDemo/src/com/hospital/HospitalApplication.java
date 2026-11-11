package com.hospital;

import com.hospital.repository.PatientRepository;
import com.hospital.service.PatientService;

public class HospitalApplication {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   SPRING FRAMEWORK DEPENDENCY INJECTION DEMO     ");
        System.out.println("==================================================");

        // Dependency Injection Demonstration
        PatientRepository repository = new PatientRepository();
        PatientService service = new PatientService(repository);

        service.processPatientRecord("UG-PAT-2026-001");
        System.out.println("==================================================");
    }
}