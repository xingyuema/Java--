public class A{
    private int tmp = 1; // 表示只能在本类中访问
    
    public static void main(String[] args){
        A a = new A();
        System.out.println("tmp = " + a.tmp);
    }
}