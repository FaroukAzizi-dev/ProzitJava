package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {


    String habitat;

    public Aquatic() {

    }

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public abstract void swim();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aquatic aquatic = (Aquatic) o;
        boolean b = habitat.equals(aquatic.habitat) && getName().equals(aquatic.getName()) ;
        return b && getAge() == aquatic.getAge();
    }
}
