package superheros;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


    Nightcrawler nightcrawler = new Nightcrawler("Kurt Wagner", new String []{ "teleport","camouflage","prehensile tail"} );
    Spiderman spiderman = new Spiderman("Peter Parker" , new String[]{"spider strength","web slinging", "super strength"});
    TheFlash theFlash = new TheFlash("Wally West", new String[]{"super speed", "speed force" });
    Spawn spawn = new Spawn("Al Simmons", new String[]{"necroplasm", "super strength", "flight"});
    Superman superman = new Superman("Clark Kent", new String[]{"super strength","super everything","laser eyes"});
    GreenLantern greenLantern = new GreenLantern("John Stewart", new String[]{"lantern ring", "willpower", "greeen light"});

        ArrayList<Superhero> theLeague = new ArrayList<>();
        theLeague.add(nightcrawler);
        theLeague.add(spawn);
        theLeague.add(spiderman);
        theLeague.add(superman);
        theLeague.add(greenLantern);
        theLeague.add(theFlash);

        Iterator<Superhero> heroes = theLeague.iterator();
        while(heroes.hasNext()){
            Superhero result = heroes.next();
            System.out.println(result );
        }


        ArrayList<IFlightSpeed> flyers = new ArrayList<>();
        flyers.add(greenLantern);
        flyers.add(spawn);
        flyers.add(superman);

        Iterator<IFlightSpeed> flyingHeroes = flyers.iterator();
        while(flyingHeroes.hasNext()){
            IFlightSpeed result = flyingHeroes.next();
            System.out.println(result + "\n" + result.flightSpeed("really high!"));
        }
//        Superhero[] pantheon = new Superhero[]{ nightcrawler, spawn, spiderman, theFlash, superman};
//        for (Superhero hero : pantheon){
//            System.out.println(hero.listPowers());
//        }
//        System.out.println( spawn.myBlackHero() + " and " + spawn.flightSpeed("9999 mph"));
//        System.out.println( superman.flightSpeed("super fast"));
//
//        IFlightSpeed[] flyingHeroes = new IFlightSpeed[]{spawn,superman,greenLantern};
//        for (IFlightSpeed hero : flyingHeroes ) {
//            System.out.println(hero.flightSpeed("super fast"));
//        }

    }
}
