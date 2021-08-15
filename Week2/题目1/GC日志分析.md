**（选做）**使用 GCLogAnalysis.java 自己演练一遍串行 / 并行 /CMS/G1 的案例。



## 使用串行GC

#### 256M内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx256m -Xms256m -XX:+UseSerialGC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T21:36:54.445+0800: [GC (Allocation Failure)  69952K->24801K(253440K), 0.0117453 secs]
2021-08-15T21:36:54.469+0800: [GC (Allocation Failure)  94753K->49516K(253440K), 0.0142344 secs]
2021-08-15T21:36:54.493+0800: [GC (Allocation Failure)  119468K->73010K(253440K), 0.0109712 secs]
2021-08-15T21:36:54.514+0800: [GC (Allocation Failure)  142290K->101899K(253440K), 0.0136335 secs]
2021-08-15T21:36:54.538+0800: [GC (Allocation Failure)  171851K->127165K(253440K), 0.0115371 secs]
2021-08-15T21:36:54.559+0800: [GC (Allocation Failure)  197117K->148629K(253440K), 0.0108220 secs]
2021-08-15T21:36:54.581+0800: [GC (Allocation Failure)  218581K->177223K(253440K), 0.0128954 secs]
2021-08-15T21:36:54.605+0800: [Full GC (Allocation Failure)  247175K->168466K(253440K), 0.0188777 secs]
2021-08-15T21:36:54.634+0800: [Full GC (Allocation Failure)  237989K->188215K(253440K), 0.0213831 secs]
2021-08-15T21:36:54.665+0800: [Full GC (Allocation Failure)  252635K->200576K(253440K), 0.0227084 secs]
2021-08-15T21:36:54.696+0800: [Full GC (Allocation Failure)  253328K->201556K(253440K), 0.0251871 secs]
2021-08-15T21:36:54.728+0800: [Full GC (Allocation Failure)  253084K->219932K(253440K), 0.0081372 secs]
2021-08-15T21:36:54.742+0800: [Full GC (Allocation Failure)  253373K->225654K(253440K), 0.0098173 secs]
2021-08-15T21:36:54.755+0800: [Full GC (Allocation Failure)  253206K->230198K(253440K), 0.0168206 secs]
2021-08-15T21:36:54.776+0800: [Full GC (Allocation Failure)  253332K->224266K(253440K), 0.0277964 secs]
2021-08-15T21:36:54.809+0800: [Full GC (Allocation Failure)  253297K->231686K(253440K), 0.0078910 secs]
2021-08-15T21:36:54.821+0800: [Full GC (Allocation Failure)  252788K->237896K(253440K), 0.0075339 secs]
2021-08-15T21:36:54.832+0800: [Full GC (Allocation Failure)  253149K->240316K(253440K), 0.0106252 secs]
2021-08-15T21:36:54.844+0800: [Full GC (Allocation Failure)  253305K->234359K(253440K), 0.0286809 secs]
2021-08-15T21:36:54.877+0800: [Full GC (Allocation Failure)  253418K->238756K(253440K), 0.0082083 secs]
2021-08-15T21:36:54.888+0800: [Full GC (Allocation Failure)  253283K->241989K(253440K), 0.0080291 secs]
2021-08-15T21:36:54.898+0800: [Full GC (Allocation Failure)  253393K->244291K(253440K), 0.0083622 secs]
2021-08-15T21:36:54.908+0800: [Full GC (Allocation Failure)  253326K->239072K(253440K), 0.0294451 secs]
2021-08-15T21:36:54.940+0800: [Full GC (Allocation Failure)  252889K->243942K(253440K), 0.0096453 secs]
2021-08-15T21:36:54.952+0800: [Full GC (Allocation Failure)  253182K->245855K(253440K), 0.0067853 secs]
2021-08-15T21:36:54.960+0800: [Full GC (Allocation Failure)  252951K->247775K(253440K), 0.0105167 secs]
2021-08-15T21:36:54.972+0800: [Full GC (Allocation Failure)  253015K->240519K(253440K), 0.0291523 secs]
2021-08-15T21:36:55.004+0800: [Full GC (Allocation Failure)  253317K->243092K(253440K), 0.0080133 secs]
2021-08-15T21:36:55.014+0800: [Full GC (Allocation Failure)  253352K->244877K(253440K), 0.0101696 secs]
2021-08-15T21:36:55.027+0800: [Full GC (Allocation Failure)  253407K->247987K(253440K), 0.0100600 secs]
2021-08-15T21:36:55.038+0800: [Full GC (Allocation Failure)  253371K->244466K(253440K), 0.0300936 secs]
2021-08-15T21:36:55.069+0800: [Full GC (Allocation Failure)  253401K->246321K(253440K), 0.0122336 secs]
2021-08-15T21:36:55.083+0800: [Full GC (Allocation Failure)  253256K->247626K(253440K), 0.0079699 secs]
2021-08-15T21:36:55.093+0800: [Full GC (Allocation Failure)  253380K->249099K(253440K), 0.0074281 secs]
2021-08-15T21:36:55.101+0800: [Full GC (Allocation Failure)  253274K->246588K(253440K), 0.0287924 secs]
2021-08-15T21:36:55.131+0800: [Full GC (Allocation Failure)  252946K->248231K(253440K), 0.0029337 secs]
2021-08-15T21:36:55.136+0800: [Full GC (Allocation Failure)  253366K->250128K(253440K), 0.0080674 secs]
2021-08-15T21:36:55.145+0800: [Full GC (Allocation Failure)  253285K->250882K(253440K), 0.0049926 secs]
2021-08-15T21:36:55.151+0800: [Full GC (Allocation Failure)  253282K->247896K(253440K), 0.0288258 secs]
2021-08-15T21:36:55.180+0800: [Full GC (Allocation Failure)  253007K->249580K(253440K), 0.0129428 secs]
2021-08-15T21:36:55.194+0800: [Full GC (Allocation Failure)  253344K->250261K(253440K), 0.0023248 secs]
2021-08-15T21:36:55.198+0800: [Full GC (Allocation Failure)  253311K->251221K(253440K), 0.0088132 secs]
2021-08-15T21:36:55.207+0800: [Full GC (Allocation Failure)  253394K->249127K(253440K), 0.0263099 secs]
2021-08-15T21:36:55.234+0800: [Full GC (Allocation Failure)  253339K->251272K(253440K), 0.0095972 secs]
2021-08-15T21:36:55.245+0800: [Full GC (Allocation Failure)  252972K->252564K(253440K), 0.0032744 secs]
2021-08-15T21:36:55.248+0800: [Full GC (Allocation Failure)  253141K->253007K(253440K), 0.0028543 secs]
2021-08-15T21:36:55.251+0800: [Full GC (Allocation Failure)  253007K->251543K(253440K), 0.0349747 secs]
2021-08-15T21:36:55.287+0800: [Full GC (Allocation Failure)  253360K->252616K(253440K), 0.0020632 secs]
2021-08-15T21:36:55.289+0800: [Full GC (Allocation Failure)  253400K->253216K(253440K), 0.0039247 secs]
2021-08-15T21:36:55.293+0800: [Full GC (Allocation Failure)  253216K->252915K(253440K), 0.0027468 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:48)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)
```

结果分析：平均GC时间20毫秒左右。由于堆内存过小，内存分配速率过大，导致频繁触发FullGC，最终因没有足够空间来给对象分配内存，触发堆内存OOM。



#### 1G内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx1g -Xms1g -XX:+UseSerialGC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T21:38:08.919+0800: [GC (Allocation Failure)  279616K->81691K(1013632K), 0.0341625 secs]
2021-08-15T21:38:08.999+0800: [GC (Allocation Failure)  361307K->161377K(1013632K), 0.0514789 secs]
2021-08-15T21:38:09.090+0800: [GC (Allocation Failure)  440993K->248982K(1013632K), 0.3376096 secs]
2021-08-15T21:38:09.465+0800: [GC (Allocation Failure)  528598K->332611K(1013632K), 0.0508117 secs]
2021-08-15T21:38:09.555+0800: [GC (Allocation Failure)  612227K->419339K(1013632K), 0.5283309 secs]
执行结束!共生成对象次数:5294
```

