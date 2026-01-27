package cn.snwalker.design.creational.factory.abstractfactory;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("填充 Red");
    }
}
