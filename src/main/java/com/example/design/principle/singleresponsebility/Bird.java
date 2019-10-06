package com.example.design.principle.singleresponsebility;

/**
 * @Author: FangJu
 * @Date: 2019/10/6
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
//public interface Bird {
//    void mainMoveMode(String birdName);
//}
