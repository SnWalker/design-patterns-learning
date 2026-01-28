package cn.snwalker.design.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        // 饿汉式
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1 == singletonEager2);
        System.out.println("-----------------------------------------");
        // 懒汉式
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);
        System.out.println("-----------------------------------------");
        // 静态内部类
        SingletonInnerClass singletonInnerClass1 = SingletonInnerClass.getInstance();
        SingletonInnerClass singletonInnerClass2 = SingletonInnerClass.getInstance();
        System.out.println(singletonInnerClass1 == singletonInnerClass2);
        System.out.println("-----------------------------------------");
        // 枚举
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum1 == singletonEnum2);
    }
}
