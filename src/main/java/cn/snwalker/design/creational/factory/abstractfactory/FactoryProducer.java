package cn.snwalker.design.creational.factory.abstractfactory;

/**
 * 工厂生成器 (Factory Producer)
 * <p>
 * 这是一个超级工厂（或者叫简单工厂），它的职责是“生产工厂”。
 * 客户端不直接实例化 ShapeFactory 或 ColorFactory，而是通过这个类来获取。
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) { // 为什么是静态方法？不加static可以吗？
        // 不需要先判断一下choice是否等null吗？
        if (choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }

        return null;
    }
}
