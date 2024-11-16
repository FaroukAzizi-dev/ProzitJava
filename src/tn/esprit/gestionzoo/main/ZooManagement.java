package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

         ///////////////////////// PROZIT 5

        Dolphin dolphin = new Dolphin("aquatic", "BOBO", 10, false,"Chat hlel",65);
        Penguin penguin = new Penguin("aquatic", "said" , 15 , false , "koko" ,150);


        dolphin.swim();

        penguin.swim();


        //////////////////PROZIT 6

        Dolphin dolphin1 = new Dolphin("aquatic", "HAMA", 10, false,"Chat hlel",65);
        Penguin penguin1 = new Penguin("aquatic", "TATA" , 15 , false , "koko" ,54);


        notMyZoo.addAquaticAnimal(dolphin);
        notMyZoo.addAquaticAnimal(dolphin1);
        notMyZoo.addAquaticAnimal(penguin);
        notMyZoo.addAquaticAnimal(penguin1);


        notMyZoo.afficherAquatic();

        float max = notMyZoo.maxPenguinSwimmingDepth();
        System.out.println("Pronfondeur maximale d'un penguin " + max);

        notMyZoo.displayNumberofAquaticsByType();

        





    }
}