结果分析：平均GC时间200毫秒左右，最大GC时间528毫秒，大于内存256M时的GC时间，可见一次GC回收的内存越大，GC时间越久。但同时由于堆内存更大，GC发生的次数更少，且没有发生FullGC。

#### 4G内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx4g -Xms4g -XX:+UseSerialGC GCLogAnalysis
```

执行结果

```
正在执行...
执行结束!共生成对象次数:3176
```

结果分析：由于堆内存分配过大，有足够Young空间进行对象内存分配，在1秒时间内没有触发GC回收。

## 使用并行GC

#### 256m内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx256m -Xms256m -XX:+UseParallelGC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T21:59:47.085+0800: [GC (Allocation Failure)  65536K->21299K(251392K), 0.0050240 secs]
2021-08-15T21:59:47.102+0800: [GC (Allocation Failure)  86835K->45017K(251392K), 0.0064633 secs]
2021-08-15T21:59:47.118+0800: [GC (Allocation Failure)  110553K->67591K(251392K), 0.0052270 secs]
2021-08-15T21:59:47.133+0800: [GC (Allocation Failure)  133127K->91411K(251392K), 0.0055477 secs]
2021-08-15T21:59:47.146+0800: [GC (Allocation Failure)  156947K->117749K(251392K), 0.0056180 secs]
2021-08-15T21:59:47.162+0800: [GC (Allocation Failure)  183285K->138639K(215552K), 0.0048459 secs]
2021-08-15T21:59:47.171+0800: [GC (Allocation Failure)  168120K->148937K(233472K), 0.0034316 secs]
2021-08-15T21:59:47.179+0800: [GC (Allocation Failure)  178633K->158554K(233472K), 0.0031699 secs]
2021-08-15T21:59:47.186+0800: [GC (Allocation Failure)  188195K->167718K(233472K), 0.0054752 secs]
2021-08-15T21:59:47.196+0800: [GC (Allocation Failure)  197080K->180910K(233472K), 0.0047942 secs]
2021-08-15T21:59:47.201+0800: [Full GC (Ergonomics)  180910K->150768K(233472K), 0.0159252 secs]
2021-08-15T21:59:47.221+0800: [Full GC (Ergonomics)  180315K->154030K(233472K), 0.0161307 secs]
2021-08-15T21:59:47.241+0800: [Full GC (Ergonomics)  183614K->157823K(233472K), 0.0165478 secs]
2021-08-15T21:59:47.261+0800: [Full GC (Ergonomics)  187440K->164242K(233472K), 0.0183166 secs]
2021-08-15T21:59:47.284+0800: [Full GC (Ergonomics)  193856K->169817K(233472K), 0.0157043 secs]
2021-08-15T21:59:47.304+0800: [Full GC (Ergonomics)  199279K->172514K(233472K), 0.0176294 secs]
2021-08-15T21:59:47.326+0800: [Full GC (Ergonomics)  202166K->178523K(233472K), 0.0178099 secs]
2021-08-15T21:59:47.348+0800: [Full GC (Ergonomics)  204101K->184267K(233472K), 0.0176027 secs]
2021-08-15T21:59:47.368+0800: [Full GC (Ergonomics)  204177K->186800K(233472K), 0.0180749 secs]
2021-08-15T21:59:47.389+0800: [Full GC (Ergonomics)  204234K->189889K(233472K), 0.0251966 secs]
2021-08-15T21:59:47.417+0800: [Full GC (Ergonomics)  203978K->190876K(233472K), 0.0202035 secs]
2021-08-15T21:59:47.439+0800: [Full GC (Ergonomics)  204341K->194969K(233472K), 0.0192706 secs]
2021-08-15T21:59:47.460+0800: [Full GC (Ergonomics)  204082K->197896K(233472K), 0.0264550 secs]
2021-08-15T21:59:47.488+0800: [Full GC (Ergonomics)  204187K->198102K(233472K), 0.0249227 secs]
2021-08-15T21:59:47.514+0800: [Full GC (Ergonomics)  204362K->198979K(233472K), 0.0208394 secs]
2021-08-15T21:59:47.536+0800: [Full GC (Ergonomics)  204501K->200441K(233472K), 0.0174092 secs]
2021-08-15T21:59:47.554+0800: [Full GC (Ergonomics)  204462K->200864K(233472K), 0.0258064 secs]
2021-08-15T21:59:47.580+0800: [Full GC (Ergonomics)  204101K->201511K(233472K), 0.0301055 secs]
2021-08-15T21:59:47.611+0800: [Full GC (Ergonomics)  204352K->202007K(233472K), 0.0052817 secs]
2021-08-15T21:59:47.617+0800: [Full GC (Ergonomics)  203888K->202315K(233472K), 0.0253922 secs]
2021-08-15T21:59:47.643+0800: [Full GC (Ergonomics)  204709K->203177K(233472K), 0.0208987 secs]
2021-08-15T21:59:47.665+0800: [Full GC (Ergonomics)  204364K->203223K(233472K), 0.0054707 secs]
2021-08-15T21:59:47.670+0800: [Full GC (Ergonomics)  203690K->203246K(233472K), 0.0202992 secs]
2021-08-15T21:59:47.691+0800: [Full GC (Ergonomics)  204004K->203141K(233472K), 0.0173896 secs]
2021-08-15T21:59:47.709+0800: [Full GC (Ergonomics)  203949K->203473K(233472K), 0.0145875 secs]
2021-08-15T21:59:47.724+0800: [Full GC (Ergonomics)  204735K->203912K(233472K), 0.0100184 secs]
2021-08-15T21:59:47.734+0800: [Full GC (Ergonomics)  204079K->203666K(233472K), 0.0081668 secs]
2021-08-15T21:59:47.742+0800: [Full GC (Ergonomics)  204220K->203666K(233472K), 0.0029889 secs]
2021-08-15T21:59:47.746+0800: [Full GC (Ergonomics)  204127K->203607K(233472K), 0.0253982 secs]
2021-08-15T21:59:47.772+0800: [Full GC (Ergonomics)  204430K->204226K(233472K), 0.0310523 secs]
2021-08-15T21:59:47.803+0800: [Full GC (Allocation Failure)  204226K->204207K(233472K), 0.0317403 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:48)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)
```

结果分析：现象和串行GC时相似。平均GC时间20毫秒左右。由于堆内存过小，内存分配速率过大，导致频繁触发FullGC，最终因没有足够空间来给对象分配内存，触发堆内存OOM。

