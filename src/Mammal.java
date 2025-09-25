/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2211510280 - Firdhan Happyanda
 */


public class Mammal extends Animal {
    
    private String furColor;

    
    public Mammal(String name, int age, String furColor) {
        super(name, age); 
        this.furColor = furColor;
    }

  
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    
    @Override
    public String makeSound() {
        return "The mammal makes a sound.";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Fur Color: " + furColor;
    }
}
