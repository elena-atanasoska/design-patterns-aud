package decorator.without;

class Pizza {
    String description = "Plain Pizza";

    String getDescription() {
        return description;
    }

    double cost() {
        return 5.00;
    }
}

class CheesePizza extends Pizza {
    CheesePizza() {
        description = "Plain Pizza with Cheese";
    }

    @Override
    double cost() {
        return super.cost() + 1.50;
    }
}

class CheesePepperoniPizza extends CheesePizza {
    CheesePepperoniPizza() {
        description = "Plain Pizza with Cheese and Pepperoni";
    }

    @Override
    double cost() {
        return super.cost() + 2.00;
    }
}

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new CheesePepperoniPizza();
        System.out.println(pizza.getDescription() + ": $" + pizza.cost());
    }
}
