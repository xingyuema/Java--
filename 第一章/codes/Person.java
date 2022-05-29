public class Person{
    // 属性
    private String name = "Rose";
    private int age = 17;
    
    // 默认构造器 
    public Person(){
        
    }
    
    // 构造器
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