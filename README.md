# Student Information System

## Object Oriented Design - Assignment 1

### Student Information

**Student:** Kourtoume Brahim

**Student Number:** 250504516

**Program:** Software Engineering

**Programming Language:** Java

**JDK:** 21

**IDE:** IntelliJ IDEA

## Project Description

This project implements a Student Information System using
object-oriented programming principles.

The database schema provided for the assignment was used as a
reference for designing the Java classes and their relationships.

## Model Classes

The project contains the following classes:

- Faculty
- Department
- Program
- Student
- Instructor
- Course
- AcademicTerm
- CoursePrerequisite
- ProgramCourse

## Enumerations

The project uses Java enums for:

- Gender
- StudentStatus
- DegreeLevel
- ClassYear
- InstructorTitle
- CourseType
- PrerequisiteType
- Semester

## Object-Oriented Features

Each model class contains:

- Private fields
- Constructors
- Getter methods
- Setter methods
- Overridden toString() methods

Foreign-key relationships from the database schema are represented
using object references between the Java classes.

Examples include:

- Student -> Program
- Program -> Department
- Department -> Faculty
- Department -> Instructor
- Course -> Department
- ProgramCourse -> Program
- ProgramCourse -> Course
- CoursePrerequisite -> Course
- CoursePrerequisite -> prerequisite Course

## Main Program

The Main class creates a Program object and a Student object.

The Student object is added to an ArrayList.

The registered student is then printed to the console.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 21 is configured.
3. Open Main.java.
4. Run the main method.
5. The registered student information will be displayed in the console.

## Assignment Language

Java
