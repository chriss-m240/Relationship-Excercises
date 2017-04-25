
package Point_5;

public class Category extends DomainObject{
    private String name;
    private String description;
    private Product[] product;
    private int n=0;
    public Category(String id,int x,String name,String description){
        super(id);
        this.product=new Product[x];
        this.name=name;
        this.description=description;
    }

   
    public void addProduct(Product x){
        this.product[n]=x;
        n++;   
    }
    public void Listar(){
        for (Product product1 : product) {
            System.out.println("Producto "+product1);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Category{" + "name=" + name + ", description=" + description + ", n=" + n + '}';
    }
    
    
}
