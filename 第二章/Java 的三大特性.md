# Java 的三大特性

三大特性：继承、封装、多态

一、继承：继承就是子类继承父类的特征和行为。好处是代码复用。

Ps：子类不能继承父类中访问权限为 `private` 的成员变量和方法，也不能继承父类的构造方法。子类可以重写父类的方法，及命名与父类同名的成员变量。

```java
public class Car {
    public void drive(){
        System.out.println("抓紧了，要开车了。");
    }
}
```

```java
public class Bmw extends Car {
    @Override
    public void drive() {
        System.out.print("我是宝马，");
        super.drive();
    }
}
```

```java
public class Mercedes extends Car{
    @Override
    public void drive() {
        System.out.print("我是奔驰，");
        super.drive();
    }
}
```

```java
public class TestCar{
    public static void main(String[] args){
        Car bmw = new Bmw();
        bmw.drive();
        Car mercedes = new Mercedes();
        mercedes.drive();
    }
}
```



二、封装：封装的目的是增强安全性和简化编程，使用者不必了解具体的实现细节，只需向外暴露接口。

我们用一个租房过程来举例：

```java
// 房子
public class House{
    private String type; // 房屋类型：别墅、公寓、民房
    private double price; // 价格
    
    public String getType(){
        return this.type;
    }
    public double getPrice(){
        return this.price;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
```

```java
// 房东
public class Landlord {
    public void contract(){
        System.out.println("我是房东，我在和租户签约。");
    }
}
```



```java
import java.util.*; // 导入 util 包下的所有类，比如 List
// 中介类：他有房源
public class Intermediary{
    private List<House> houses;// 房子
    private Landlord landlord; // 房东

    // 根据客户的需求查看自己手里有没有客户需要的房子
    public boolean findHouse(String type){
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getType() == type){
                return true;
            }
        }
        return false;
    }

    // 看房过程
    public void houseView(String type){
        if (findHouse(type)){
            System.out.println("中介带顾客看房");
        }else {
            System.out.println("中介没有客户需要得房型，抱歉。");
        }
    }

    // 签约
    public void contract(){
        this.landlord.contract();
    }

    public List<House> getHouses(){
        return this.houses;
    }

    public void setHouses(List<House> houses){
        this.houses = houses;
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }
}
```

```java
// 租户
public class Tenant {
    private String need; // 租户所需要得房子类型

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }
}
```

```java
import java.util.ArrayList;
import java.util.List;

// 模拟租房过程
public class Rent {
    // 创建一个租户
    public static Tenant createTenant(){
        Tenant tenant = new Tenant(); // 租户
        tenant.setNeed("公寓");
        return tenant;
    }

    // 创建中介
    public static Intermediary createIntermediary(){
        Intermediary intermediary = setHouses();
        Intermediary result = setLandloard(intermediary);
        return result;
    }

    public static Intermediary setHouses(){
        Intermediary intermediary = new Intermediary();
        List<House> houses = new ArrayList<House>();
        House house1 = new House();
        house1.setType("别墅");
        house1.setPrice(3000);
        House house2 = new House();
        house2.setType("公寓");
        house2.setPrice(1000);
        houses.add(house1);
        houses.add(house2);
        intermediary.setHouses(houses);
        return intermediary;
    }

    public static Intermediary setLandloard(Intermediary intermediary){
        intermediary.setLandlord(new Landlord());
        return intermediary;
    }

    public static void main(String[] args) {
        Tenant tenant = Rent.createTenant(); // 租户
        Intermediary intermediary = Rent.createIntermediary(); // 中介
        intermediary.houseView(tenant.getNeed());  // 带租客看房
        intermediary.contract();    // 房东与租客签约
    }
}

```

三、多态：具体表现为父类的引用指向子类的实例，使其具有不同行为。

Ps：多态给我们带来的好处是消除了类之间的**耦合**关系，使程序更容易扩展。

```java
public interface Bird {
    public void call();
}
```

```java
// 鸭子
public class Duck implements Bird {
    @Override
    public void call() {
        System.out.println("i am duck!");
    }
}
```

```java
// 火鸡
public class Turkey implements Bird {
    @Override
    public void call() {
        System.out.println("i am turkey!");
    }
}
```

```java
public class TestBird {
    public static void main(String[] args) {
        Bird bird = new Duck();
        bird.call();
        Bird bird1 = new Turkey();
        bird1.call();
    }
}
```

#### 实现多态的三个必要条件

1. 继承：在多态中必须存在有继承关系的子类和父类。
2. 重写：子类对父类中某些方法进行重新定义，在调用这些方法时就会调用子类的方法。
3. 向上转型：在多态中需要将子类的引用赋给父类对象，只有这样该引用才能够具备技能调用父类的方法和子类的方法。

只有满足了上述三个条件，我们才能够在同一个继承结构中使用统一的逻辑实现代码处理不同的对象，从而达到执行不同的行为。