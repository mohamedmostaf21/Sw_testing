package implementation;

public class Coffee {
    private String name;
    private double coffeePowderNeeded;
    private double milkNeeded;
    private double waterNeeded;
  

    public Coffee(String name, double coffeePowderNeeded, double milkNeeded, double waterNeeded) {
        this.name = name;
        this.coffeePowderNeeded = coffeePowderNeeded;
        this.milkNeeded = milkNeeded;
        this.waterNeeded = waterNeeded;

    }

    public String getName() {
        return name;
    }

    public double getCoffeePowderNeeded() {
        return coffeePowderNeeded;
    }

    public double getMilkNeeded() {
        return milkNeeded;
    }

    public double getWaterNeeded() {
        return waterNeeded;
    }
    

}