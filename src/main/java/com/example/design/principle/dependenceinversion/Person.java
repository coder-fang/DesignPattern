package com.example.design.principle.dependenceinversion;

/**
 * @Author: FangJu
 * @Date: 2019/10/6
 */
public class Person {

    private ICourse iCourse;

    public Person() {

    }

    public void setCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyNetCourse() {
        iCourse.studyCourse();
    }

//    public void studyJavaCourse() {
//        System.out.println("学习了Java");
//    }
//
//    public void studyJavaScriptCourse() {
//        System.out.println("学习了JavaScript");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("学习了Python");
//    }
}
