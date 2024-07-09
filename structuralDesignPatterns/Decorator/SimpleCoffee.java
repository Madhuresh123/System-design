package Decorator;

// ConcreteComponent
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public double cost() {
        return 2.00;
    }
}

