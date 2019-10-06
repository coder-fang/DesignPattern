package com.example.design.principle.singleresponsebility;

/**
 * @Author: FangJu
 * @Date: 2019/10/6
 */
public interface ICourseContent {
    String getCourseName();//获取课程名称

    byte[] getCourseVideo();//获取课程的字节流
}
