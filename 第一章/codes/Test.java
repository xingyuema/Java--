public class Test{
    // 属性
    private String name = "Rose";
    private int age = 17;
    // 构造器
    public Test(String name,int age){
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