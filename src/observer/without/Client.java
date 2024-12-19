package observer.without;


class Display {
    private String name;

    Display(String name) {
        this.name = name;
    }

    void update(float temperature) {
        System.out.println(name + " updated with temperature: " + temperature);
    }
}


class WeatherStation {
    private float temperature;
    private Display display1;
    private Display display2;

    void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyDisplays();
    }

    void addDisplay(Display display1, Display display2) {
        this.display1 = display1;
        this.display2 = display2;
    }

    private void notifyDisplays() {
        if (display1 != null) display1.update(temperature);
        if (display2 != null) display2.update(temperature);
    }
}


public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display("Display 1");
        Display display2 = new Display("Display 2");

        weatherStation.addDisplay(display1, display2);
        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(30.0f);
    }
}
