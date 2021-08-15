## 不同GC和堆内存总结

#### 串行GC - SerialGC（Serial + Serial old）

- 采用单线程执行GC，不能充分利用多核CPU的性能。
- 执行GC时需要STW。在大堆内存的情况下，GC停顿时间长。



#### 并行GC - ParallelGC（Parallel Scanvenge + Parallel old）

- JDK8默认采用的GC组合方式。
- 采用多线程执行GC，能利用多核CPU的性能。
- 执行时需要STW，但也带来了较大的吞吐量，适合内存大小4G左右的堆。
- 可以采用自适应调节参数，能根据当前运行情况动态调节GC相关参数。



#### ParNew + CMS

- ParNew采用多线程执行，执行时需要STW。
- CMS大部分时间可以与用户线程并发执行，可以带来较低的停顿时间。



#### G1

- JDK9成为默认的GC方式。
- 采用Region的方式管理堆内存空间。
- 每次只收集部分Region，优先选择回收垃圾较多的Region。
- 大部分时间都能和用户线程并发执行，可以带来较低的停顿时间。