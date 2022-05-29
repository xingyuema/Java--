# Java 中的修饰符

有 private、default、protected、public 四种修饰符，下图描述了各修饰符的访问权限。

![](D:\工作\讲课\笔记\第一章\images\修饰符.jpg)

这里的包你可以理解为是一个文件夹。

举个访问权限的例子：private

```java
public class A{
    private int tmp = 1; // 表示只能在本类中访问
    
    public static void main(String[] args){
        A a = new A();
        System.out.println("tmp = " + a.tmp);
    }
}
```

运行截图：

![image-20220528200416675](images\image-20220528200416675.png)

同包下创建一个 B.java，在 B 中访问A。

```java
public class B{
    public static void main(String[] args){
        A a = new A();
        System.out.println("A 中的 tmp = " + A.tmp);
    }
}
```

运行截图：

![image-20220528201105640](C:\Users\blue\AppData\Roaming\Typora\typora-user-images\image-20220528201105640.png)

其他的类似，触类旁通即可。
