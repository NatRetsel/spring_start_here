package Parrot;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";

    public void setName (String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Parrot : " + this.name;
    }
}
