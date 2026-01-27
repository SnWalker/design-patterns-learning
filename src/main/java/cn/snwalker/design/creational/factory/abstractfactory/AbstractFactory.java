package cn.snwalker.design.creational.factory.abstractfactory;

/**
 * 抽象工厂类 (Abstract Factory)
 * <p>
 * 定义了一个接口，用于创建相关或依赖对象的家族，而不需要指定它们具体的类。
 * <p>
 * <b>重点：</b>
 * 1. <b>产品族 (Product Family)</b>：抽象工厂的核心在于“一族”产品。
 *    例如在 GUI 系统中，"Windows工厂" 生产 "Windows按钮" 和 "Windows文本框"（它们是一族的）。
 *    "Mac工厂" 生产 "Mac按钮" 和 "Mac文本框"。
 * <p>
 * <b>案例说明：</b>
 * 本案例（Shape + Color）是网上传播较广的简化版。
 * 它展示了“工厂的工厂”这一概念，但设计上略有缺陷（违反接口隔离原则）：
 * <i>ShapeFactory 被迫实现 getColor() 并返回 null。</i>
 * 在真实项目中，应避免这种设计，确保工厂内的产品确实是“相关联”的。
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
}
