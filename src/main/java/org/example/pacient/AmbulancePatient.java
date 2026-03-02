package org.example.patient;

import org.example.model.Patient;

import org.example.hospital.model.Patient;

/**
 * AmbulancePatient - Emergency patients who arrive by ambulance
 * Demonstrates Polymorphism - different implementation than ConsultationPatient
 */
public class AmbulancePatient extends Patient {
    // Private attributes - Encapsulation
    private String emergencyLevel;

    /**
     * Constructor
     */
    public AmbulancePatient(String name, int age, String gender, String phoneNumber,
                            String medicalRecordNumber, String diagnosis,
                            String emergencyLevel) {
        super(name, age, gender, phoneNumber, medicalRecordNumber, diagnosis);
        this.emergencyLevel = emergencyLevel;
    }

    // Getters and Setters
    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    /**
     * Implementation of abstract method checkIn
     */
    @Override
    public void checkIn() {
        System.out.println("\n┌─────────────────────────────────────────────────────┐");
        System.out.println("│ ADMISIÓN DE EMERGENCIA - PACIENTE EN AMBULANCIA    │");
        System.out.println("└─────────────────────────────────────────────────────┘");
        System.out.println("  ⚠ ALERTA: Paciente de emergencia: " + getName());
        System.out.println("  ⚠ Nivel de emergencia: " + emergencyLevel);
        System.out.println("  ✓ Protocolo de emergencia activado");
    }

    /**
     * Perform surgery
     */
    public void performSurgery() {
        System.out.println("  ✓ Operación quirúrgica realizada");
        System.out.println("    • Equipo médico especializado");
        System.out.println("    • Cirugía exitosa");
        System.out.println("    • Paciente estabilizado");
    }

    /**
     * Rehabilitation process
     */
    public void rehabilitate() {
        System.out.println("  ✓ Proceso de rehabilitación iniciado");
        System.out.println("    • Terapia física programada");
        System.out.println("    • Ejercicios de recuperación");
        System.out.println("    • Seguimiento diario");
    }

    /**
     * Implementation of Treatable interface method
     */
    @Override
    public void receiveTreatment() {
        System.out.println("  ✓ Tratamiento post-operatorio administrado");
        System.out.println("    • Medicación intravenosa");
        System.out.println("    • Monitoreo constante");
        System.out.println("    • Cuidados intensivos");
    }

    /**
     * Implementation of Treatable interface method
     */
    @Override
    public void checkOut() {
        System.out.println("  ✓ Alta médica aprobada");
        System.out.println("    • Recuperación satisfactoria");
        System.out.println("    • Instrucciones post-hospitalarias entregadas");
        System.out.println("    • Paciente dado de alta");
        System.out.println("└─────────────────────────────────────────────────────┘");
    }

    /**
     * Override displayInfo to add emergency-specific information
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Tipo de Paciente: Emergencia (Ambulancia)");
        System.out.println("  Nivel de Emergencia: " + emergencyLevel);
        System.out.println("════════════════════════════════════════════════════════");
    }

    /**
     * Complete emergency process
     */
    public void completeEmergencyProcess() {
        checkIn();
        performSurgery();
        assignRoom();
        receiveTreatment();
        rehabilitate();
        checkOut();
    }
}