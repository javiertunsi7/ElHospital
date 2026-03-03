package org.example.model;

import org.example.interfaces.Workable;


public abstract class Doctor extends Character implements Workable {

    private String licenseNumber;
    private int weeklyWorkHours;


    public Doctor(String name, int age, String gender, String phoneNumber,
                  String licenseNumber, int weeklyWorkHours) {
        super(name, age, gender, phoneNumber);
        this.licenseNumber = licenseNumber;
        this.weeklyWorkHours = weeklyWorkHours;
    }


    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getWeeklyWorkHours() {
        return weeklyWorkHours;
    }

    public void setWeeklyWorkHours(int weeklyWorkHours) {
        this.weeklyWorkHours = weeklyWorkHours;
    }


    public void workWeek() {
        System.out.println("  ⏰ Horas de trabajo por semana: " + weeklyWorkHours + " horas");
    }


    @Override
    public void displayInfo() {

        System.out.println("║              INFORMACIÓN DEL MÉDICO                    ║");

        System.out.println("  Nombre: Dr./Dra. " + getName());
        System.out.println("  Edad: " + getAge() + " años");
        System.out.println("  Género: " + getGender());
        System.out.println("  Teléfono: " + getPhoneNumber());
        System.out.println("  Número de Licencia: " + licenseNumber);
        System.out.println("  Horas Semanales: " + weeklyWorkHours + " horas");
    }
}