/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CollectionList;

/**
 *
 * @author USER
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.addStudents("Mewgulf",-1);
        student.addStudents("Mosbank",-1);
        student.displayStudents();
        student.addStudents("Meenping",1);
        student.displayStudents();
    }
}
