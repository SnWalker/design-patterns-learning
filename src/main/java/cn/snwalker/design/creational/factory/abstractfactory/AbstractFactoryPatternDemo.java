package cn.snwalker.design.creational.factory.abstractfactory;

/**
 * 客户端 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        // 获取形状为Circle的对象
        Shape circle = shapeFactory.getShape("circle");
        // 调用Circle的draw方法
        circle.draw();
        // 获取形状为Square的对象
        Shape square = shapeFactory.getShape("square");
        // 调用Square的draw方法
        square.draw();
        // 获取形状为Rectangle的对象
        Shape rectangle = shapeFactory.getShape("rectangle");
        // 调用Square的draw方法
        rectangle.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        // 获取颜色为Red的对象
        Color red = colorFactory.getColor("red");
        // 调用red对象的fill方法
        red.fill();
        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("GREEN");
        //调用 Green 的 fill 方法
        color2.fill();
        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor("BLUE");
        //调用 Blue 的 fill 方法
        color3.fill();
    }
}
