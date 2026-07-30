package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public StudentMain() {

        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        StudentMain obj = new StudentMain();

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (Student s : data) {

            try {

                String result = report.validate(s);

                if (result.equals("VALID")) {

                    String grade = report.findGrades(s);

                    System.out.println(
                            "Student Name : " + s.getName()
                                    + " Grade : " + grade);
                }

            } catch (Exception e) {

                System.out.println(e);
            }
        }

        System.out.println();
        System.out.println("Null Marks Array Count : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Null Name Count : "
                + service.findNumberOfNullName(data));

        System.out.println("Null Object Count : "
                + service.findNumberOfNullObjects(data));
    }
}