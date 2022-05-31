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