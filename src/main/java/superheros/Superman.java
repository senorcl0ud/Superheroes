package superheros;

public class Superman extends Superhero implements IFlightSpeed {
    public Superman(String realName, String[] specialPowers){
        super(realName,specialPowers);
    }

    public String listPowers() {
        return getRealName() + " possesses these super powers: " +  getSpecialPowers();
    }


    public String flightSpeed(String flightSpeed) {
        return "My hero can fly at " + flightSpeed + ".";
    }
}
