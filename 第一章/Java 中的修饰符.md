# Java 中的修饰符

有 private、default、protected、public 四种修饰符，下图描述了各修饰符的访问权限。
<img src="images\修饰符.jpg" alt="image-20220526164501943" width="50%" height="50%" />

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
<img src="images\image-20220528200416675.png" alt="image-20220526164501943" width="50%" height="50%" />

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
<img src="images\image-20220528201105640.png" alt="image-20220528201105640" width="50%" height="50%" />


其他的类似，触类旁通即可。
