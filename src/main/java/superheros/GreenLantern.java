package superheros;

public class GreenLantern extends Superhero implements IFlightSpeed {

    public GreenLantern(String realName, String[] specialPowers){
        super(realName, specialPowers);
    }

    public String flightSpeed(String flightSpeed) {
        return "My hero can fly at " + flightSpeed + ".";
    }

    public String listPowers() {
        return getRealName() + " possesses these super powers: " +  getSpecialPowers();
    }
}
