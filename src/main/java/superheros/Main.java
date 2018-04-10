package superheros;

public class Main {

    public static void main(String[] args) {


    Superhero nightcrawler = new Nightcrawler("Kurt Wagner", new String []{ "teleport","camouflage","prehensile tail"} );
    Superhero spiderman = new Spiderman("Peter Parker" , new String[]{"spider strength","web slinging", "super strength"});
    Superhero theFlash = new TheFlash("Wally West", new String[]{"super speed", "speed force" });
    Superhero spawn = new Spawn("Al Simmons", new String[]{"necroplasm", "super strength", "flight"});



        Superhero[] pantheon = new Superhero[]{ nightcrawler, spawn, spiderman, theFlash};
        for (Superhero hero : pantheon){
            System.out.println(hero.listPowers());
        }
        System.out.println(((Spawn) spawn).myBlackHero() + " and " + ((Spawn) spawn).flightSpeed("9999 mph"));


    }
}
