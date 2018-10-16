import java.util.ArrayList;

public class Zookeeper {
    String name;
    public Zookeeper(String name){
        this.name = name;
    }
    public void feedAnimals(Animal[] Animals, String food){
        System.out.println( this.name + " is feeding " + food + " to " + Animals.length + " of " + Animal.animalCount + " total Aaimals");
        for(int i = 0; i < Animals.length; i++){
            Animals[i].eat(food);
        }
    }

}
