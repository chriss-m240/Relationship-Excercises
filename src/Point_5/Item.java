
package Point_5;

public class Item extends DomainObject{
    private String name;
    private double unitCost;
    public Item(String id,String name,double precio){
        super(id);
        this.name=name;
        this.unitCost=precio;
    }

    public String getName() {
        return name;
    }
    public double getUnitCost() {
        return unitCost;
    }

    @Override
    public String toString() {
        return "Item" + "name=" + name + ", unitCost=" + unitCost;
    }
    
    
}
