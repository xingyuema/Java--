public class CycleWhile{
    public static void main(String[] args){
        int len = args.length,i = 0;
        while(i < len){
            System.out.print(args[i] + "\t");
            i++;
        }
    }
}