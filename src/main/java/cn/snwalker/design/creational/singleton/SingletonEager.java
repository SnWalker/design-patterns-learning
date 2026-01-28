package cn.snwalker.design.creational.singleton;

/**
 * 单例模式
 * 饿汉式  方式1 静态成员变量 （恶汉式）
 * 缺点：类一加载就创建了instance对象，一直不用会造成内存浪费。
 */
/*public class SingletonEager {
    // 1、私有化构造方法
    private SingletonEager(){}
    // 2、声明并创建一个对象
    private static SingletonEager inatance = new SingletonEager();
    // 3、对外提供静态方法获取唯一实例
    public static SingletonEager getInatance() {
        return inatance;
    }
}*/

/**
 * 单例模式
 * 饿汉式  方式2 静态代码块
 * 缺点：实例instance随类的加载而被创建，一直不用会造成内存浪费。
 */
public class SingletonEager {
    // 1、私有化构造方法
    private SingletonEager(){}
    // 2、声明一个对象
    private static SingletonEager inatance;
    // 在静态代码块中创建对象
    static {
        inatance = new SingletonEager();
    }
    // 3、对外提供静态方法获取唯一实例
    public static SingletonEager getInstance() {
        return inatance;
    }
}

