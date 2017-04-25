
package roue;


public class Motor {
    private String marca;
    public Motor(String m){
        this.marca=m;
    }

    @Override
    public String toString() {
        return "Motor{" + "marca=" + marca + '}';
    }
    
}
