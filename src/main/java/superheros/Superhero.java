package superheros;

import java.util.Arrays;

public abstract class  Superhero {
    private String realName;
    private String[] specialPowers;


    public Superhero(){

    }


    public Superhero(String realName, String[] specialPowers){
        this.realName = realName;
        this.specialPowers = specialPowers;

    }



    public abstract String listPowers();


    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String[] getSpecialPowers() {
        return specialPowers;
    }

    public void setSpecialPowers(String[] specialPowers) {
        this.specialPowers = specialPowers;
    }


    @Override
    public String toString() {
        return "superheros.Superhero{" +
                "realName='" + realName + '\'' +
                ", specialPowers=" + Arrays.toString(specialPowers) +
                '}';
    }

}
