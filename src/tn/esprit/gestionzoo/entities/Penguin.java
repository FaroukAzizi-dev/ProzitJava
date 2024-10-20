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
}
