# Java 环境配置

一、下载 JDK（Java SE Development Kit）：https://www.oracle.com/java/technologies/downloads/#java8-windows

Ps: 根据需要选择 x64 （表示计算机是64位的）

查看步骤：

1. <img src="images\image-20220526161931548.png" alt="image-20220526161931548" width="50%" height="50%" />

2. <img src="images\image-20220526162721849.png" alt="image-20220526162721849" width="50%" height="50%" />
3. <img src="images\image-20220526162823765.png" alt="image-20220526162823765" width="50%" height="50%" />

------

二、安装过程：https://juejin.cn/post/6844903937095499789

**在安装之前请先看这里：**

- JAVA_HOME ：为了方便引用，以后你们会学到封装，改只改一次。
- CLASSPATH ： A.java 编译后会生成 A.class，java 命令通过 CLASSPATH 找编译好的 *.class。
- PATH : 在任何路径下都可以用 java 来执行命令

------

三、验证是否安装成功

```
java -version
javac
```

输入这两个命令查看是否报错。

------



