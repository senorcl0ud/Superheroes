package superheros;

public class Nightcrawler extends Superhero {


    public Nightcrawler(String realName, String[] specialPowers){
        super(realName,specialPowers);
    }

    public String listPowers() {
        return  getRealName() + " possesses these super powers: " +  getSpecialPowers();
    }
}
