package org.example.doctor;

import org.example.model.Doctor;


public class SpecialistDoctor extends Doctor {

    private String specialty;
    private int yearsOfExperience;


    public SpecialistDoctor(String name, int age, String gender, String phoneNumber,
                            String licenseNumber, int weeklyWorkHours,
                            String specialty, int yearsOfExperience) {
        super(name, age, gender, phoneNumber, licenseNumber, weeklyWorkHours);
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }


    @Override
    public void work() {

        System.out.println("│ JORNADA LABORAL - MÉDICO ESPECIALISTA              │");

        System.out.println("  ✓ Dr./Dra. " + getName() + " trabajando en " + specialty);
        System.out.println("  ✓ Atendiendo pacientes especializados");
        System.out.println("  ✓ Realizando procedimientos avanzados");
        workWeek();
    }


    @Override
    public void eat() {
        System.out.println("  ✓ Tomando descanso para almorzar");
        System.out.println("    • 60 minutos de descanso");
    }


    public void takeVacation() {
        System.out.println("  ✓ Período de vacaciones programado");
        System.out.println("    • 30 días de vacaciones anuales");
        System.out.println("    • Descanso merecido");

    }


    public void displaySpecialty() {
        System.out.println("\n  📋 ESPECIALIDAD MÉDICA");

        System.out.println("  Especialidad: " + specialty);
        System.out.println("  Años de Experiencia: " + yearsOfExperience + " años");
        System.out.println("  Certificación: Vigente");
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Tipo: Médico Especialista");
        System.out.println("  Especialidad: " + specialty);
        System.out.println("  Experiencia: " + yearsOfExperience + " años");

    }


    public void completeWorkRoutine() {
        work();
        eat();
        displaySpecialty();
        takeVacation();
    }
}