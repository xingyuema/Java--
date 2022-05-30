# Java 中的数组

分为基本数据类型数组和引用数据类型数组。

基本数据类型数组：

```java
public class Array{
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        // int[] nums = new int[3];nums[0] = 1;nums[1] = 2;nums[3] = 3;
        for(int num : nums){
            System.out.print(num + "\t");
        }
    }
}
```

引用数据类型：

```java
public class ArrayQuote{
    public static void main(String[] args){
        Person[] persons = new Person[2];
        persons[0] = new Person();
        persons[1] = new Person("jack",18);
        for(Person person : persons){
            System.out.println(person.getName() + "\t" + person.getAge());
        }
    }
}
```

