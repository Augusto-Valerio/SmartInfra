package models.sensor;

public class SensorData {
    private double temperature;
    private double humidity;
    private double oxygen;
    private double luminosity;
    private double waterLevel;

    public SensorData(double temperature, double humidity, double oxygen, double luminosity, double waterLevel) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.oxygen = oxygen;
        this.luminosity = luminosity;
        this.waterLevel = waterLevel;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getOxygen() {
        return oxygen;
    }

    public void setOxygen(double oxygen) {
        this.oxygen = oxygen;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }
}