#### 1G内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx1g -Xms1g -XX:+UseParallelGC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T21:40:42.891+0800: [GC (Allocation Failure)  261801K->78365K(1005056K), 0.0123607 secs]
2021-08-15T21:40:42.945+0800: [GC (Allocation Failure)  340509K->147697K(1005056K), 0.0172472 secs]
2021-08-15T21:40:43.000+0800: [GC (Allocation Failure)  409841K->221236K(1005056K), 0.0140988 secs]
2021-08-15T21:40:43.050+0800: [GC (Allocation Failure)  483380K->298805K(1005056K), 0.0142910 secs]
2021-08-15T21:40:43.099+0800: [GC (Allocation Failure)  560949K->377149K(1005056K), 0.0149748 secs]
2021-08-15T21:40:43.150+0800: [GC (Allocation Failure)  639293K->448638K(859648K), 0.0139046 secs]
2021-08-15T21:40:43.178+0800: [GC (Allocation Failure)  564980K->482985K(932352K), 0.0069190 secs]
2021-08-15T21:40:43.201+0800: [GC (Allocation Failure)  599721K->518563K(932352K), 0.0090841 secs]
2021-08-15T21:40:43.226+0800: [GC (Allocation Failure)  635299K->545323K(932352K), 0.0113227 secs]
2021-08-15T21:40:43.254+0800: [GC (Allocation Failure)  662059K->573162K(932352K), 0.0136803 secs]
2021-08-15T21:40:43.284+0800: [GC (Allocation Failure)  689863K->608822K(932352K), 0.0131064 secs]
2021-08-15T21:40:43.313+0800: [GC (Allocation Failure)  725558K->645357K(932352K), 0.0360624 secs]
2021-08-15T21:40:43.349+0800: [Full GC (Ergonomics)  645357K->333858K(932352K), 0.0824425 secs]
2021-08-15T21:40:43.447+0800: [GC (Allocation Failure)  450594K->374993K(932352K), 0.0039982 secs]
2021-08-15T21:40:43.467+0800: [GC (Allocation Failure)  491729K->410523K(932352K), 0.0066040 secs]
2021-08-15T21:40:43.489+0800: [GC (Allocation Failure)  527259K->446750K(932352K), 0.0070175 secs]
2021-08-15T21:40:43.512+0800: [GC (Allocation Failure)  563486K->480094K(932352K), 0.0062656 secs]
2021-08-15T21:40:43.534+0800: [GC (Allocation Failure)  596830K->516255K(932352K), 0.0070595 secs]
2021-08-15T21:40:43.558+0800: [GC (Allocation Failure)  632991K->550446K(932352K), 0.0066838 secs]
2021-08-15T21:40:43.581+0800: [GC (Allocation Failure)  667182K->585088K(932352K), 0.0069670 secs]
2021-08-15T21:40:43.604+0800: [GC (Allocation Failure)  701824K->619955K(932352K), 0.0065080 secs]
2021-08-15T21:40:43.628+0800: [GC (Allocation Failure)  736572K->652325K(932352K), 0.0221744 secs]
2021-08-15T21:40:43.665+0800: [GC (Allocation Failure)  769061K->686952K(932352K), 0.0642195 secs]
2021-08-15T21:40:43.730+0800: [Full GC (Ergonomics)  686952K->359464K(932352K), 0.0367286 secs]
执行结束!共生成对象次数:13447
```

结果分析：平均GC时间10毫秒左右，远小于串行GC的时间，体现了多线程GC的优势。由于默认开启自适应参数，堆内存大小等参数是动态变化的。

#### 4G内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx4g -Xms4g -XX:+UseParallelGC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T21:57:32.437+0800: [GC (Allocation Failure)  1048576K->233715K(4019712K), 0.3563824 secs]
执行结束!共生成对象次数:6158
```

结果分析：平均GC时间350毫秒左右。只发生了一次YoungGC。

## 使用CMS

