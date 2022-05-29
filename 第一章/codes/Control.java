import java.util.*; // 导入Scanner
public class Control{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // 控制台输入工具
        int a = scanner.nextInt(); // 从控制台输入
        switch(a){
            case 0:
                System.out.println("a = " + 0);
                break;
            case 1:
                System.out.println("a = " + 1);
                break;
            default:
                System.out.println("与前面的值都不匹配！");
                break;
        }
    }
}