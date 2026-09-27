import enums.ClassYear;
import enums.DegreeLevel;
import enums.Gender;
import enums.StudentStatus;
import model.Program;
import model.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        // Create an ArrayList to store registered students
        ArrayList<Student> students = new ArrayList<>();

        // Create Software Engineering Program
        Program program = new Program(
                UUID.randomUUID(),
                "SE",
                "Software Engineering",
                null,
                DegreeLevel.LISANS,
                240,
                4,
                "EN",
                true
        );

        // Create Kertoume Brahim's Student object
        Student student = new Student(
                UUID.randomUUID(),
                "250504516",
                "20060530",
                "Kertoume",
                "Brahim",
                LocalDate.of(2006, 5, 30),
                Gender.FEMALE,
                "250504516@st.atlas.edu.tr",
                "",
                "Istanbul, Turkiye",
                program,
                2026,
                ClassYear.YEAR_1,
                StudentStatus.ACTIVE,
                null,
                LocalDateTime.now()
        );

        // Register the student
        students.add(student);

        // Print registered students
        System.out.println("=== Student Information System ===");
        System.out.println("Language: Java");
        System.out.println("Registered Students:");

        for (Student registeredStudent : students) {
            System.out.println(registeredStudent);
        }
    }
}

