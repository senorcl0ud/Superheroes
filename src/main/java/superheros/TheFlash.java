package superheros;

public class TheFlash extends Superhero{

    public TheFlash(String realName, String[] specialPowers){
        super(realName, specialPowers);
    }

    public String listPowers(){
        return  getRealName() + " possesses these super powers: " +  getSpecialPowers();
    }
}
