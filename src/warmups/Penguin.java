package warmups;

public class Penguin {
    private String name;
    private double weightInLBS;
    private String species;
    private String sex;

    //Constructor
    public Penguin(String name, double weightInLBS, String species, String sex) {
        this.name = name;
        this.weightInLBS = weightInLBS;
        this.species = species;
        this.sex = sex;
    }

    //==
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //===
    public double getWeight(){
        return weightInLBS;
    }
    public void setWeightInLBS(double weightInLBS){
        this.weightInLBS = weightInLBS;
    }

    //==
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species){
        this.species = species;
    }

    //==
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

//    public static void main(String[] args) {
//        public static boolean canFly(){
//            return false;
//        }
//        public static boolean areEvil(){
//            return false;
//        }
//    }
}
