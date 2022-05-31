# Java 中的集合

先看一个图吧：</br>
<img src="images\Collection-Framework-1.png" alt="Collection-Framework-1.png" width="50%" height="50%" />

<img src="images\Collection-Framework-2.png" alt="Collection-Framework-2.png" width="50%" height="50%" />

第一个图中只讲：ArrayList、PriorityQueue、HashSet

1. 第一个图中均可以用迭代器 iterator 来访问集合中的内容。
2. add. get. isEmpty. contains. size. clear 方法

拿 PriorityQueue 举例子：

```java
import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.add(i); // 增加元素
        }
        System.out.println("集合中的元素个数：" + priorityQueue.size());
        System.out.println("集合中包括元素 5 吗？" + priorityQueue.contains(Integer.valueOf(5)));
        System.out.println("集合为空吗？" + priorityQueue.isEmpty());
        priorityQueue.clear(); // 清空集合
    }
}
```

PriorityQueue 默认是小根堆，咱们来实现大根堆。

```jav
PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
```

大小根堆属于数据结构里面的内容，我不赘述 了。

第二图讲：HashMap

1. map 存储时为<key,value>形式
2. put,get,clear,remove,size,isEmpty

```java
import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",20182222);
        map.put("李四",20183333);
        System.out.println(map.get("张三"));
        map.remove("张三");
    }
}
```

