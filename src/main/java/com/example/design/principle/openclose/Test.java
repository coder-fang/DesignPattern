package com.example.design.principle.openclose;

/**
 * @Author: FangJu
 * @Date: 2019/10/6
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1, "Java", 200d);
        System.out.println(String.format("课程ID：%d\n课程名：%s\n课程价格：%f\n课程原始价格：%f",
                iCourse.getId(), iCourse.getName(), iCourse.getPrice(), ((JavaDiscountCourse) iCourse).getOriginPrice()));
    }
}
