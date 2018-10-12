public class tiger {
    // put your instance variables here!
    String favoriteFood;
    String name;

    public tiger(String name) {
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep() {
        System.out.println( this.name + " sleeps for 8 hours");

    }

    public void eat(String food){
        System.out.println(this.name+" eats "+food);
        if(food == this.favoriteFood){
            System.out.println("YUM!!! " +this.name+ " wants more "+food);
        }else{
            sleep();
        }
    }

    public static void main(String[] args) {
        //either make a new instance of a zoo
        //to call the non-static sleep method....
        tiger tigger = new tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }

}
