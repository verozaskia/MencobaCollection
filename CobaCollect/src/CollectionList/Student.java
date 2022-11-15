/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionList;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Student {
    ArrayList<String> studentNames = new ArrayList();

    public void addStudents(String studentName, int idx){
        if(idx == -1)
            this.studentNames.add(studentName);
        else
            this.studentNames.add(idx, studentName);
    }
    public void removeStudents(String studentName){
        this.studentNames.remove(studentName);
    }

    public void displayStudents(){
        int i = 0;
        for(String student: studentNames){
            System.out.println("ID: " + (i+1) + "\tStudent Name: " + student);
            i++;
        }
    }
}