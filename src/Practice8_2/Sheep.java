package Practice8_2;

public class Sheep {
    String name, gender;
    int age;
    public Sheep(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public int getProductivity() {
        if (this.age <= 1) return 0;
        else if (gender.equalsIgnoreCase("male")) return 14;
        else return 8;
    }
    public void addOneYear(){
        this.age++;
    }
    public String getInfo(){
        return String.format(
                "Sheep %s gives %d kg of wool per cut",
                this.name,this.getProductivity()
        );

    }
}
