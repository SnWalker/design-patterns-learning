package cn.snwalker.design.creational.factory.abstractfactory;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;

        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {return null;}
}
