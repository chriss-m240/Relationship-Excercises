
package roue;


public class Persona {
    private Voiture[] V;
    public Persona(int x){
        this.V = new Voiture [x];
}
    public void addCar(Voiture x,int y){
        this.V[y]=x;
    }
    public void Listar(){
        int a=1;
        for (Voiture V1 : V) {
            
            System.out.println("Auto #"+a);
            a++;
            System.out.println(V1);
            
        }
    }
}
