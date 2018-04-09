package superheros;

public class Spiderman extends Superhero {


    public Spiderman(String realName, String[] specialPowers){
        super(realName,specialPowers);
    }

    public String listPowers() {
        return  getRealName() + " possesses these super powers: " +  getSpecialPowers();
    }

}