#### 256m内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx256m -Xms256m -XX:+UseConcMarkSweepGC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T22:12:47.047+0800: [GC (Allocation Failure)  69952K->26003K(253440K), 0.0051115 secs]
2021-08-15T22:12:47.065+0800: [GC (Allocation Failure)  95714K->46855K(253440K), 0.0077293 secs]
2021-08-15T22:12:47.082+0800: [GC (Allocation Failure)  116807K->67866K(253440K), 0.0107268 secs]
2021-08-15T22:12:47.103+0800: [GC (Allocation Failure)  137762K->92781K(253440K), 0.0123322 secs]
2021-08-15T22:12:47.125+0800: [GC (Allocation Failure)  162733K->115896K(253440K), 0.0114575 secs]
2021-08-15T22:12:47.136+0800: [GC (CMS Initial Mark)  117428K(253440K), 0.0007308 secs]
2021-08-15T22:12:47.146+0800: [GC (Allocation Failure)  185759K->144329K(253440K), 0.0144954 secs]
2021-08-15T22:12:47.170+0800: [GC (Allocation Failure)  214281K->170706K(253440K), 0.0132205 secs]
2021-08-15T22:12:47.193+0800: [Full GC (Allocation Failure)  240658K->167722K(253440K), 0.0233978 secs]
2021-08-15T22:12:47.227+0800: [Full GC (Allocation Failure)  237582K->184284K(253440K), 0.0243068 secs]
2021-08-15T22:12:47.251+0800: [GC (CMS Initial Mark)  185967K(253440K), 0.0010561 secs]
2021-08-15T22:12:47.254+0800: [GC (CMS Final Remark)  194842K(253440K), 0.0017647 secs]
2021-08-15T22:12:47.264+0800: [Full GC (Allocation Failure)  253099K->196729K(253440K), 0.0232176 secs]
2021-08-15T22:12:47.288+0800: [GC (CMS Initial Mark)  197074K(253440K), 0.0009428 secs]
2021-08-15T22:12:47.290+0800: [GC (CMS Final Remark)  208004K(253440K), 0.0014765 secs]
2021-08-15T22:12:47.298+0800: [Full GC (Allocation Failure)  252921K->208435K(253440K), 0.0260574 secs]
2021-08-15T22:12:47.325+0800: [GC (CMS Initial Mark)  209146K(253440K), 0.0012448 secs]
2021-08-15T22:12:47.327+0800: [GC (CMS Final Remark)  221920K(253440K), 0.0016404 secs]
2021-08-15T22:12:47.333+0800: [Full GC (Allocation Failure)  252721K->215276K(253440K), 0.0261898 secs]
2021-08-15T22:12:47.360+0800: [GC (CMS Initial Mark)  215992K(253440K), 0.0014501 secs]
2021-08-15T22:12:47.363+0800: [GC (CMS Final Remark)  230302K(253440K), 0.0014688 secs]
2021-08-15T22:12:47.368+0800: [Full GC (Allocation Failure)  252984K->222386K(253440K), 0.0267524 secs]
2021-08-15T22:12:47.395+0800: [GC (CMS Initial Mark)  222685K(253440K), 0.0016117 secs]
2021-08-15T22:12:47.399+0800: [GC (CMS Final Remark)  234096K(253440K), 0.0026634 secs]
2021-08-15T22:12:47.404+0800: [Full GC (Allocation Failure)  253330K->228989K(253440K), 0.0294061 secs]
2021-08-15T22:12:47.434+0800: [GC (CMS Initial Mark)  229413K(253440K), 0.0015247 secs]
2021-08-15T22:12:47.437+0800: [GC (CMS Final Remark)  239298K(253440K), 0.0016166 secs]
2021-08-15T22:12:47.441+0800: [Full GC (Allocation Failure)  252725K->231069K(253440K), 0.0273033 secs]
2021-08-15T22:12:47.469+0800: [GC (CMS Initial Mark)  231357K(253440K), 0.0023680 secs]
2021-08-15T22:12:47.473+0800: [GC (CMS Final Remark)  244471K(253440K), 0.0016310 secs]
2021-08-15T22:12:47.476+0800: [Full GC (Allocation Failure)  252709K->233197K(253440K), 0.0273787 secs]
2021-08-15T22:12:47.503+0800: [GC (CMS Initial Mark)  233572K(253440K), 0.0024239 secs]
2021-08-15T22:12:47.508+0800: [GC (CMS Final Remark)  248474K(253440K), 0.0016703 secs]
2021-08-15T22:12:47.511+0800: [Full GC (Allocation Failure)  252542K->237356K(253440K), 0.0288410 secs]
2021-08-15T22:12:47.540+0800: [GC (CMS Initial Mark)  238300K(253440K), 0.0016245 secs]
2021-08-15T22:12:47.544+0800: [GC (CMS Final Remark)  247201K(253440K), 0.0015694 secs]
2021-08-15T22:12:47.546+0800: [Full GC (Allocation Failure)  253217K->240965K(253440K), 0.0299834 secs]
2021-08-15T22:12:47.577+0800: [GC (CMS Initial Mark)  241362K(253440K), 0.0008433 secs]
2021-08-15T22:12:47.579+0800: [GC (CMS Final Remark)  251296K(253440K), 0.0015276 secs]
2021-08-15T22:12:47.581+0800: [Full GC (Allocation Failure)  252590K->241859K(253440K), 0.0309773 secs]
2021-08-15T22:12:47.615+0800: [Full GC (Allocation Failure)  253229K->245549K(253440K), 0.0308573 secs]
2021-08-15T22:12:47.646+0800: [GC (CMS Initial Mark)  245966K(253440K), 0.0009756 secs]
2021-08-15T22:12:47.649+0800: [Full GC (Allocation Failure)  253369K->246186K(253440K), 0.0278829 secs]
2021-08-15T22:12:47.679+0800: [Full GC (Allocation Failure)  252819K->246442K(253440K), 0.0297367 secs]
2021-08-15T22:12:47.710+0800: [GC (CMS Initial Mark)  247171K(253440K), 0.0010346 secs]
2021-08-15T22:12:47.712+0800: [Full GC (Allocation Failure)  253153K->246358K(253440K), 0.0280658 secs]
2021-08-15T22:12:47.742+0800: [Full GC (Allocation Failure)  253396K->247853K(253440K), 0.0303471 secs]
2021-08-15T22:12:47.773+0800: [GC (CMS Initial Mark)  248044K(253440K), 0.0014091 secs]
2021-08-15T22:12:47.776+0800: [Full GC (Allocation Failure)  253252K->247619K(253440K), 0.0220703 secs]
2021-08-15T22:12:47.800+0800: [Full GC (Allocation Failure)  253174K->248230K(253440K), 0.0297722 secs]
2021-08-15T22:12:47.831+0800: [GC (CMS Initial Mark)  248829K(253440K), 0.0011779 secs]
2021-08-15T22:12:47.843+0800: [Full GC (Allocation Failure)  253233K->250060K(253440K), 0.0244251 secs]
2021-08-15T22:12:47.869+0800: [Full GC (Allocation Failure)  253261K->251863K(253440K), 0.0314158 secs]
2021-08-15T22:12:47.901+0800: [GC (CMS Initial Mark)  252035K(253440K), 0.0006838 secs]
2021-08-15T22:12:47.908+0800: [Full GC (Allocation Failure)  253116K->252199K(253440K), 0.0166404 secs]
2021-08-15T22:12:47.925+0800: [Full GC (Allocation Failure)  252743K->252055K(253440K), 0.0021744 secs]
2021-08-15T22:12:47.927+0800: [GC (CMS Initial Mark)  252837K(253440K), 0.0009184 secs]
2021-08-15T22:12:47.939+0800: [Full GC (Allocation Failure)  253172K->252196K(253440K), 0.0029489 secs]
2021-08-15T22:12:47.943+0800: [Full GC (Allocation Failure)  253294K->252441K(253440K), 0.0219151 secs]
2021-08-15T22:12:47.965+0800: [GC (CMS Initial Mark)  252585K(253440K), 0.0009913 secs]
2021-08-15T22:12:47.970+0800: [Full GC (Allocation Failure)  253206K->252132K(253440K), 0.0224006 secs]
2021-08-15T22:12:47.994+0800: [Full GC (Allocation Failure)  253284K->252266K(253440K), 0.0023252 secs]
2021-08-15T22:12:47.997+0800: [GC (CMS Initial Mark)  252554K(253440K), 0.0022276 secs]
2021-08-15T22:12:48.002+0800: [Full GC (Allocation Failure)  253181K->251913K(253440K), 0.0282530 secs]
执行结束!共生成对象次数:3802
```

结果分析：平均GC时间250毫秒左右。没有发生OOM。

#### 1G内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx1g -Xms1g -XX:+UseConcMarkSweepGC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T22:03:01.370+0800: [GC (Allocation Failure)  279616K->90141K(1013632K), 0.0148898 secs]
2021-08-15T22:03:01.430+0800: [GC (Allocation Failure)  369757K->171347K(1013632K), 0.0184824 secs]
2021-08-15T22:03:01.488+0800: [GC (Allocation Failure)  450963K->254560K(1013632K), 0.0436249 secs]
2021-08-15T22:03:01.570+0800: [GC (Allocation Failure)  534176K->329355K(1013632K), 0.0360108 secs]
2021-08-15T22:03:01.645+0800: [GC (Allocation Failure)  608971K->410794K(1013632K), 0.0381749 secs]
2021-08-15T22:03:01.683+0800: [GC (CMS Initial Mark)  416566K(1013632K), 0.0006385 secs]
2021-08-15T22:03:01.723+0800: [GC (Allocation Failure)  690410K->486165K(1013632K), 0.0371927 secs]
2021-08-15T22:03:01.798+0800: [GC (Allocation Failure)  765781K->566508K(1013632K), 0.0391227 secs]
2021-08-15T22:03:01.876+0800: [GC (Allocation Failure)  846124K->647351K(1013632K), 0.0395241 secs]
2021-08-15T22:03:01.954+0800: [GC (Allocation Failure)  926967K->732536K(1013632K), 0.0416280 secs]
2021-08-15T22:03:01.996+0800: [GC (CMS Final Remark)  738219K(1013632K), 0.0014920 secs]
2021-08-15T22:03:02.035+0800: [GC (Allocation Failure)  882611K->680749K(1013632K), 0.0169193 secs]
2021-08-15T22:03:02.052+0800: [GC (CMS Initial Mark)  686716K(1013632K), 0.0006449 secs]
2021-08-15T22:03:02.091+0800: [Full GC (Allocation Failure)  960365K->356193K(1013632K), 0.0471341 secs]
2021-08-15T22:03:02.178+0800: [GC (Allocation Failure)  635809K->440008K(1013632K), 0.0122883 secs]
2021-08-15T22:03:02.190+0800: [GC (CMS Initial Mark)  440401K(1013632K), 0.0006715 secs]
2021-08-15T22:03:02.230+0800: [GC (Allocation Failure)  719624K->519736K(1013632K), 0.0166256 secs]
执行结束!共生成对象次数:13777
```

结果分析：平均GC时间50毫秒左右。

