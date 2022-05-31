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