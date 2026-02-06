package cn.snwalker.design.structural.proxy.JDK_proxy;

/**
 * 火车站（目标类） 具有卖票功能，实现SellTickets接口。
 */
public class TrainStation implements SellTickets {
    public void sell() {
        System.out.println("火车站卖票");
    }
}
