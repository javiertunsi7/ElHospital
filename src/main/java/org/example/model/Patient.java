package org.example.model;



import org.example.hospital.interfaces.Treatable;


public abstract class Patient extends Character implements Treatable {

    private String medicalRecordNumber;
    private String diagnosis;


    public Patient(String name, int age, String gender, String phoneNumber,
                   String medicalRecordNumber, String diagnosis) {
        super(name, age, gender, phoneNumber);
        this.medicalRecordNumber = medicalRecordNumber;
        this.diagnosis = diagnosis;
    }


    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


    public abstract void checkIn();


    public void assignRoom() {
        System.out.println("   └─ Asignando habitación al paciente: " + getName());
    }


    @Override
    public void displayInfo() {

        System.out.println("INFORMACIÓN DEL PACIENTE");

        System.out.println("  Nombre: " + getName());
        System.out.println("  Edad: " + getAge() + " años");
        System.out.println("  Género: " + getGender());
        System.out.println("  Teléfono: " + getPhoneNumber());
        System.out.println("  Número de Historia Clínica: " + medicalRecordNumber);
        System.out.println("  Diagnóstico: " + diagnosis);
    }
}
