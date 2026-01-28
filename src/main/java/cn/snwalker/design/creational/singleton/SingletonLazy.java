package cn.snwalker.design.creational.singleton;

/**
 * 单例模式
 * 懒汉式 方式3
 * 优点：第一次使用时才会创建对象，实现懒加载，避免内存浪费。
 * 缺点：线程不安全，可能创建多个实例。
 */
/*public class SingletonLazy {
    // 1、私有构造方法
    private SingletonLazy(){}
    // 2、在成员变量位置声明一个静态对象
    private static SingletonLazy instance;
    // 3、对外提供静态方法获取唯一实例
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}*/

/**
 * 单例模式
 * 懒汉式 方式4
 * 优点：（1）线程安全。线程1进入getInstance()，线程1退出该方法前，线程2无法进入该方法，避免多个线程同时位于创建对象的if语句块内。
 *      （2）第一次使用时才会创建对象，实现懒加载，避免内存浪费。
 * 缺点：使getInstance()执行效率低，无法并发执行。初始化instance时才存在线程安全问题，一旦初始化完成就不存在了。
 */
/*public class SingletonLazy {
    // 1、私有构造方法
    private SingletonLazy(){}
    // 2、在成员变量位置声明一个静态对象
    private static SingletonLazy instance;
    // 3、对外提供静态方法获取唯一实例
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}*/

/**
 * 单例模式
 * 懒汉式 方式5 双重检查锁
 * 优点：（1）线程安全，且getInstance()执行效率高。调整加锁的时机，只有当instance为null需要创建对象时，才去获取锁。
 *      （2）第一次使用时才会创建对象，实现懒加载，避免内存浪费。
 * 缺点：可能存在空指针问题，原因是new SingletonLazy()创建对象操作在计算机底层不是原子性的，它分3步操作1
 *      1、分配内存。
 *      2、初始化对象。
 *      3、将instance指向这块内存。
 *      JVM 可能会指令重排序，比如变为1->3->2。如果在执行完1、3时（此时instance已不为空，但还没有初始化好），另一个线程
 *      来了，它在第一次判断时发现instance不为空就直接拿去用。结果就是拿到了一个半成品对象，访问该对象的属性和方法可能报空
 *      指针异常。
 */
/*public class SingletonLazy {
    // 1、私有构造方法
    private SingletonLazy(){}
    // 2、在成员变量位置声明一个静态对象
    private static SingletonLazy instance;
    // 3、对外提供静态方法获取唯一实例
    public static SingletonLazy getInstance() {
        if (instance == null) { // 提升性能：第一次判断，若instance不为空，不进入抢锁阶段，直接返回实例
            synchronized (SingletonLazy.class) {
                if (instance == null) { // 确保安全：第二次判断，抢到锁后再次判断是否为null
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

}*/

/**
 * 懒汉式 方式6 双重检查锁
 */
public class SingletonLazy {
    // 1、私有构造方法
    private SingletonLazy(){}
    // 2、在成员变量位置声明一个静态对象
    private static volatile SingletonLazy instance; // 关键字volatile：禁止指令重排序，确保绝对安全
    // 3、对外提供静态方法获取唯一实例
    public static SingletonLazy getInstance() {
        if (instance == null) { // 提升性能：第一次判断，若instance不为空，不进入抢锁阶段，直接返回实例
            synchronized (SingletonLazy.class) {
                if (instance == null) { // 确保安全：第二次判断，抢到锁后再次判断是否为null
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

}
