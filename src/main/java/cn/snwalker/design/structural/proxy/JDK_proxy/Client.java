package cn.snwalker.design.structural.proxy.JDK_proxy;

/**
 * 客户端（访问类）
 */
public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        ProxyFactory proxyFactory = new ProxyFactory();

        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
