# 🏥 Sistema de Gestión Hospitalaria

Sistema de gestión hospitalaria desarrollado en Java que implementa los principios de Programación Orientada a Objetos (POO) y SOLID.

---

## 📋 Tabla de Contenidos

- [Descripción](#descripción)
- [Características](#características)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Diagrama UML](#diagrama-uml)
- [Principios Implementados](#principios-implementados)
- [Instalación](#instalación)
- [Compilación y Ejecución](#compilación-y-ejecución)
- [Uso](#uso)
- [Autores](#autores)

---

## 📖 Descripción

Este proyecto es un sistema de gestión hospitalaria que modela las operaciones básicas de un hospital, incluyendo la gestión de pacientes (consulta y emergencia) y personal médico (especialistas y estudiantes/residentes).

El sistema demuestra la aplicación práctica de:
- **Encapsulamiento**: Atributos privados con getters y setters
- **Herencia**: Jerarquía de clases de 3 niveles
- **Polimorfismo**: Sobrescritura de métodos
- **Abstracción**: Clases abstractas e interfaces
- **Principios SOLID**: Código mantenible y extensible

---

## ✨ Características

### 🏥 Gestión de Pacientes
- **Pacientes de Consulta Externa**: Citas programadas con control de enfermería
- **Pacientes de Emergencia**: Admisión urgente con cirugías y rehabilitación

### 👨‍⚕️ Gestión de Personal Médico
- **Médicos Especialistas**: Con especialidad y años de experiencia
- **Médicos Estudiantes/Residentes**: En formación con horas de estudio

### 📊 Funcionalidades del Sistema
- Registro completo de información de pacientes y médicos
- Procesos de admisión diferenciados por tipo
- Tratamientos médicos especializados
- Rutinas de trabajo para personal médico
- Generación de reportes visuales en consola

---

## 📂 Estructura del Proyecto

```
ElHospital/
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   │
│                   ├── interfaces/
│                   │   ├── Treatable.java       # Interface para pacientes
│                   │   └── Workable.java        # Interface para médicos
│                   │
│                   ├── model/
│                   │   ├── Character.java       # Superclase abstracta
│                   │   ├── Patient.java         # Clase abstracta de pacientes
│                   │   └── Doctor.java          # Clase abstracta de médicos
│                   │
│                   ├── patient/
│                   │   ├── ConsultationPatient.java  # Pacientes de consulta
│                   │   └── AmbulancePatient.java     # Pacientes de emergencia
│                   │
│                   ├── doctor/
│                   │   ├── SpecialistDoctor.java     # Médicos especialistas
│                   │   └── StudentDoctor.java        # Médicos estudiantes
│                   │
│                   └── Main.java                # Clase principal
│
└── README.md                                    # Este archivo
```

---

## 🎨 Diagrama UML

### Jerarquía de Clases

```
                    Character (Abstract)
                    /                 \
                   /                   \
            Patient (Abstract)    Doctor (Abstract)
            [implements Treatable] [implements Workable]
              /           \              /          \
             /             \            /            \
    ConsultationPatient  AmbulancePatient  SpecialistDoctor  StudentDoctor
```

### Descripción de Clases

#### 🔷 Interfaces

**Treatable**
- `receiveTreatment()`: Recibir tratamiento médico
- `checkOut()`: Proceso de salida

**Workable**
- `work()`: Realizar trabajo
- `eat()`: Tomar descanso

#### 🔵 Superclase

**Character** (Abstracta)
- Atributos:
  - `name`: String - Nombre completo
  - `age`: int - Edad
  - `gender`: String - Género
  - `phoneNumber`: String - Teléfono de contacto
- Métodos:
  - Getters y Setters
  - `displayInfo()`: void (abstracto)

#### 🔴 Clases Abstractas de Pacientes

**Patient** (Abstracta)
- Atributos adicionales:
  - `medicalRecordNumber`: String - Número de historia clínica
  - `diagnosis`: String - Diagnóstico médico
- Métodos:
  - `checkIn()`: void (abstracto)
  - `assignRoom()`: void

**ConsultationPatient** (Concreta)
- Atributos adicionales:
  - `appointmentDate`: String - Fecha de cita
- Métodos específicos:
  - `nurseControl()`: Control de enfermería
  - `scheduleNextAppointment()`: Programar siguiente cita

**AmbulancePatient** (Concreta)
- Atributos adicionales:
  - `emergencyLevel`: String - Nivel de emergencia
- Métodos específicos:
  - `performSurgery()`: Realizar cirugía
  - `rehabilitate()`: Proceso de rehabilitación

#### 🟢 Clases Abstractas de Médicos

**Doctor** (Abstracta)
- Atributos adicionales:
  - `licenseNumber`: String - Número de licencia médica
  - `weeklyWorkHours`: int - Horas de trabajo semanales
- Métodos:
  - `workWeek()`: void

**SpecialistDoctor** (Concreta)
- Atributos adicionales:
  - `specialty`: String - Especialidad médica
  - `yearsOfExperience`: int - Años de experiencia
- Métodos específicos:
  - `takeVacation()`: Tomar vacaciones
  - `displaySpecialty()`: Mostrar especialidad

**StudentDoctor** (Concreta)
- Atributos adicionales:
  - `currentYear`: int - Año de residencia
  - `weeklyStudyHours`: int - Horas de estudio semanales
- Métodos específicos:
  - `study()`: Tiempo de estudio
  - `displayCurrentYear()`: Mostrar año académico

---

## 🎯 Principios Implementados

### Principios de POO

#### 1. **Encapsulamiento** ✅
- Todos los atributos son **privados**
- Acceso controlado mediante **getters y setters**
- Ejemplo:
```java
private String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
```

#### 2. **Herencia** ✅
- Jerarquía de **3 niveles**:
  - Nivel 1: `Character` (Superclase)
  - Nivel 2: `Patient`, `Doctor` (Clases abstractas)
  - Nivel 3: Clases concretas (ConsultationPatient, AmbulancePatient, etc.)
- Reutilización de código mediante `extends`

#### 3. **Polimorfismo** ✅
- Sobrescritura de métodos (`@Override`)
- Métodos como `displayInfo()`, `work()`, `checkIn()` tienen diferentes implementaciones
- Ejemplo:
```java
@Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("Tipo de Paciente: Consulta Externa");
}
```

#### 4. **Abstracción** ✅
- **Clases abstractas**: Character, Patient, Doctor
- **Interfaces**: Treatable, Workable
- Métodos abstractos que obligan implementación en subclases

---

### Principios SOLID

#### 1. **S - Single Responsibility Principle (SRP)** ✅
Cada clase tiene una única responsabilidad:
- `ConsultationPatient`: Gestiona solo pacientes de consulta
- `SpecialistDoctor`: Gestiona solo médicos especialistas
- Ninguna clase tiene múltiples responsabilidades

#### 2. **O - Open/Closed Principle (OCP)** ✅
- Las clases están **abiertas para extensión** (se pueden heredar)
- Las clases están **cerradas para modificación** (no es necesario modificar código existente)
- Se pueden agregar nuevos tipos de pacientes o médicos sin modificar las clases base

#### 3. **L - Liskov Substitution Principle (LSP)** ✅
- Cualquier subclase puede sustituir a su clase padre
- Ejemplo: Cualquier `Patient` puede usarse donde se espera un `Patient`
```java
Patient patient = new ConsultationPatient(...);
patient.receiveTreatment(); // Funciona correctamente
```

#### 4. **I - Interface Segregation Principle (ISP)** ✅
- Interfaces específicas y pequeñas
- `Treatable`: Solo para entidades que reciben tratamiento (pacientes)
- `Workable`: Solo para entidades que trabajan (médicos)
- No hay interfaces "gordas" con métodos innecesarios

#### 5. **D - Dependency Inversion Principle (DIP)** ✅
- Las clases dependen de **abstracciones** (interfaces y clases abstractas)
- No dependen de implementaciones concretas
- Ejemplo: `Patient` implementa `Treatable` (abstracción)

---

## 💻 Instalación

### Requisitos Previos

- **Java JDK 8 o superior**
- Sistema operativo: Windows, macOS o Linux

### Verificar Instalación de Java

```bash
java -version
javac -version
```

Si no tienes Java instalado:
- **Windows/macOS**: Descarga desde [Oracle](https://www.oracle.com/java/technologies/downloads/)
- **Linux**: 
```bash
sudo apt update
sudo apt install default-jdk
```

---

## 🔨 Compilación y Ejecución

### Método 1: Compilación Directa

```bash
# Navegar a la carpeta del proyecto
cd ElHospital/src/main/java

# Compilar todos los archivos
javac org/example/**/*.java org/example/*.java

# Ejecutar el programa
java org.example.Main
```

### Método 2: Con Estructura de Directorios

```bash
# Desde la raíz del proyecto
# Crear carpeta para compilados
mkdir -p bin

# Compilar con salida a bin/
javac -d bin src/main/java/org/example/**/*.java src/main/java/org/example/*.java

# Ejecutar
java -cp bin org.example.Main
```

### Método 3: Usando un IDE

#### IntelliJ IDEA
1. **File** → **Open** → Seleccionar carpeta `ElHospital`
2. Esperar a que el proyecto se configure
3. Click derecho en `Main.java` → **Run 'Main.main()'**

#### Eclipse
1. **File** → **Import** → **Existing Projects into Workspace**
2. Seleccionar carpeta `ElHospital`
3. Click derecho en `Main.java` → **Run As** → **Java Application**

#### VS Code
1. Abrir carpeta `ElHospital`
2. Instalar extensión "Extension Pack for Java"
3. Abrir `Main.java`
4. Click en **Run** sobre el método `main()`

---

## 🎮 Uso

### Ejecución del Programa

Al ejecutar el programa, verás una salida estructurada en consola con:

1. **Sección 1: Pacientes de Consulta Externa**
   - Información de 2 pacientes de consulta
   - Proceso completo: admisión → enfermería → tratamiento → salida

2. **Sección 2: Pacientes de Emergencia**
   - Información de 2 pacientes de emergencia
   - Proceso completo: admisión urgente → cirugía → tratamiento → rehabilitación → alta

3. **Sección 3: Médicos Especialistas**
   - Información de 2 médicos especialistas
   - Rutina completa: trabajo → descanso → especialidad → vacaciones

4. **Sección 4: Médicos Estudiantes**
   - Información de 2 médicos estudiantes/residentes
   - Rutina completa: trabajo → descanso → estudio → información académica

5. **Resumen del Sistema**
   - Estadísticas del día
   - Principios SOLID implementados
   - Conceptos POO demostrados

### Ejemplo de Salida

```
╔════════════════════════════════════════════════════════════════╗
║                                                                ║
║          🏥  SISTEMA DE GESTIÓN HOSPITALARIA  🏥              ║
║                                                                ║
║              Bienvenido al Hospital General                    ║
║                                                                ║
╚════════════════════════════════════════════════════════════════╝


━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
          SECCIÓN 1: PACIENTES DE CONSULTA EXTERNA
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

╔════════════════════════════════════════════════════════╗
║              INFORMACIÓN DEL PACIENTE                  ║
╚════════════════════════════════════════════════════════╝
  Nombre: María García López
  Edad: 35 años
  Género: Femenino
  Teléfono: +34 612 345 678
  Número de Historia Clínica: HC-2025-001
  Diagnóstico: Hipertensión arterial
  Tipo de Paciente: Consulta Externa
  Fecha de Cita: 27/02/2026 - 10:00 AM
════════════════════════════════════════════════════════

┌─────────────────────────────────────────────────────┐
│ PROCESO DE ADMISIÓN - PACIENTE DE CONSULTA         │
└─────────────────────────────────────────────────────┘
  ✓ Admitiendo paciente: María García López
  ✓ Cita programada: 27/02/2026 - 10:00 AM
  ✓ Control de enfermería completado
    • Signos vitales tomados
    • Presión arterial: Normal
    • Temperatura: Normal
   └─ Asignando habitación al paciente: María García López
  ✓ Tratamiento médico administrado
    • Medicamentos recetados
    • Indicaciones médicas proporcionadas
  ✓ Próxima cita programada para seguimiento
  ✓ Proceso de salida completado
    • Receta médica entregada
    • Paciente dado de alta
└─────────────────────────────────────────────────────┘

[... continúa con más secciones ...]
```

---

## 📊 Datos de Prueba

El sistema viene precargado con datos de prueba:

### Pacientes de Consulta (2)
1. María García López (35 años) - Hipertensión arterial
2. Carlos Rodríguez Martínez (42 años) - Diabetes tipo 2

### Pacientes de Emergencia (2)
1. Ana Fernández Torres (28 años) - Fractura de fémur - CRÍTICO
2. Luis Sánchez Pérez (55 años) - Infarto agudo de miocardio - EMERGENCIA VITAL

### Médicos Especialistas (2)
1. Dr. Roberto Méndez (45 años) - Cardiología - 15 años experiencia
2. Dra. Elena Ruiz (38 años) - Traumatología - 10 años experiencia

### Médicos Estudiantes (2)
1. Patricia Gómez (26 años) - 3er año residencia - 25 hrs estudio/semana
2. Diego Morales (27 años) - 2do año residencia - 30 hrs estudio/semana

---

## 🛠️ Personalización

### Agregar Nuevos Pacientes

Para agregar nuevos pacientes, edita `Main.java`:

```java
// Paciente de Consulta
ConsultationPatient newPatient = new ConsultationPatient(
    "Juan Pérez",           // Nombre
    40,                     // Edad
    "Masculino",           // Género
    "+34 600 000 000",     // Teléfono
    "HC-2025-003",         // Historia Clínica
    "Gripe común",         // Diagnóstico
    "10/03/2026 - 9:00 AM" // Cita
);

// Mostrar información
newPatient.displayInfo();
newPatient.completeConsultationProcess();
```

### Agregar Nuevos Médicos

```java
// Médico Especialista
SpecialistDoctor newDoctor = new SpecialistDoctor(
    "Ana López",          // Nombre
    42,                   // Edad
    "Femenino",          // Género
    "+34 611 111 111",   // Teléfono
    "LIC-MED-99999",     // Licencia
    40,                  // Horas semanales
    "Pediatría",         // Especialidad
    12                   // Años experiencia
);

// Mostrar información
newDoctor.displayInfo();
newDoctor.completeWorkRoutine();
```

---

## 🧪 Extensibilidad

### Agregar Nuevo Tipo de Paciente

1. Crear nueva clase que extienda `Patient`:

```java
package org.example.patient;

import org.example.model.Patient;

public class TelehealthPatient extends Patient {
    private String videoCallLink;
    
    public TelehealthPatient(String name, int age, String gender, 
                             String phoneNumber, String medicalRecordNumber,
                             String diagnosis, String videoCallLink) {
        super(name, age, gender, phoneNumber, medicalRecordNumber, diagnosis);
        this.videoCallLink = videoCallLink;
    }
    
    @Override
    public void checkIn() {
        System.out.println("Conectando a videollamada: " + videoCallLink);
    }
    
    @Override
    public void receiveTreatment() {
        System.out.println("Consulta virtual realizada");
    }
    
    @Override
    public void checkOut() {
        System.out.println("Sesión finalizada");
    }
}
```

2. Usar en `Main.java`:

```java
TelehealthPatient virtualPatient = new TelehealthPatient(
    "Pedro García", 50, "Masculino", "+34 622 222 222",
    "HC-2025-004", "Control rutinario",
    "https://meet.hospital.com/room123"
);
```

---

## 📝 Notas Técnicas

### Convenciones de Código

- **Nombres de clases**: PascalCase (ej: `ConsultationPatient`)
- **Nombres de métodos**: camelCase (ej: `displayInfo`)
- **Nombres de variables**: camelCase (ej: `phoneNumber`)
- **Nombres de paquetes**: minúsculas (ej: `org.example.patient`)
- **Constantes**: UPPER_SNAKE_CASE (no usadas en este proyecto)

### Buenas Prácticas Implementadas

✅ Código en **inglés** (clases, métodos, variables)  
✅ Mensajes en **español** (salida de consola)  
✅ **Documentación JavaDoc** en cada clase y método  
✅ **Nombres descriptivos** y significativos  
✅ **Encapsulamiento** estricto  
✅ **Separación de responsabilidades**  
✅ **Sin código duplicado**  
✅ **Métodos pequeños y cohesivos**  

---

## 🐛 Solución de Problemas

### Error: "package org.example does not exist"

**Solución**: Asegúrate de compilar desde la raíz correcta:
```bash
cd src/main/java
javac org/example/**/*.java org/example/*.java
```

### Error: "Could not find or load main class"

**Solución**: Verifica el classpath:
```bash
java -cp bin org.example.Main
```

### Error: "javac is not recognized"

**Solución**: Java no está instalado o no está en el PATH. Instala Java JDK.

---

## 📈 Estadísticas del Proyecto

- **Total de archivos**: 10 archivos .java
- **Total de clases**: 10 clases
- **Interfaces**: 2
- **Clases abstractas**: 3
- **Clases concretas**: 4
- **Clase principal**: 1
- **Líneas de código**: ~850 líneas
- **Paquetes**: 5 (interfaces, model, patient, doctor, raíz)

---

## 🎓 Conceptos Educativos

Este proyecto es ideal para aprender:

✅ Programación Orientada a Objetos  
✅ Principios SOLID  
✅ Diseño de jerarquías de clases  
✅ Uso de interfaces  
✅ Polimorfismo y sobrescritura  
✅ Encapsulamiento y abstracción  
✅ Buenas prácticas de programación Java  

---

## 📚 Recursos Adicionales

- [Documentación Java](https://docs.oracle.com/en/java/)
- [Principios SOLID](https://www.digitalocean.com/community/conceptual_articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)
- [POO en Java](https://www.w3schools.com/java/java_oop.asp)

---

## 📄 Licencia

Este proyecto es de código abierto y está disponible para fines educativos.

---

## 👥 Autores

Desarrollado como proyecto educativo para demostrar conceptos de POO y SOLID en Java.

---

## 📞 Contacto

Para preguntas o sugerencias sobre este proyecto, por favor crea un issue en el repositorio.

---

## 🙏 Agradecimientos

Gracias por revisar este proyecto. Esperamos que sea útil para tu aprendizaje de Java y POO.

---

**Última actualización**: Marzo 2026  
**Versión**: 1.0.0  
**Estado**: ✅ Completado y funcional

---

## 🚀 Próximos Pasos Sugeridos

1. ✅ Ejecutar y probar el programa
2. ✅ Revisar el código de cada clase
3. ✅ Experimentar agregando nuevos pacientes/médicos
4. ✅ Intentar crear nuevos tipos de clases
5. ✅ Estudiar cómo se aplican los principios SOLID
6. ✅ Modificar y personalizar según necesites

---

**¡Feliz Programación! 🎉**
