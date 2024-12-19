package abstract_factory.without;

import java.util.Scanner;

class WindowsButton {
    public void render() {
        System.out.println("Rendering Windows Button...");
    }
}

class WindowsCheckBox {
    public void render() {
        System.out.println("Rendering Windows CheckBox...");
    }
}

class MacButton {
    public void render() {
        System.out.println("Rendering Mac Button...");
    }
}

class MacCheckBox {
    public void render() {
        System.out.println("Rendering Mac CheckBox...");
    }
}

public class PlatformUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the platform (Windows/Mac): ");
        String platform = scanner.nextLine();

        if (platform.equalsIgnoreCase("Windows")) {
            WindowsButton button = new WindowsButton();
            WindowsCheckBox checkBox = new WindowsCheckBox();
            button.render();
            checkBox.render();
        } else if (platform.equalsIgnoreCase("Mac")) {
            MacButton button = new MacButton();
            MacCheckBox checkBox = new MacCheckBox();
            button.render();
            checkBox.render();
        } else {
            System.out.println("Unknown platform!");
        }

        scanner.close();
    }
}
