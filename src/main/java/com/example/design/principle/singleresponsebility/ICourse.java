package com.example.design.principle.singleresponsebility;

/**
 * @Author: FangJu
 * @Date: 2019/10/6
 */
public interface ICourse {
    String getCourseName();//获取课程名称

    byte[] getCourseVideo();//获取课程的字节流
    //----------------------------------------
    void studyCourse();//学习课程

    void refundCourse();//退订课程
}
