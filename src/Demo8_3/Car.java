package Demo8_3;

public class Car {
    String make, model;
    int horsePower;
    public Car(String make){
        this.make = make;
        this.model = "unknown";
        this.horsePower = -1;
    }
    public Car(String make, String model, int horsePower){
        this(make);
        this.model = model;
        this.horsePower = horsePower;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getHorsePower(){
        return this.horsePower;
    }
    public String getInfo(){
        return String.format(
          "The car is: %s %s - %d HP.",
          this.make, this.model,this.getHorsePower()
        );
    }
}
