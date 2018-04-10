package superheros;

import java.util.Arrays;

public class Spawn extends Superhero implements IFlightSpeed, BlackHeroes{


    public Spawn(){

    }

    public Spawn(String realName, String[] specialPowers){
        super(realName, specialPowers);
    }


    public String listPowers() {
        return getRealName() + " possesses these super powers: " +  getSpecialPowers();
    }

    public String myBlackHero() {
        return "My black hero is " + getClass().getSimpleName();
    }

    public String flightSpeed(String flightSpeed) {
        return "My hero can fly at " + flightSpeed + ".";
    }
}
