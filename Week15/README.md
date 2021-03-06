

## JVM

JVM的重点主要是垃圾收集器-GC。JAVA经过这么多年的发展，产生了很多优秀的垃圾收集器，我们需要掌握不同的GC收集器各有什么优缺点，如何分析GC日志。在不同的情况下，我们如何搭配选择垃圾收集器。如果生产环境出现性能问题，我们要怎么去对JVM进行分析和调优。这就需要我们掌握JVM的相关的知识和相关的分析工具与手段，才能在遇到问题的时候游刃有余。



## 并发编程

并发编程本质是通过多线程并发执行来提高我们程序的效率，但是在使用多线程来编程的时候，由于对共享变量的修改，导致我们的程序会出现意料之外的错误结果，这主要是由于可见性、原子性、顺序性问题导致的。Java作为一门成熟的语言，在并发编程方面也做了很多努力，专门提供了JUC包来方便解决我们遇到的一些并发编程问题。

- Synchronized、Lock等锁机制来帮助我们解决原子性问题和线程间的通知协作。
- CountDownLatch、CyclicBarrier、CompletableFuture、ForkJoin等工具类来帮助我们解决线程间的协作问题。
- AtomicInteger、ThreadLocal等无锁工具类在合适的场景帮助我们进一步提高程序性能。
- ConcurrentHashMap、CopyOnWriteArrayList等线程安全的集合方便我们在多线程中使用集合操作。
- ThreadPoolExecutor、ForkJoinPool等线程池类帮助我们更合理创建和使用线程。



## NIO

NIO是指非阻塞IO，在Java中JDK提供了一套NIO的基础类库，但是由于其基础性、通用性的定位，往往过于关注技术模型上的抽象，而不是从一线应用开发者的角度去思考，导致比较难用。而Netty在基础的 NIO 等类库之上进行了很多改进，更加优雅的 Reactor 模式实现、灵活的线程模型，更加优雅的 Reactor 模式实现、灵活的线程模型，所以Netty称为了Java网络开发框架的事实标准。学好Netty，可以让我们开发出具有高并发的网络应用程序。



## Spring与ORM框架

Spring是Java企业级开发的框架的事实标准，我们日常的开发基本都离不开Spring框架的支持。Spring的核心是IoC和AOP，IoC是指Spring是一个控制反转的容器，用于帮助我们管理对象之间的依赖关系。Spring的AOP技术可以帮助我们实现很多通用的功能，比如事务管理，日志打印等等。Spring目前已经非常的庞大和成熟，相关技术繁多，我们要掌握Spring的核心，更好的利用Spring来帮助我们实现日常的开发任务。

目前常用的ORM框架有Mybatis和Hibernate。目前国内用的最多的是Mybatis，国外用的最多的是Hibernate。掌握ORM框架的原理，熟练使用ROM框架来操作数据库，熟悉如何与Spring、SpringBoot集成，是我们开发的必备技能。



## Mysql数据库

mysql数据库是目前使用最广泛的传统数据库，对于Mysql数据库，要掌握它的基本架构和原理，明白一条sql语句是如何在Mysql中执行的。要了解一些mysql常用的配置参数。重点掌握mysql的索引实现原理，对于我们日常的sql优化很有帮助。理解mysql的事务与锁机制，理解不同隔离级别可能带来的影响，尽量减少长事务的出现。熟悉mysql集群的主从复制，读写分离的实现机制。





## 分库分表

由于数据库的单机容量有限，在数据量过大的情况下，我们就需要对数据库进行拆分，也就是所谓的分库分表。按照我们的业务来拆分成不同的数据库和不同的表叫做垂直拆分，常用于微服务的情况下。当同一个业务的单个表数据量过大，再将单表数据拆分到不同表和不同库，就叫做水平拆分。对我们传统的单体数据库进行分库分表，可以采用Java框架层和中间件层两种方式。或者直接使用分布式数据库，自动实现了分库分表。在分库分表后，要特别注意数据迁移引发的问题。在分库分表后，我们就要特别关注分布式事务的实现。分布式事务主要分为XA分布式事务和BASE柔性事务两种。可以根据实际需求选择合适的方式和对应的框架。ShardingSphere不实现分布式事务，但是它集成了常用的分布式事务框架。



## RPC和微服务

RPC是一种技术，全称叫做远程过程调用，即像调用本地方法一样调用远程方法。RPC的核心机制是代理。Dubbo是一款高性能的Java服务框架，可用于企业微服务的改造，它提供了高性能RPC调用，智能负载均衡，服务自动注册发现，高度可扩展能力，运行期流量调度等功能。分布式服务除了需要RPC能力，还需要实现服务发现与注册，服务路由与负载均衡，熔断限流，服务管理，高可用，高性能，监控等功能。也可以使用SpringCloud来实现微服务的改造，SpringCloud提供了一个庞大的生态，用于分布式微服务的实现，包括配置注册中心，限流熔断，网关，RPC调用等等模块。



## 分布式缓存

缓存机制在计算机领域随处可见，比如CPU缓存，浏览器缓存。合理的使用缓存可以极大的提高程序的效率。Java开发中，最简单的一个缓存可以就是一个hashmap。我们在单机的情况下，常用到一些本地缓存框架有Guava Cache，Caffeine Cache等。在分布式的环境下，我们Redis，Memcached等缓存中间件，Redis已经是现在缓存中间件的事实标准，使用最广泛。Redis有5大基本数据类型，基本满足了我们大部分需求。Redis提供了集群模式，哨兵机制，切片集群，满足了高可用的，高性能的需求。掌握Redis相关数据类型的使用，Redis常用的应用场景，Redis的最佳使用实践，已经成为了开发中的必备技能。



## 分布式消息队列

为了更好的实现系统之间的通信，产生了消息队列这种消息通信的模式，它具有异步通信，系统解耦，削峰填谷，可靠通信等优势。常见的消息协议有JMS，AMQP，MQTT等。目前MQ一般分为三代，一代有ActiveMQ，RabbitMQ；二代有Kafka，RocketMQ；三代有Apache Plusar，它实现了计算与存储分离。我们需要了解常用MQ的优势与不足，以便在实际的项目中选择合适的MQ。



