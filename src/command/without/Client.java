package command.without;

class Light {
    void turnOn() {
        System.out.println("Light is ON");
    }

    void turnOff() {
        System.out.println("Light is OFF");
    }
}

class RemoteControl {
    Light light;

    RemoteControl(Light light) {
        this.light = light;
    }

    void pressButton(String command) {
        if (command.equals("ON")) {
            light.turnOn();
        } else if (command.equals("OFF")) {
            light.turnOff();
        }
    }
}

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remote = new RemoteControl(light);

        remote.pressButton("ON");
        remote.pressButton("OFF");
    }
}



