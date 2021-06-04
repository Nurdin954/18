package com.company;

public class Course {
    int id;
    String name;
    int price;
    int duration;
    Teacher teacher;
    Student[] students;

    public Course() {
    }

    public Course(int id, String name, int price, int duration, Teacher teacher, Student[] students) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.teacher = teacher;
        this.students = students;
    }

    public void studentsCount(int count) {
        this.students = new Student[count];
    }

   /* public boolean addStudent(Student student) {
        for(int i = 0; i < this.students.length; ++i) {
            if (this.students[i] == null) {
                this.students[i] = student;
                return true;
            }
        }

        return false;
    }

    public void removeStudent(String phoneNumber) {
    }*/
}

