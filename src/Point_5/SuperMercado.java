package Point_5;

public class SuperMercado {

   
    public static void main(String[] args) {
       Item i1=new Item("1234","Oreo",12.99);
       Item i2=new Item("2546","Ranchera",26.56);
       Product P1=new Product("1234",2,"Oreo","Galletas rellenas de crema");
       P1.addItem(i1);
       P1.addItem(i1);
       Product P2=new Product("2546", 3,"Ranchera","Salchichas");
       P2.addItem(i2);
       P2.addItem(i2);
       Category C1=new Category("8945",2,"Dulces","Contiene todo tipo de dulces");
       C1.addProduct(P1);
       C1.Listar();
       
       
    }
    
}
