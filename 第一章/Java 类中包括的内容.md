# Java 类中包括的内容

类中的内容：属性、构造器、方法

```java
public class Person{
    // 属性
    private String name = "Rose";
    private int age = 17;
    
    // 默认构造器 
    public Person(){
        
    }
    
    // 带参构造器
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    // 方法
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
```

编译时出现错误：主要原因是记事本使用 UTF-8 编码，里面出现中文，拿去直接编译的话会出错，因为编译时默认使用 ANSI编码。
<img src="images\image-20220528205015586.png" alt="image-20220528205015586" width="50%" height="50%" />

修改方法：

1. 指定编码方式为`utf-8`，例如在`javac`和`文件名称`中间加上`-encoding UTF-8`就可以编译成功了，然后就可以运行了。
2. 将 Person.java 修改为 ANSI 编码。
<img src="images\image-20220528205808357.png" alt="image-20220528205808357" width="50%" height="50%" />

------

new 一个对象：

- **使用默认构造器```Person person = new Person();```**

```java
public class TestPerson{
    public static void main(String[] args){
        Person person = new Person();
        System.out.println("person.name = " + person.getName());
        System.out.println("person.age = " + person.getAge());
    } 
}
```

运行截图：</br>
<img src="images\image-20220528210410470.png" alt="image-20220528210410470" width="50%" height="50%" />

- **使用带参数的构造器```Person person = new Person("Jack",18);```**

```java
public class TestPerson1{
    public static void main(String[] args){
        Person person = new Person("Jack",18);
        System.out.println("person.name = " + person.getName());
        System.out.println("person.age = " + person.getAge());
    } 
}
```

运行截图：</br>
<img src="images\image-20220528210659264.png" alt="image-20220528210659264" width="50%" height="50%" />

