package observer.with;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

interface Observer {
    void update(double temperature);
}

class WeatherStation implements Subject {

    private double temperature;
    private List<Observer> observers = new ArrayList<>();

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

class Display implements Observer {
    private String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature) {
        System.out.println(name + " updated with temperature: " + temperature);
    }
}

public class Client {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Display d1 = new Display("Display 1");
        Display d2 = new Display("Display 2");

        station.addObserver(d1);
        station.addObserver(d2);

        station.setTemperature(23.5);
        station.removeObserver(d1);
        station.setTemperature(30.2);
    }
}
