package cn.snwalker.design.structural.proxy.static_proxy;

/**
 * 客户端（访问类）
 */
public class Client {
    public static void main(String[] args) {
        SellTickets proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
