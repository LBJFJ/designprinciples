package com.webapp.lbj.srp.example1.v3;

/**
 * 如果直接修改类Animal来达成目的，虽然违背了单一职责原则，但花销却小的多，代码如下：
 */
public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");

        animal.breathe("鱼");
    }
}

class Animal {
    public void breathe(String animal) {
        if ("鱼".equals(animal)) {
            System.out.println(animal + "呼吸水");
        } else {
            System.out.println(animal + "呼吸空气");
        }
    }
}

/*
* 可以看到，这种修改方式要简单的多。
* 
* 但是却存在着隐患：有一天需要将鱼分为呼吸淡水的鱼和呼吸海水的鱼，则又需要修改Animal类的breathe方法，
* 而对原有代码的修改会对调用“猪”“牛”“羊”等相关功能带来风险，也许某一天你会发现程序运行的结果变为“牛呼吸水”了。
* 
* 这种修改方式直接在代码级别上违背了单一职责原则，虽然修改起来最简单，但隐患却是最大的。
*/
