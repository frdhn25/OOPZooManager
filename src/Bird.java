/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2211510280 - Firdhan Happyanda
 */

public class Bird extends Animal {
    
    private boolean canFly;

    
    public Bird(String name, int age, boolean canFly) {
        super(name, age); 
        this.canFly = canFly;
    }

    
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    
    @Override
    public String makeSound() {
        return "The bird chirps.";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Can Fly: " + (canFly ? "Yes" : "No");
    }
}

