public class Runner {
    public static void main(String[] args){
        tiger tigger = new tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Zookeeper zoeBot = new Zookeeper("Zoebot");
        Animal[] animals = new Animal[]{tigger,pooh,rarity,gemma,stinger};
        zoeBot.feedAnimals(animals,"phil");

    }
}
