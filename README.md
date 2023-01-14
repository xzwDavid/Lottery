# Lottery
Lottery System based on Domain-Driven Design (DDD) | MyBatis, Redis, MySQL, Zookeeper, XDB-Router. 
Adopted abstraction, divide and conquer and DDD knowledge to identify and define service boundaries, implemented domain services to perform domain operations and business rules, and decouple functional logic.
Achieved service differentiation using probabilistic algorithms, and achieved service availability under high concurrency requirements (TPS 5000~8000) using Redis and fine-grained distributed locks.
Realized asynchronous decoupling using Kafka and RabbitMQ, which enhances the usability and stability.


Lottery 抽奖系统 - 基于领域驱动设计的四层架构实践 | MyBatis, Redis, MySQL, Zookeeper, XDB-Router
Lottery系统运⽤抽象, 分治和DDD知识拆解服务边界, 凝练领域服务功能, 解耦功能流程。利⽤概率算法在更⾼的逻辑层⾯实现了服务的差异化。
在可⽤性和性能⽅⾯, 利⽤Redis和细粒度的分布式锁实现了在⾼并发量(TPS 5000~8000)下的服务可⽤性。
利⽤Kafka和RabbitMQ来实现异步解耦,增强了Client端的可⽤性。
