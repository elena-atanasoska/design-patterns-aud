package decorator.with;

interface Pizza {
    String getDescription();

    double cost();
}

class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}

abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}

class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return super.cost() + 1.50;
    }
}

class Pepperoni extends PizzaDecorator {

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }

    @Override
    public double cost() {
        return super.cost() + 2.25;
    }
}

class Olives extends PizzaDecorator {

    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double cost() {
        return super.cost() + 0.75;
    }
}

public class Client {
    public static void main(String[] args) {

        Pizza pizza = new Cheese(new Olives(new Pepperoni(new PlainPizza())));

        System.out.println(pizza.getDescription() + ": $" + pizza.cost());
    }
}
