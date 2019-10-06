package com.example.design.principle.dependenceinversion;

/**
 * @Author: FangJu
 * @Date: 2019/10/6
 */
public class Test {
    //版本v1
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.studyJavaCourse();
//        person.studyJavaScriptCourse();
//        person.studyPythonCourse();
//    }
    //版本v2
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.studyNetCourse(new JavaCourse());
//        person.studyNetCourse(new JavaScriptCourse());
//        person.studyNetCourse(new PythonCourse());
//    }
    //版本v3
//    public static void main(String[] args) {
//        Person person = new Person(new JavaCourse());
//        person.studyNetCourse();
//    }
    //版本v4
    public static void main(String[] args) {
        Person person = new Person();
        person.setCourse(new JavaCourse());
        person.studyNetCourse();
        person.setCourse(new JavaScriptCourse());
        person.studyNetCourse();
        person.setCourse(new PythonCourse());
        person.studyNetCourse();
    }
}
