public class Bear extends Animal {
    // complete the Bear class here, using the completed Tiger class as an example
    public Bear(String name){
        super(name,"fish");
    }
    // here, we override the sleep function
    public void sleep() {
        System.out.println( this.name + " hibernates for 4 months");

    }
}

