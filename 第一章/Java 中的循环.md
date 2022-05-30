# Java 中的循环

主要讲解：do ··· while、while、for、foreach

一、do ··· while

```java
public class Cycle{
    public static void main(String[] args){
        int i = 0,n = 10;
        do{
            System.out.print(i + "\t");
        }while(i++ < n);
    }
}
```

二、while

```java
public class CycleWhile{
    public static void main(String[] args){
        int len = args.length,i = 0;
        while(i < len){
            System.out.print(args[i] + "\t");
            i++;
        }
    }
}
```

三、for

```java
public class CycleFor{
    public static void main(String[] args){
        for(int i = 0;i < args.length;i++){
            System.out.print(args[i] + "\t");
        }
    }
}
```

四：foreach

```java
public class CycleForeach{
    public static void main(String[] args){
        for(String s : args){
            System.out.print(s + "\t");
        }
    }
}
```

