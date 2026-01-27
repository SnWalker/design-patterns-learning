package cn.snwalker.design.creational.factory.factorymethod;

/**
 * 具体工厂 (Concrete Creator)
 * <p>
 * 负责生产具体的产品（Server）。
 * 实现了抽象工厂定义的接口。
 */
public class ServerFactory implements ComputerFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
