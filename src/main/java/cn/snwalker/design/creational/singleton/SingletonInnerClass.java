package cn.snwalker.design.creational.singleton;

/**
 * 单例模式
 * 懒汉式 方式6 静态内部类
 * 优点：利用JVM类加载机制保证延迟加载和线程安全。
 */
public class SingletonInnerClass {
    // 1、私有构造方法
    private SingletonInnerClass() {}

    private static class SingletonInnerClassHolder {
        // 2、声明对象
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    // 3、对外提供public方法获取唯一实例
    public static SingletonInnerClass getInstance() {
        return SingletonInnerClassHolder.INSTANCE;
    }

}
