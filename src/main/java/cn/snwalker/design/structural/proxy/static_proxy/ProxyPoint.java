package cn.snwalker.design.structural.proxy.static_proxy;

/**
 * 代理点（代理类） 通过代理对象间接访问目标对象，控制访问。
 */
public class ProxyPoint implements SellTickets {
    private TrainStation trainStation = new TrainStation();
    public void sell() {
        System.out.println("代理点收取一定的服务费"); // 增强目标对象的sell()方法。
        trainStation.sell();
    }
}
