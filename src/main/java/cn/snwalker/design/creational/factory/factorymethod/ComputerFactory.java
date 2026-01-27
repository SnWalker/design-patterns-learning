package cn.snwalker.design.creational.factory.factorymethod;

/**
 * 抽象工厂接口 (Abstract Creator)
 * <p>
 * 工厂方法模式的核心接口，定义了创建产品的方法。
 * 具体的创建逻辑交给子类（Concrete Creator）去实现。
 * <p>
 * <b>符合开闭原则 (Open/Closed Principle)：</b>
 * 当需要增加新的产品（如 Laptop）时，只需扩展一个新的工厂类（LaptopFactory），
 * 而无需修改现有的 ComputerFactory 接口或其他工厂代码。
 */
public interface ComputerFactory {
    Computer createComputer();
}