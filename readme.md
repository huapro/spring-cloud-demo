> 应用启动顺序：


1.    discovery-eureka #服务注册中心，启动后访问http://localhost:10001/
2.    provider1 #服务提供者-节点1，启动后访问http://localhost:20001/demo/index
3.    provider1-node2 #服务提供者-节点2，启动后访问http://localhost:20002/demo/index
4.    consumer #服务消费者，启动后访问http://localhost:30001/consumer/p1/demo/index，两个节点都启动的情况下反复刷新页面可看到负载均衡效果，两个节点都断开的情况下访问可看到熔断降级处理效果
5.    hystrix-board #熔断监控台，启动后访问http://localhost:10003/hystrix.stream，输入http://localhost:30001/hystrix.stream ==> Monitor Stream 可看到 熔断监控台的图形化界面
6.    gateway #服务网关，启动后访问http://localhost:10002/provider1/demo/index，两个服务提供者节点都开启的情况下反复刷新可看到负载均衡的效果
