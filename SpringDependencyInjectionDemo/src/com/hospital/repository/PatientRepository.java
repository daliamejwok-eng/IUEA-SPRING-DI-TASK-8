package com.hospital.repository;

public class PatientRepository {
    public String fetchPatientRecord(String patientId) {
        return "Patient ID: " + patientId + " | Name: John Doe | Condition: Stable";
    }
}