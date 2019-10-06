package com.example.design.principle.openclose;

/**
 * @Author: FangJu
 * @Date: 2019/10/6
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        Double originPrice = getOriginPrice();
        double disCountPrice;
        if (originPrice > 0 && originPrice < 100) {
            disCountPrice = originPrice * 0.95;
        } else if (originPrice >= 100 && originPrice < 200) {
            disCountPrice = originPrice * 0.9;
        } else {
            disCountPrice = originPrice * 0.8;
        }
        return disCountPrice;
    }
}
