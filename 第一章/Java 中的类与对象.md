# Java 中的类与对象

首先，一个类可以有多个实例（对象）。一个类比：类相当于模具，对象是根据模具生产出来的。

用 class 标识类。

```java
public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
```

1. 第一个 public 修饰类 ，第二个 public 修饰方法

2. Helloworld：类名
3. 每个程序只有一个入口：```public static void main(String[] args){}```
4. System.out.println：将内容输出到控制台并且换行

new 一个对象：```HelloWorld helloWorld = new HelloWorld();```

