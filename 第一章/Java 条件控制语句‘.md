# Java 条件控制语句

一、```if,else if,else```

使用：

代码1：

```java
public class Control{
    public static void main(String[] args){
        int a = 1;
        if(a > 0){
            System.out.println("a 大于 0");
        }else{
            System.out.println("a 不大于 0");
        }
    }
}
```
<img src="images\image-20220528214656878.png" alt="image-20220528214656878.png" width="50%" height="50%" />


代码2：

```java
public class Control{
    public static void main(String[] args){
        int a = 1;
        if(a > 0){
            System.out.println("a 大于 0");
        }else if(a == 1){
            System.out.println("a 等于 1");
        }else{
            System.out.println("a 既不大于0 也不大于 1");
        }
    }
}
```
<img src="images\image-20220528214837510.png" alt="image-20220528214837510.png" width="50%" height="50%" />

引入 else if 后的特点：满足一个条件就退出。

------

二、三目运算符：

使用三目运算符重构代码1：

```java
public class Control{
    public static void main(String[] args){
        int a = 1;
        System.out.println(a > 0 ? "a 大于 0" : "a 不大于 0"); // ？ 前的 a > 0 正确则输出 "a 大于 0"，否则 "a 不大于 0"
    }
}
```
<img src="images\image-20220528215313791.png" alt="image-20220528215313791.png" width="50%" height="50%" />

------

三、switch 语句

```java
import java.util.*; // 导入Scanner
public class Control{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // 控制台输入工具
        int a = scanner.nextInt(); // 从控制台输入
        switch(a){
            case 0:
                System.out.println("a = " + 0)
                break;
            case 1:
                System.out.println("a = " + 1)
                break;
            default:
                System.out.println("与前面的值都不匹配！");
                break;
        }
    }
}
```
<img src="images\image-20220528220742669.png" alt="image-20220528220742669.png" width="50%" height="50%" />