#### 4G内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx4g -Xms4g -XX:+UseConcMarkSweepGC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T22:09:26.980+0800: [GC (Allocation Failure)  886080K->209287K(4083584K), 0.0319642 secs]
2021-08-15T22:09:27.148+0800: [GC (Allocation Failure)  1095367K->355873K(4083584K), 0.3508028 secs]
执行结束!共生成对象次数:9921
```

结果分析：平均GC时间200毫秒左右。只发生了2次YoungGC。

## 使用G1

#### 256m内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx256m -Xms256m -XX:+UseG1GC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T22:21:20.832+0800: [GC pause (G1 Evacuation Pause) (young) 16522K->5730K(256M), 0.0038059 secs]
2021-08-15T22:21:20.845+0800: [GC pause (G1 Evacuation Pause) (young) 33250K->16268K(256M), 0.0037990 secs]
2021-08-15T22:21:20.890+0800: [GC pause (G1 Evacuation Pause) (young) 122M->52733K(256M), 0.0076091 secs]
2021-08-15T22:21:20.911+0800: [GC pause (G1 Evacuation Pause) (young) 120M->78336K(256M), 0.0067345 secs]
2021-08-15T22:21:20.937+0800: [GC pause (G1 Evacuation Pause) (young) 175M->108M(256M), 0.0070158 secs]
2021-08-15T22:21:20.945+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 115M->111M(256M), 0.0036606 secs]
2021-08-15T22:21:20.949+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:20.950+0800: [GC concurrent-root-region-scan-end, 0.0015872 secs]
2021-08-15T22:21:20.952+0800: [GC concurrent-mark-start]
2021-08-15T22:21:20.957+0800: [GC concurrent-mark-end, 0.0052177 secs]
2021-08-15T22:21:20.958+0800: [GC remark, 0.0050373 secs]
2021-08-15T22:21:20.963+0800: [GC cleanup 167M->167M(256M), 0.0020613 secs]
2021-08-15T22:21:20.972+0800: [GC pause (G1 Evacuation Pause) (young) 198M->139M(256M), 0.0042718 secs]
2021-08-15T22:21:20.977+0800: [GC pause (G1 Evacuation Pause) (mixed) 144M->137M(256M), 0.0031543 secs]
2021-08-15T22:21:20.981+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 138M->137M(256M), 0.0022001 secs]
2021-08-15T22:21:20.983+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:20.987+0800: [GC concurrent-root-region-scan-end, 0.0035030 secs]
2021-08-15T22:21:20.987+0800: [GC concurrent-mark-start]
2021-08-15T22:21:20.991+0800: [GC concurrent-mark-end, 0.0037696 secs]
2021-08-15T22:21:20.992+0800: [GC pause (G1 Evacuation Pause) (young) 202M->159M(256M), 0.0033676 secs]
2021-08-15T22:21:20.995+0800: [GC remark, 0.0022114 secs]
2021-08-15T22:21:21.000+0800: [GC cleanup 160M->160M(256M), 0.0018657 secs]
2021-08-15T22:21:21.007+0800: [GC pause (G1 Evacuation Pause) (young) 204M->172M(256M), 0.0031713 secs]
2021-08-15T22:21:21.011+0800: [GC pause (G1 Evacuation Pause) (mixed) 180M->166M(256M), 0.0032546 secs]
2021-08-15T22:21:21.015+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 168M->167M(256M), 0.0019141 secs]
2021-08-15T22:21:21.017+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.018+0800: [GC concurrent-root-region-scan-end, 0.0012775 secs]
2021-08-15T22:21:21.019+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.020+0800: [GC concurrent-mark-end, 0.0014911 secs]
2021-08-15T22:21:21.023+0800: [GC pause (G1 Evacuation Pause) (young) 203M->181M(256M), 0.0042250 secs]
2021-08-15T22:21:21.027+0800: [GC remark, 0.0021458 secs]
2021-08-15T22:21:21.030+0800: [GC cleanup 182M->182M(256M), 0.0052818 secs]
2021-08-15T22:21:21.039+0800: [GC pause (G1 Evacuation Pause) (young) 201M->186M(256M), 0.0027187 secs]
2021-08-15T22:21:21.043+0800: [GC pause (G1 Evacuation Pause) (mixed) 197M->180M(256M), 0.0031204 secs]
2021-08-15T22:21:21.046+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 181M->181M(256M), 0.0064085 secs]
2021-08-15T22:21:21.053+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.054+0800: [GC concurrent-root-region-scan-end, 0.0006332 secs]
2021-08-15T22:21:21.058+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.059+0800: [GC pause (G1 Evacuation Pause) (young) 200M->187M(256M), 0.0099496 secs]
2021-08-15T22:21:21.066+0800: [GC concurrent-mark-end, 0.0077711 secs]
2021-08-15T22:21:21.067+0800: [GC remark, 0.0094587 secs]
2021-08-15T22:21:21.077+0800: [GC cleanup 194M->194M(256M), 0.0025080 secs]
2021-08-15T22:21:21.080+0800: [GC pause (G1 Evacuation Pause) (young) 199M->190M(256M), 0.0022264 secs]
2021-08-15T22:21:21.084+0800: [GC pause (G1 Evacuation Pause) (mixed) 202M->185M(256M), 0.0030204 secs]
2021-08-15T22:21:21.087+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 185M->185M(256M), 0.0021253 secs]
2021-08-15T22:21:21.090+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.093+0800: [GC concurrent-root-region-scan-end, 0.0042537 secs]
2021-08-15T22:21:21.094+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.093+0800: [GC pause (G1 Evacuation Pause) (young) 203M->190M(256M), 0.0142858 secs]
2021-08-15T22:21:21.107+0800: [GC concurrent-mark-end, 0.0121743 secs]
2021-08-15T22:21:21.109+0800: [GC pause (G1 Evacuation Pause) (young) 201M->193M(256M), 0.0066544 secs]
2021-08-15T22:21:21.115+0800: [GC remark, 0.0021980 secs]
2021-08-15T22:21:21.117+0800: [GC cleanup 194M->194M(256M), 0.0017836 secs]
2021-08-15T22:21:21.120+0800: [GC pause (G1 Evacuation Pause) (young) 206M->197M(256M), 0.0025086 secs]
2021-08-15T22:21:21.125+0800: [GC pause (G1 Evacuation Pause) (mixed)-- 212M->209M(256M), 0.0070607 secs]
2021-08-15T22:21:21.132+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 209M->208M(256M), 0.0024170 secs]
2021-08-15T22:21:21.135+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.135+0800: [GC concurrent-root-region-scan-end, 0.0006541 secs]
2021-08-15T22:21:21.136+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.137+0800: [GC pause (G1 Evacuation Pause) (young)-- 222M->221M(256M), 0.0093290 secs]
2021-08-15T22:21:21.147+0800: [GC pause (G1 Humongous Allocation) (young)-- 222M->222M(256M), 0.0041641 secs]
2021-08-15T22:21:21.152+0800: [GC pause (G1 Evacuation Pause) (young) 222M->222M(256M), 0.0018338 secs]
2021-08-15T22:21:21.155+0800: [GC pause (G1 Evacuation Pause) (young)-- 223M->223M(256M), 0.0019300 secs]
2021-08-15T22:21:21.157+0800: [Full GC (Allocation Failure)  223M->176M(256M), 0.0190910 secs]
2021-08-15T22:21:21.176+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.177+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 184M->177M(256M), 0.0031148 secs]
2021-08-15T22:21:21.182+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.183+0800: [GC concurrent-root-region-scan-end, 0.0009254 secs]
2021-08-15T22:21:21.184+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.184+0800: [GC pause (G1 Evacuation Pause) (young) 193M->182M(256M), 0.0071940 secs]
2021-08-15T22:21:21.192+0800: [GC concurrent-mark-end, 0.0082709 secs]
2021-08-15T22:21:21.192+0800: [GC remark, 0.0024396 secs]
2021-08-15T22:21:21.195+0800: [GC cleanup 195M->195M(256M), 0.0016956 secs]
2021-08-15T22:21:21.197+0800: [GC pause (G1 Evacuation Pause) (young) 196M->187M(256M), 0.0024224 secs]
2021-08-15T22:21:21.200+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 191M->188M(256M), 0.0025508 secs]
2021-08-15T22:21:21.202+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.203+0800: [GC concurrent-root-region-scan-end, 0.0006979 secs]
2021-08-15T22:21:21.205+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.206+0800: [GC pause (G1 Evacuation Pause) (young)-- 203M->197M(256M), 0.0048858 secs]
2021-08-15T22:21:21.210+0800: [GC concurrent-mark-end, 0.0047727 secs]
2021-08-15T22:21:21.210+0800: [GC pause (G1 Humongous Allocation) (young)-- 204M->202M(256M), 0.0027009 secs]
2021-08-15T22:21:21.212+0800: [GC remark, 0.0024006 secs]
2021-08-15T22:21:21.215+0800: [GC cleanup 203M->203M(256M), 0.0035473 secs]
2021-08-15T22:21:21.219+0800: [GC pause (G1 Evacuation Pause) (young)-- 204M->204M(256M), 0.0022976 secs]
2021-08-15T22:21:21.221+0800: [Full GC (Allocation Failure)  204M->184M(256M), 0.0182155 secs]
2021-08-15T22:21:21.240+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 186M->184M(256M), 0.0029174 secs]
2021-08-15T22:21:21.243+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.244+0800: [GC concurrent-root-region-scan-end, 0.0006679 secs]
2021-08-15T22:21:21.245+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.246+0800: [GC pause (G1 Evacuation Pause) (young)-- 199M->194M(256M), 0.0035465 secs]
2021-08-15T22:21:21.250+0800: [GC pause (G1 Humongous Allocation) (young)-- 200M->200M(256M), 0.0022246 secs]
2021-08-15T22:21:21.253+0800: [Full GC (Allocation Failure)  200M->187M(256M), 0.0172542 secs]
2021-08-15T22:21:21.270+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.271+0800: [GC pause (G1 Evacuation Pause) (young)-- 200M->197M(256M), 0.0037881 secs]
2021-08-15T22:21:21.276+0800: [GC pause (G1 Evacuation Pause) (young)-- 202M->200M(256M), 0.0021971 secs]
2021-08-15T22:21:21.280+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 201M->201M(256M), 0.0040427 secs]
2021-08-15T22:21:21.283+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.286+0800: [GC pause (G1 Evacuation Pause) (young)2021-08-15T22:21:21.288+0800: [GC concurrent-root-region-scan-end, 0.0033145 secs]
2021-08-15T22:21:21.288+0800: [GC concurrent-mark-start]
-- 201M->201M(256M), 0.0065017 secs]
2021-08-15T22:21:21.290+0800: [GC pause (G1 Evacuation Pause) (young)-- 202M->202M(256M), 0.0021342 secs]
2021-08-15T22:21:21.293+0800: [Full GC (Allocation Failure)  202M->188M(256M), 0.0191912 secs]
2021-08-15T22:21:21.312+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.313+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 194M->190M(256M), 0.0056823 secs]
2021-08-15T22:21:21.319+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.320+0800: [GC concurrent-root-region-scan-end, 0.0009709 secs]
2021-08-15T22:21:21.320+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.321+0800: [GC pause (G1 Evacuation Pause) (young)-- 200M->198M(256M), 0.0031825 secs]
2021-08-15T22:21:21.324+0800: [GC pause (G1 Evacuation Pause) (young)-- 200M->199M(256M), 0.0020803 secs]
2021-08-15T22:21:21.327+0800: [GC concurrent-mark-end, 0.0065038 secs]
2021-08-15T22:21:21.328+0800: [GC pause (G1 Humongous Allocation) (young)-- 200M->200M(256M), 0.0069636 secs]
2021-08-15T22:21:21.334+0800: [Full GC (Allocation Failure)  200M->191M(256M), 0.0198977 secs]
2021-08-15T22:21:21.355+0800: [GC remark, 0.0005069 secs]
2021-08-15T22:21:21.355+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.356+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 199M->196M(256M), 0.0036396 secs]
2021-08-15T22:21:21.360+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.365+0800: [GC concurrent-root-region-scan-end, 0.0043798 secs]
2021-08-15T22:21:21.366+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.367+0800: [GC pause (G1 Evacuation Pause) (young)-- 200M->198M(256M), 0.0082753 secs]
2021-08-15T22:21:21.370+0800: [GC pause (G1 Humongous Allocation) (young)-- 200M->200M(256M), 0.0021458 secs]
2021-08-15T22:21:21.373+0800: [Full GC (Allocation Failure)  200M->194M(256M), 0.0186754 secs]
2021-08-15T22:21:21.392+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.393+0800: [GC pause (G1 Evacuation Pause) (young)-- 201M->200M(256M), 0.0028308 secs]
2021-08-15T22:21:21.396+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 201M->200M(256M), 0.0025190 secs]
2021-08-15T22:21:21.399+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.399+0800: [GC concurrent-root-region-scan-end, 0.0005461 secs]
2021-08-15T22:21:21.400+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.401+0800: [GC pause (G1 Evacuation Pause) (young) 201M->200M(256M), 0.0043726 secs]
2021-08-15T22:21:21.404+0800: [GC pause (G1 Evacuation Pause) (young)-- 201M->200M(256M), 0.0022736 secs]
2021-08-15T22:21:21.408+0800: [GC pause (G1 Humongous Allocation) (young)-- 201M->201M(256M), 0.0064662 secs]
2021-08-15T22:21:21.414+0800: [GC pause (G1 Evacuation Pause) (young) 201M->201M(256M), 0.0022468 secs]
2021-08-15T22:21:21.417+0800: [GC pause (G1 Evacuation Pause) (young)-- 202M->202M(256M), 0.0021196 secs]
2021-08-15T22:21:21.420+0800: [Full GC (Allocation Failure)  202M->195M(256M), 0.0183728 secs]
2021-08-15T22:21:21.438+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.440+0800: [GC pause (G1 Evacuation Pause) (young)-- 202M->200M(256M), 0.0025222 secs]
2021-08-15T22:21:21.443+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 202M->201M(256M), 0.0024239 secs]
2021-08-15T22:21:21.445+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.446+0800: [GC concurrent-root-region-scan-end, 0.0005533 secs]
2021-08-15T22:21:21.447+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.447+0800: [GC pause (G1 Evacuation Pause) (young)-- 202M->202M(256M), 0.0044066 secs]
2021-08-15T22:21:21.450+0800: [GC pause (G1 Evacuation Pause) (young)-- 203M->203M(256M), 0.0021428 secs]
2021-08-15T22:21:21.454+0800: [Full GC (Allocation Failure)  203M->195M(256M), 0.0157039 secs]
2021-08-15T22:21:21.470+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.473+0800: [GC pause (G1 Evacuation Pause) (young)-- 201M->199M(256M), 0.0056153 secs]
2021-08-15T22:21:21.477+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 200M->200M(256M), 0.0021571 secs]
2021-08-15T22:21:21.479+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.480+0800: [GC pause (G1 Evacuation Pause) (young)2021-08-15T22:21:21.481+0800: [GC concurrent-root-region-scan-end, 0.0007114 secs]
2021-08-15T22:21:21.481+0800: [GC concurrent-mark-start]
-- 201M->201M(256M), 0.0032448 secs]
2021-08-15T22:21:21.483+0800: [GC pause (G1 Evacuation Pause) (young)-- 202M->202M(256M), 0.0022125 secs]
2021-08-15T22:21:21.486+0800: [Full GC (Allocation Failure)  202M->195M(256M), 0.0224550 secs]
2021-08-15T22:21:21.509+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.510+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 199M->197M(256M), 0.0031129 secs]
2021-08-15T22:21:21.513+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.513+0800: [GC concurrent-root-region-scan-end, 0.0006091 secs]
2021-08-15T22:21:21.514+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.515+0800: [GC pause (G1 Evacuation Pause) (young)-- 203M->202M(256M), 0.0068161 secs]
2021-08-15T22:21:21.521+0800: [GC pause (G1 Evacuation Pause) (young)-- 204M->204M(256M), 0.0055113 secs]
2021-08-15T22:21:21.527+0800: [Full GC (Allocation Failure)  204M->197M(256M), 0.0074625 secs]
2021-08-15T22:21:21.534+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.538+0800: [GC pause (G1 Evacuation Pause) (young)-- 201M->200M(256M), 0.0074755 secs]
2021-08-15T22:21:21.542+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 201M->201M(256M), 0.0026168 secs]
2021-08-15T22:21:21.545+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.545+0800: [GC concurrent-root-region-scan-end, 0.0005030 secs]
2021-08-15T22:21:21.546+0800: [GC concurrent-mark-start]
2021-08-15T22:21:21.547+0800: [GC pause (G1 Humongous Allocation) (young) 201M->201M(256M), 0.0099995 secs]
2021-08-15T22:21:21.556+0800: [Full GC (Allocation Failure)  201M->198M(256M), 0.0061652 secs]
2021-08-15T22:21:21.562+0800: [GC concurrent-mark-abort]
2021-08-15T22:21:21.565+0800: [GC pause (G1 Evacuation Pause) (young)-- 200M->200M(256M), 0.0052637 secs]
2021-08-15T22:21:21.568+0800: [Full GC (Allocation Failure)  200M->200M(256M), 0.0037374 secs]
2021-08-15T22:21:21.572+0800: [Full GC (Allocation Failure)  200M->200M(256M), 0.0040064 secs]
2021-08-15T22:21:21.576+0800: [GC pause (G1 Evacuation Pause) (young) 200M->200M(256M), 0.0023094 secs]
2021-08-15T22:21:21.579+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 200M->200M(256M), 0.0022746 secs]
2021-08-15T22:21:21.581+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:21:21.584+0800: [GC concurrent-root-region-scan-end, 0.0033298 secs]
2021-08-15T22:21:21.585+0800: [Full GC (Allocation Failure) 2021-08-15T22:21:21.586+0800: [GC concurrent-mark-start]
 200M->674K(256M), 0.0087843 secs]
2021-08-15T22:21:21.590+0800: [GC concurrent-mark-abort]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.util.Arrays.copyOfRange(Arrays.java:3664)
        at java.lang.String.<init>(String.java:207)
        at java.lang.StringBuilder.toString(StringBuilder.java:407)
        at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:58)
        at GCLogAnalysis.main(GCLogAnalysis.java:25)
```

