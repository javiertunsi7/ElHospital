package org.example;

import org.example.patient.ConsultationPatient;
import org.example.patient.AmbulancePatient;
import org.example.doctor.SpecialistDoctor;
import org.example.doctor.StudentDoctor;

/**
 * Main - Main class to demonstrate the hospital management system
 * Demonstrates all SOLID principles and OOP concepts
 *
 * SOLID Principles Applied:
 * - Single Responsibility Principle (SRP): Each class has one responsibility
 * - Open/Closed Principle (OCP): Classes are open for extension, closed for modification
 * - Liskov Substitution Principle (LSP): Subclasses can replace parent classes
 * - Interface Segregation Principle (ISP): Specific interfaces for specific behaviors
 * - Dependency Inversion Principle (DIP): Depend on abstractions, not concrete classes
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                ║");
        System.out.println("║          🏥  SISTEMA DE GESTIÓN HOSPITALARIA  🏥              ║");
        System.out.println("║                                                                ║");
        System.out.println("║              Bienvenido al Hospital General                    ║");
        System.out.println("║                                                                ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝");

        // Creating 2 Consultation Patients
        System.out.println("\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("          SECCIÓN 1: PACIENTES DE CONSULTA EXTERNA");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        ConsultationPatient consultationPatient1 = new ConsultationPatient(
                "María García López",
                35,
                "Femenino",
                "+34 612 345 678",
                "HC-2025-001",
                "Hipertensión arterial",
                "27/02/2026 - 10:00 AM"
        );

        ConsultationPatient consultationPatient2 = new ConsultationPatient(
                "Carlos Rodríguez Martínez",
                42,
                "Masculino",
                "+34 623 456 789",
                "HC-2025-002",
                "Diabetes tipo 2",
                "27/02/2026 - 11:30 AM"
        );

        // Display and process consultation patients
        consultationPatient1.displayInfo();
        consultationPatient1.completeConsultationProcess();

        System.out.println("\n");

        consultationPatient2.displayInfo();
        consultationPatient2.completeConsultationProcess();

        // Creating 2 Ambulance Patients
        System.out.println("\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("          SECCIÓN 2: PACIENTES DE EMERGENCIA");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        AmbulancePatient ambulancePatient1 = new AmbulancePatient(
                "Ana Fernández Torres",
                28,
                "Femenino",
                "+34 634 567 890",
                "HC-EMG-001",
                "Fractura de fémur",
                "CRÍTICO"
        );

        AmbulancePatient ambulancePatient2 = new AmbulancePatient(
                "Luis Sánchez Pérez",
                55,
                "Masculino",
                "+34 645 678 901",
                "HC-EMG-002",
                "Infarto agudo de miocardio",
                "EMERGENCIA VITAL"
        );

        // Display and process ambulance patients
        ambulancePatient1.displayInfo();
        ambulancePatient1.completeEmergencyProcess();

        System.out.println("\n");

        ambulancePatient2.displayInfo();
        ambulancePatient2.completeEmergencyProcess();

        // Creating 2 Specialist Doctors
        System.out.println("\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("          SECCIÓN 3: MÉDICOS ESPECIALISTAS");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        SpecialistDoctor specialist1 = new SpecialistDoctor(
                "Roberto Méndez",
                45,
                "Masculino",
                "+34 656 789 012",
                "LIC-MED-12345",
                40,
                "Cardiología",
                15
        );

        SpecialistDoctor specialist2 = new SpecialistDoctor(
                "Elena Ruiz",
                38,
                "Femenino",
                "+34 667 890 123",
                "LIC-MED-67890",
                38,
                "Traumatología",
                10
        );

        // Display and process specialist doctors
        specialist1.displayInfo();
        specialist1.completeWorkRoutine();

        System.out.println("\n");

        specialist2.displayInfo();
        specialist2.completeWorkRoutine();

        // Creating 2 Student Doctors
        System.out.println("\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("          SECCIÓN 4: MÉDICOS ESTUDIANTES");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        StudentDoctor student1 = new StudentDoctor(
                "Patricia Gómez",
                26,
                "Femenino",
                "+34 678 901 234",
                "LIC-EST-11111",
                30,
                3,
                25
        );

        StudentDoctor student2 = new StudentDoctor(
                "Diego Morales",
                27,
                "Masculino",
                "+34 689 012 345",
                "LIC-EST-22222",
                32,
                2,
                30
        );

        // Display and process student doctors
        student1.displayInfo();
        student1.completeStudentRoutine();

        System.out.println("\n");

        student2.displayInfo();
        student2.completeStudentRoutine();

        // Final summary
        System.out.println("\n\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    RESUMEN DEL SISTEMA                         ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝");
        System.out.println("\n  📊 Estadísticas del día:");
        System.out.println("  ─────────────────────────");
        System.out.println("  ✓ Pacientes de Consulta atendidos: 2");
        System.out.println("  ✓ Pacientes de Emergencia atendidos: 2");
        System.out.println("  ✓ Médicos Especialistas en servicio: 2");
        System.out.println("  ✓ Médicos Estudiantes en formación: 2");
        System.out.println("\n  🎯 Principios SOLID implementados:");
        System.out.println("  ───────────────────────────────────");
        System.out.println("  ✓ SRP: Cada clase tiene una responsabilidad única");
        System.out.println("  ✓ OCP: Clases abiertas para extensión, cerradas para modificación");
        System.out.println("  ✓ LSP: Subclases sustituyen a sus clases base");
        System.out.println("  ✓ ISP: Interfaces específicas (Treatable, Workable)");
        System.out.println("  ✓ DIP: Dependencia en abstracciones, no implementaciones");
        System.out.println("\n  💡 Conceptos POO demostrados:");
        System.out.println("  ──────────────────────────────");
        System.out.println("  ✓ Encapsulamiento: Atributos privados con getters/setters");
        System.out.println("  ✓ Herencia: Character → Patient/Doctor → Subclases");
        System.out.println("  ✓ Polimorfismo: Métodos sobrescritos en cada subclase");
        System.out.println("  ✓ Abstracción: Clases abstractas e interfaces");
        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║           ¡Gracias por usar nuestro sistema! 🏥               ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");
    }
}