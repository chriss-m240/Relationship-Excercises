
package Point_1;

public class Main {
    public static void main(String[] args) {
       Motor m=new Motor("Diesel");
       Roue r1=new Roue("Michellin");
       Roue r2=new Roue("THX");
       Roue r3=new Roue("Bridgestone");
       Roue r4=new Roue("Toyota");
       Chasis C=new Chasis("Ford");
       Voiture V1=new Voiture(r1, r2, r3, r4,m, C);
       Voiture V2=new Voiture(r4, r4, r2, r2,m,C);
       Persona P=new Persona(2);
       P.addCar(V1,0);
       P.addCar(V2,1);
       P.Listar();
    }
}
