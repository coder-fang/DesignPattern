package com.example.design.principle.singleresponsebility;

/**
 * @Author: FangJu
 * @Date: 2019/10/6
 */
public class CourseImpl implements ICourseContent, ICourseManager {
    public String getCourseName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {
        //TODO 学习课程
    }

    public void refundCourse() {
        //TODO 退订课程
    }
}
