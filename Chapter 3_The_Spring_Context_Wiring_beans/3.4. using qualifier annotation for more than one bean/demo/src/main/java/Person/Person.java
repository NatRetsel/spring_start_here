package Person;



import Parrot.Parrot;


public class Person {
    private String name = "Ella";

    
    private Parrot parrot; 


    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public String getParrot() {
        return this.parrot.getName();
    }

    public void setParrot(Parrot parrot){
        this.parrot = parrot;
    }

}
