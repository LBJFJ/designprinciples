package com.webapp.lbj.srp.example1.v3;

class Animal {
    public void breathe(String animal) {
        if ("鱼".equals(animal)) {
            System.out.println(animal + "呼吸水");
        } else {
            System.out.println(animal + "呼吸空气");
        }
    }
}


public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
        animal.breathe("鱼");
    }
}
