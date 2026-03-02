package org.example.pacient;



import org.example.hospital.model.Patient;


public class ConsultationPatient extends Patient {

    private String appointmentDate;


    public ConsultationPatient(String name, int age, String gender, String phoneNumber,
                               String medicalRecordNumber, String diagnosis,
                               String appointmentDate) {
        super(name, age, gender, phoneNumber, medicalRecordNumber, diagnosis);
        this.appointmentDate = appointmentDate;
    }


    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }


    @Override
    public void checkIn() {

        System.out.println("PROCESO DE ADMISIÓN - PACIENTE DE CONSULTA");

        System.out.println("  ✓ Admitiendo paciente: " + getName());
        System.out.println("  ✓ Cita programada: " + appointmentDate);
    }


    public void nurseControl() {
        System.out.println("  ✓ Control de enfermería completado");
        System.out.println("    • Signos vitales tomados");
        System.out.println("    • Presión arterial: Normal");
        System.out.println("    • Temperatura: Normal");
    }


    public void scheduleNextAppointment() {
        System.out.println("  ✓ Próxima cita programada para seguimiento");
    }


    @Override
    public void receiveTreatment() {
        System.out.println("  ✓ Tratamiento médico administrado");
        System.out.println("    • Medicamentos recetados");
        System.out.println("    • Indicaciones médicas proporcionadas");
    }


    @Override
    public void checkOut() {
        System.out.println("  ✓ Proceso de salida completado");
        System.out.println("    • Receta médica entregada");
        System.out.println("    • Paciente dado de alta");


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Tipo de Paciente: Consulta Externa");
        System.out.println("  Fecha de Cita: " + appointmentDate);
    }


    public void completeConsultationProcess() {
        checkIn();
        nurseControl();
        assignRoom();
        receiveTreatment();
        scheduleNextAppointment();
        checkOut();
    }
}
