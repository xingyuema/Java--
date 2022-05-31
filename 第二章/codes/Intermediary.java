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