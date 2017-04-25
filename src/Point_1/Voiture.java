
package roue;

public class Voiture {
private Chasis C;
private Motor M;
private Roue[] R;
public Voiture(Roue a,Roue b,Roue c,Roue d,Motor x,Chasis y){
    this.R=new Roue[4];
    R[0]=a;
    R[1]=b;
    R[2]=c;
    R[3]=d;
    this.C=y;
    this.M=x;
}


    @Override
    public String toString() {
        for (Roue R1 : R) {
            System.out.println("R="+R1);
        }
        return "Voiture{" + "C=" + C + ", M=" + M ;
        
        
    }

}