结果分析：平均GC时间10毫秒内。由于堆内存过小，内存分配速率过大，导致频繁触发FullGC，最终因没有足够空间来给对象分配内存，触发堆内存OOM。

#### 1G内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx1g -Xms1g -XX:+UseG1GC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T22:15:31.450+0800: [GC pause (G1 Evacuation Pause) (young) 62744K->16673K(1024M), 0.0047077 secs]
2021-08-15T22:15:31.467+0800: [GC pause (G1 Evacuation Pause) (young) 73990K->38735K(1024M), 0.0053861 secs]
2021-08-15T22:15:31.483+0800: [GC pause (G1 Evacuation Pause) (young) 98132K->58717K(1024M), 0.0056909 secs]
2021-08-15T22:15:31.503+0800: [GC pause (G1 Evacuation Pause) (young) 130M->84031K(1024M), 0.0073156 secs]
2021-08-15T22:15:31.533+0800: [GC pause (G1 Evacuation Pause) (young) 181M->111M(1024M), 0.0083929 secs]
2021-08-15T22:15:31.566+0800: [GC pause (G1 Evacuation Pause) (young) 233M->144M(1024M), 0.0087780 secs]
2021-08-15T22:15:31.641+0800: [GC pause (G1 Evacuation Pause) (young) 389M->221M(1024M), 0.0131175 secs]
2021-08-15T22:15:31.691+0800: [GC pause (G1 Evacuation Pause) (young) 442M->282M(1024M), 0.0114429 secs]
2021-08-15T22:15:31.747+0800: [GC pause (G1 Evacuation Pause) (young) 560M->355M(1024M), 0.0156564 secs]
2021-08-15T22:15:31.804+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 639M->422M(1024M), 0.0135537 secs]
2021-08-15T22:15:31.817+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:15:31.818+0800: [GC concurrent-root-region-scan-end, 0.0004025 secs]
2021-08-15T22:15:31.818+0800: [GC concurrent-mark-start]
2021-08-15T22:15:31.820+0800: [GC concurrent-mark-end, 0.0017766 secs]
2021-08-15T22:15:31.820+0800: [GC remark, 0.0021768 secs]
2021-08-15T22:15:31.843+0800: [GC cleanup 439M->429M(1024M), 0.0031921 secs]
2021-08-15T22:15:31.846+0800: [GC concurrent-cleanup-start]
2021-08-15T22:15:31.846+0800: [GC concurrent-cleanup-end, 0.0002299 secs]
2021-08-15T22:15:31.919+0800: [GC pause (G1 Evacuation Pause) (young) 811M->502M(1024M), 0.0172041 secs]
2021-08-15T22:15:31.937+0800: [GC pause (G1 Evacuation Pause) (mixed) 511M->422M(1024M), 0.0079215 secs]
2021-08-15T22:15:31.946+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 426M->422M(1024M), 0.0032167 secs]
2021-08-15T22:15:31.949+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:15:31.950+0800: [GC concurrent-root-region-scan-end, 0.0002368 secs]
2021-08-15T22:15:31.950+0800: [GC concurrent-mark-start]
2021-08-15T22:15:31.951+0800: [GC concurrent-mark-end, 0.0013914 secs]
2021-08-15T22:15:31.951+0800: [GC remark, 0.0019715 secs]
2021-08-15T22:15:31.954+0800: [GC cleanup 435M->433M(1024M), 0.0020649 secs]
2021-08-15T22:15:31.956+0800: [GC concurrent-cleanup-start]
2021-08-15T22:15:31.956+0800: [GC concurrent-cleanup-end, 0.0001180 secs]
2021-08-15T22:15:32.010+0800: [GC pause (G1 Evacuation Pause) (young)-- 858M->669M(1024M), 0.0078005 secs]
2021-08-15T22:15:32.019+0800: [GC pause (G1 Evacuation Pause) (mixed) 680M->607M(1024M), 0.0073284 secs]
2021-08-15T22:15:32.027+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 611M->609M(1024M), 0.0026514 secs]
2021-08-15T22:15:32.030+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:15:32.030+0800: [GC concurrent-root-region-scan-end, 0.0002674 secs]
2021-08-15T22:15:32.031+0800: [GC concurrent-mark-start]
2021-08-15T22:15:32.033+0800: [GC concurrent-mark-end, 0.0022045 secs]
2021-08-15T22:15:32.034+0800: [GC remark, 0.0074166 secs]
2021-08-15T22:15:32.042+0800: [GC cleanup 642M->637M(1024M), 0.0022643 secs]
2021-08-15T22:15:32.044+0800: [GC concurrent-cleanup-start]
2021-08-15T22:15:32.045+0800: [GC concurrent-cleanup-end, 0.0005554 secs]
2021-08-15T22:15:32.071+0800: [GC pause (G1 Evacuation Pause) (young) 838M->666M(1024M), 0.0071345 secs]
2021-08-15T22:15:32.083+0800: [GC pause (G1 Evacuation Pause) (mixed) 701M->577M(1024M), 0.0063277 secs]
2021-08-15T22:15:32.097+0800: [GC pause (G1 Evacuation Pause) (mixed) 638M->509M(1024M), 0.0069737 secs]
2021-08-15T22:15:32.111+0800: [GC pause (G1 Evacuation Pause) (mixed) 560M->475M(1024M), 0.0072133 secs]
2021-08-15T22:15:32.119+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 477M->475M(1024M), 0.0036833 secs]
2021-08-15T22:15:32.123+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:15:32.123+0800: [GC concurrent-root-region-scan-end, 0.0007490 secs]
2021-08-15T22:15:32.124+0800: [GC concurrent-mark-start]
2021-08-15T22:15:32.127+0800: [GC concurrent-mark-end, 0.0027727 secs]
2021-08-15T22:15:32.128+0800: [GC remark, 0.0027294 secs]
2021-08-15T22:15:32.131+0800: [GC cleanup 516M->512M(1024M), 0.0030604 secs]
2021-08-15T22:15:32.134+0800: [GC concurrent-cleanup-start]
2021-08-15T22:15:32.135+0800: [GC concurrent-cleanup-end, 0.0005901 secs]
2021-08-15T22:15:32.177+0800: [GC pause (G1 Evacuation Pause) (young)-- 836M->592M(1024M), 0.0095119 secs]
2021-08-15T22:15:32.188+0800: [GC pause (G1 Evacuation Pause) (mixed) 609M->521M(1024M), 0.0096210 secs]
2021-08-15T22:15:32.206+0800: [GC pause (G1 Evacuation Pause) (mixed) 578M->530M(1024M), 0.0049254 secs]
2021-08-15T22:15:32.211+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 531M->530M(1024M), 0.0036448 secs]
2021-08-15T22:15:32.215+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:15:32.216+0800: [GC concurrent-root-region-scan-end, 0.0009215 secs]
2021-08-15T22:15:32.216+0800: [GC concurrent-mark-start]
2021-08-15T22:15:32.220+0800: [GC concurrent-mark-end, 0.0038804 secs]
2021-08-15T22:15:32.220+0800: [GC remark, 0.0058379 secs]
2021-08-15T22:15:32.227+0800: [GC cleanup 567M->562M(1024M), 0.0020688 secs]
2021-08-15T22:15:32.229+0800: [GC concurrent-cleanup-start]
2021-08-15T22:15:32.229+0800: [GC concurrent-cleanup-end, 0.0005547 secs]
2021-08-15T22:15:32.267+0800: [GC pause (G1 Evacuation Pause) (young) 840M->596M(1024M), 0.0083364 secs]
2021-08-15T22:15:32.279+0800: [GC pause (G1 Evacuation Pause) (mixed) 623M->521M(1024M), 0.0073524 secs]
2021-08-15T22:15:32.293+0800: [GC pause (G1 Evacuation Pause) (mixed) 576M->496M(1024M), 0.0068723 secs]
2021-08-15T22:15:32.306+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 528M->500M(1024M), 0.0041061 secs]
2021-08-15T22:15:32.311+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:15:32.312+0800: [GC concurrent-root-region-scan-end, 0.0012683 secs]
2021-08-15T22:15:32.312+0800: [GC concurrent-mark-start]
2021-08-15T22:15:32.315+0800: [GC concurrent-mark-end, 0.0025178 secs]
2021-08-15T22:15:32.315+0800: [GC remark, 0.0061621 secs]
2021-08-15T22:15:32.322+0800: [GC cleanup 536M->532M(1024M), 0.0044053 secs]
2021-08-15T22:15:32.326+0800: [GC concurrent-cleanup-start]
2021-08-15T22:15:32.327+0800: [GC concurrent-cleanup-end, 0.0010380 secs]
2021-08-15T22:15:32.366+0800: [GC pause (G1 Evacuation Pause) (young)-- 851M->659M(1024M), 0.0085976 secs]
2021-08-15T22:15:32.377+0800: [GC pause (G1 Evacuation Pause) (mixed) 678M->594M(1024M), 0.0091519 secs]
2021-08-15T22:15:32.394+0800: [GC pause (G1 Evacuation Pause) (mixed) 658M->607M(1024M), 0.0054407 secs]
2021-08-15T22:15:32.399+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 608M->607M(1024M), 0.0036648 secs]
2021-08-15T22:15:32.403+0800: [GC concurrent-root-region-scan-start]
2021-08-15T22:15:32.404+0800: [GC concurrent-root-region-scan-end, 0.0007366 secs]
2021-08-15T22:15:32.404+0800: [GC concurrent-mark-start]
2021-08-15T22:15:32.408+0800: [GC concurrent-mark-end, 0.0032031 secs]
2021-08-15T22:15:32.408+0800: [GC remark, 0.0025279 secs]
2021-08-15T22:15:32.412+0800: [GC cleanup 645M->633M(1024M), 0.0050198 secs]
2021-08-15T22:15:32.417+0800: [GC concurrent-cleanup-start]
执行结束!共生成对象次数:149002021-08-15T22:15:32.418+0800:
[GC concurrent-cleanup-end, 0.0005272 secs]
```

结果分析：平均GC时间在10毫秒内。G1延迟比较低。

#### 4G内存下

执行命令

```
java -XX:+PrintGC -XX:+PrintGCDateStamps -Xmx4g -Xms4g -XX:+UseG1GC GCLogAnalysis
```

执行结果

```
正在执行...
2021-08-15T22:18:55.309+0800: [GC pause (G1 Evacuation Pause) (young) 204M->76905K(4096M), 0.0126493 secs]
2021-08-15T22:18:55.348+0800: [GC pause (G1 Evacuation Pause) (young) 253M->136M(4096M), 0.0117777 secs]
2021-08-15T22:18:55.383+0800: [GC pause (G1 Evacuation Pause) (young) 314M->192M(4096M), 0.0121220 secs]
2021-08-15T22:18:55.419+0800: [GC pause (G1 Evacuation Pause) (young) 370M->246M(4096M), 0.0112895 secs]
2021-08-15T22:18:55.454+0800: [GC pause (G1 Evacuation Pause) (young) 424M->302M(4096M), 0.0116330 secs]
2021-08-15T22:18:55.489+0800: [GC pause (G1 Evacuation Pause) (young) 480M->355M(4096M), 0.0106697 secs]
2021-08-15T22:18:55.523+0800: [GC pause (G1 Evacuation Pause) (young) 533M->410M(4096M), 0.0118438 secs]
2021-08-15T22:18:55.566+0800: [GC pause (G1 Evacuation Pause) (young) 626M->472M(4096M), 0.0137619 secs]
2021-08-15T22:18:55.609+0800: [GC pause (G1 Evacuation Pause) (young) 706M->541M(4096M), 0.0150267 secs]
2021-08-15T22:18:55.675+0800: [GC pause (G1 Evacuation Pause) (young) 845M->625M(4096M), 0.0176441 secs]
2021-08-15T22:18:55.803+0800: [GC pause (G1 Evacuation Pause) (young) 1139M->763M(4096M), 0.0251670 secs]
2021-08-15T22:18:55.880+0800: [GC pause (G1 Evacuation Pause) (young) 1169M->866M(4096M), 0.0204391 secs]
2021-08-15T22:18:55.968+0800: [GC pause (G1 Evacuation Pause) (young) 1408M->1006M(4096M), 0.0705038 secs]
2021-08-15T22:18:56.115+0800: [GC pause (G1 Evacuation Pause) (young) 1588M->1152M(4096M), 0.0373847 secs]
执行结束!共生成对象次数:17076
```

结果分析：平均GC时间15毫秒左右。比较前面的GC在4G内存条件下，G1执行垃圾收集次数较多，但时间较短。