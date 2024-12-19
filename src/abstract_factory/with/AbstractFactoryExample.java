package abstract_factory.with;

import java.util.Scanner;


interface Button {
    void renderButton();
}

interface CheckBox {
    void renderCheckBox();
}

class WindowsButton implements Button {

    @Override
    public void renderButton() {
        System.out.println("Rendering Windows Button...");
    }
}

class WindowsCheckBox implements CheckBox {

    @Override
    public void renderCheckBox() {
        System.out.println("Rendering Windows CheckBox...");
    }
}

class MacButton implements Button {

    @Override
    public void renderButton() {
        System.out.println("Rendering Mac Button...");
    }
}

class MacCheckBox implements CheckBox {

    @Override
    public void renderCheckBox() {
        System.out.println("Rendering Mac CheckBox...");
    }
}

interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}

class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}

class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}

class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    void renderUI() {
        button.renderButton();
        checkBox.renderCheckBox();
    }
}


public class AbstractFactoryExample {
    public static void main(String[] args) {
        GUIFactory factory;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the platform (Windows/Mac): ");
        String platform = scanner.nextLine();

        if (platform.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else if (platform.equalsIgnoreCase("Mac")) {
            factory = new MacFactory();
        } else {
            System.out.println("Unknown platform!");
            scanner.close();
            return;
        }

        Application app = new Application(factory);
        app.renderUI();

        scanner.close();
    }
}
