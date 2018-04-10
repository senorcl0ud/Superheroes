package superheros;

public class Main {

    public static void main(String[] args) {


    Nightcrawler nightcrawler = new Nightcrawler("Kurt Wagner", new String []{ "teleport","camouflage","prehensile tail"} );
    Spiderman spiderman = new Spiderman("Peter Parker" , new String[]{"spider strength","web slinging", "super strength"});
    TheFlash theFlash = new TheFlash("Wally West", new String[]{"super speed", "speed force" });
    Spawn spawn = new Spawn("Al Simmons", new String[]{"necroplasm", "super strength", "flight"});
    Superman superman = new Superman("Clark Kent", new String[]{"super strength","super everything","laser eyes"});
    GreenLantern greenLantern = new GreenLantern("John Stewart", new String[]{"lantern ring", "willpower", "greeen light"});

        Superhero[] pantheon = new Superhero[]{ nightcrawler, spawn, spiderman, theFlash, superman};
        for (Superhero hero : pantheon){
            System.out.println(hero.listPowers());
        }
        System.out.println( spawn.myBlackHero() + " and " + spawn.flightSpeed("9999 mph"));
        System.out.println( superman.flightSpeed("super fast"));

        IFlightSpeed[] flyingHeroes = new IFlightSpeed[]{spawn,superman,greenLantern};
        for (IFlightSpeed hero : flyingHeroes ) {
            System.out.println(hero.flightSpeed("super fast"));
        }

    }
}
