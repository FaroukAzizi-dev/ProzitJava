package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{

    float SwimmingDepth;

    public Penguin() {

    }

    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float SwimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.SwimmingDepth = SwimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "SwimmingDepth=" + SwimmingDepth +
                '}';
    }
    @Override
    public void swim(){
        System.out.println("This Penguin is swimming");
    }

    public float getSwimmingDepth(){
        return SwimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth){
        SwimmingDepth = swimmingDepth;
    }
}
