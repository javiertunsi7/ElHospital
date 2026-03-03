package org.example.patient;

import org.example.model.Patient;


public class AmbulancePatient extends Patient {

    private String emergencyLevel;


    public AmbulancePatient(String name, int age, String gender, String phoneNumber,
                            String medicalRecordNumber, String diagnosis,
                            String emergencyLevel) {
        super(name, age, gender, phoneNumber, medicalRecordNumber, diagnosis);
        this.emergencyLevel = emergencyLevel;
    }


    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }


    @Override
    public void checkIn() {

        System.out.println("│ ADMISIÓN DE EMERGENCIA - PACIENTE EN AMBULANCIA    │");

        System.out.println("  ⚠ ALERTA: Paciente de emergencia: " + getName());
        System.out.println("  ⚠ Nivel de emergencia: " + emergencyLevel);
        System.out.println("  ✓ Protocolo de emergencia activado");
    }


    public void performSurgery() {
        System.out.println("  ✓ Operación quirúrgica realizada");
        System.out.println("    • Equipo médico especializado");
        System.out.println("    • Cirugía exitosa");
        System.out.println("    • Paciente estabilizado");
    }


    public void rehabilitate() {
        System.out.println("  ✓ Proceso de rehabilitación iniciado");
        System.out.println("    • Terapia física programada");
        System.out.println("    • Ejercicios de recuperación");
        System.out.println("    • Seguimiento diario");
    }


    @Override
    public void receiveTreatment() {
        System.out.println("  ✓ Tratamiento post-operatorio administrado");
        System.out.println("    • Medicación intravenosa");
        System.out.println("    • Monitoreo constante");
        System.out.println("    • Cuidados intensivos");
    }


    @Override
    public void checkOut() {
        System.out.println("  ✓ Alta médica aprobada");
        System.out.println("    • Recuperación satisfactoria");
        System.out.println("    • Instrucciones post-hospitalarias entregadas");
        System.out.println("    • Paciente dado de alta");

    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Tipo de Paciente: Emergencia (Ambulancia)");
        System.out.println("  Nivel de Emergencia: " + emergencyLevel);

    }


    public void completeEmergencyProcess() {
        checkIn();
        performSurgery();
        assignRoom();
        receiveTreatment();
        rehabilitate();
        checkOut();
    }
}