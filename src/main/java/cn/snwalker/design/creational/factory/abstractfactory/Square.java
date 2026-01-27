package cn.snwalker.design.creational.factory.abstractfactory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个 Square");
    }
}
