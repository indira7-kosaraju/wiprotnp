package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student studentObject)
            throws NullNameException,
                   NullMarksArrayException,
                   NullStudentObjectException {

        if (studentObject == null) {
            throw new NullStudentObjectException();
        }

        if (studentObject.getName() == null) {
            throw new NullNameException();
        }

        if (studentObject.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }

    public String findGrades(Student studentObject) {

        int marks[] = studentObject.getMarks();

        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
        }

        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        if (sum < 150)
            return "C";
        else if (sum < 200)
            return "B";
        else if (sum < 250)
            return "A";
        else
            return "A+";
    }
}