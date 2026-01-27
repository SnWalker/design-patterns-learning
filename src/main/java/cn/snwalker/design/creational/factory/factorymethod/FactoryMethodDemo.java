package cn.snwalker.design.creational.factory.factorymethod;

/**
 * 工厂方法模式案例 客户端（对象的使用者）
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        ComputerFactory pcFactory = new PCFactory("2 GB", "500 GB", "2.4 GHz");
        Computer pc = pcFactory.createComputer();

        ComputerFactory serverFactory = new ServerFactory("16 GB", "1 TB", "2.9 GHz");
        Computer server = serverFactory.createComputer();

        System.out.println("PC 配置:" + pc);
        System.out.println("Server 配置:" + server);
    }
}
