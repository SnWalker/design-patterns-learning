# Design Patterns Learning Journey

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.oracle.com/java/)
[![Spring Analysis](https://img.shields.io/badge/Focus-Spring%20Internal-green)](https://github.com/SnWalker/micro-Spring)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/SnWalker/design-patterns-learning)

> 从业务场景出发，深入理解 23 种设计模式，并探究其在 Spring 框架中的底层应用。
> 
> *Companion repository to [micro-Spring](https://github.com/SnWalker/micro-Spring)*

## 📖 项目简介 | Introduction

很多开发者熟背 23 种设计模式，却在实际开发中写出满屏的 `if-else`。

本项目旨在解决“懂理论但不会用”的痛点。区别于传统的 `Foo/Bar` 抽象代码，本项目具有以下特点：

1.  **场景化实战**：每个模式都基于真实的业务场景（如：支付策略、日志装饰、数据库连接池）。
2.  **Spring 源码映射**：重点分析该模式在 Spring 源码中的具体落地，并与我的手写容器 [micro-Spring](https://github.com/SnWalker/micro-Spring) 进行联动。
3.  **工程化规范**：遵循标准 Java 工程结构，注重代码规范与注释。

## 📂 目录结构 | Project Structure

```text
src/main/java/cn/snwalker/design
├── 01_creational (创建型)
│   ├── singleton       # 单例模式 (双重检查锁/枚举/饿汉)
│   └── factory         # 工厂模式 (简单工厂/工厂方法)
├── 02_structural (结构型)
│   ├── proxy           # 代理模式 (静态/JDK动态/CGLIB动态)
│   ├── decorator       # 装饰器模式 (功能增强)
│   └── adapter         # 适配器模式 (接口兼容)
└── 03_behavioral (行为型)
    ├── strategy        # 策略模式 (算法替换)
    ├── template        # 模板方法 (流程骨架)
    └── observer        # 观察者模式 (事件驱动)
```

## 🎯 学习进度与源码分析 | Roadmap & Analysis

| 模式分类 | 模式名称 (Pattern) | 状态 | 关联业务场景 (Demo) | 🔗 Spring/Micro-Spring 核心应用 (面试重点) |
| :--- | :--- | :--- | :--- | :--- |
| **创建型** | **单例模式 (Singleton)** | ⏳ | 数据库连接池模拟 | **DefaultSingletonBeanRegistry**: 保证 Bean 在容器内的唯一性 (三级缓存的基础) |
| **创建型** | **工厂方法 (Factory Method)** | ⏳ | 支付渠道创建工厂 | **BeanFactory**: 屏蔽 Bean 的复杂创建过程 (实例化/填充/代理) |
| **结构型** | **代理模式 (Proxy)** | 🏃 | **(核心)** 模拟事务切面拦截 | **AOP**: 使用 `JdkDynamicAopProxy` 与 `CglibAopProxy` 实现无侵入式增强 |
| **结构型** | **适配器模式 (Adapter)** | ⏳ | 多种登录方式适配 | **HandlerAdapter**: Spring MVC 适配不同的 Controller 处理器 |
| **结构型** | **装饰器模式 (Decorator)** | ⏳ | 咖啡加糖/加奶 | **Wrapper**: Spring Session 中的 RequestWrapper 对请求进行增强 |
| **行为型** | **模板方法 (Template)** | ⏳ | JDBC 操作流程封装 | **refresh()**: `AbstractApplicationContext` 定义了容器启动的 12 个标准步骤 |
| **行为型** | **策略模式 (Strategy)** | ⏳ | 聚合支付 (阿里/微信) | **ResourceLoader**: 针对 ClassPath/FileSystem/URL 采用不同的资源加载策略 |
| **行为型** | **观察者模式 (Observer)** | ⏳ | 订单状态变更通知 | **Event机制**: `ApplicationEventMulticaster` 实现容器事件的发布与监听 |
| **行为型** | **责任链模式 (Chain)** | ⏳ | 请假审批流程 | **Filter/Interceptor**: Spring Security 过滤器链与 MVC 拦截器链 |

> **图例说明：**
> *   ✅：已完成代码与单元测试
> *   🏃：正在攻克中 (重点难点)
> *   ⏳：计划中


## 🔗 关联项目

*   [**micro-Spring**](https://github.com/SnWalker/micro-Spring): 本项目的“实战演练场”，我在这里从零手写了一个 Spring 容器，真正将上述设计模式落地。

---
*Created by [SnWalker](https://github.com/SnWalker)*