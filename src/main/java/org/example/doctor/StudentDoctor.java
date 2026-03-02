package org.example.doctor;



import org.example.hospital.model.Doctor;


public class StudentDoctor extends Doctor {

    private int currentYear;
    private int weeklyStudyHours;


    public StudentDoctor(String name, int age, String gender, String phoneNumber,
                         String licenseNumber, int weeklyWorkHours,
                         int currentYear, int weeklyStudyHours) {
        super(name, age, gender, phoneNumber, licenseNumber, weeklyWorkHours);
        this.currentYear = currentYear;
        this.weeklyStudyHours = weeklyStudyHours;
    }


    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getWeeklyStudyHours() {
        return weeklyStudyHours;
    }

    public void setWeeklyStudyHours(int weeklyStudyHours) {
        this.weeklyStudyHours = weeklyStudyHours;
    }


    @Override
    public void work() {

        System.out.println("│ JORNADA LABORAL - MÉDICO ESTUDIANTE                │");

        System.out.println("  ✓ Estudiante: " + getName() + " en práctica clínica");
        System.out.println("  ✓ Apoyando en consultas médicas");
        System.out.println("  ✓ Aprendiendo bajo supervisión");
        workWeek();
    }


    @Override
    public void eat() {
        System.out.println("  ✓ Tomando descanso rápido para comer");
        System.out.println("    • 30 minutos de descanso");
    }


    public void study() {
        System.out.println("  ✓ Tiempo de estudio semanal");
        System.out.println("    • " + weeklyStudyHours + " horas de estudio");
        System.out.println("    • Preparación para exámenes");
        System.out.println("    • Revisión de casos clínicos");
    }


    public void displayCurrentYear() {
        System.out.println("\n  📚 INFORMACIÓN ACADÉMICA");
        System.out.println("  Año Actual: " + currentYear + "° año de residencia");
        System.out.println("  Horas de Estudio Semanales: " + weeklyStudyHours + " horas");
        System.out.println("  Estado: En formación");

    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Tipo: Médico Estudiante/Residente");
        System.out.println("  Año de Residencia: " + currentYear + "° año");
        System.out.println("  Horas de Estudio Semanales: " + weeklyStudyHours + " horas");
    }


    public void completeStudentRoutine() {
        work();
        eat();
        study();
        displayCurrentYear();
    }
}