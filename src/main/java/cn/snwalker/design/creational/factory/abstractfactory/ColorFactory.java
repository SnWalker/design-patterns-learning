package cn.snwalker.design.creational.factory.abstractfactory;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        if (colorType == null) return null;

        if (colorType.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (colorType.equalsIgnoreCase("green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {return null;}
}
