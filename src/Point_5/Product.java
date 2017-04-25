
package Point_5;


public class Product extends DomainObject{
    private String name;
    private String description;
    private Item[] item;
    private int n=0;
    public Product(String id,int x,String name,String des){
        super(id);
        this.item=new Item[x];
        this.description=des;
        this.name=name;
    }

    
    public void addItem(Item x){
        this.item[n]=x;
        n++;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        for (Item item1 : item) {
        return "Product{" + "Name=" + name + ", Description=" + description + ", Item=" + item1 + ", Cantidad=" + n + '}';
    }
        return null;
}
}