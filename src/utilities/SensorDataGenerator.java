package utilities;

import models.sensor.SensorData;

import java.util.Random;

public class SensorDataGenerator {
    private static final Random random = new Random();

    private static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static SensorData generate() {
        double temperature = round(18 + random.nextDouble() * 12);
        double humidity = round(45 + random.nextDouble() * 40);
        double oxygen = round(18 + random.nextDouble() * 5);
        double luminosity = round(40 + random.nextDouble() * 60);
        double waterLevel = round(30 + random.nextDouble() * 70);

        return new SensorData(temperature, humidity, oxygen, luminosity, waterLevel);
    }
}
