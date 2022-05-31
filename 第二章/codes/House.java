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