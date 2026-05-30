package services.alerts;

import models.dome.Dome;
import models.sensor.SensorData;

import java.util.List;

public class AlertVerifier {
    public static void verifySensorData(List<String> alerts, Dome dome, SensorData sensorData, int index) {
        verifyTemperature(alerts, dome, sensorData, index);
        verifyHumidity(alerts, dome, sensorData, index);
        verifyOxygen(alerts, dome, sensorData, index);
        verifyLuminosity(alerts, dome, sensorData, index);
        verifyWaterLevel(alerts, dome, sensorData, index);
    }

    private static void addAlert(List<String> alerts, Dome dome, SensorData sensorData, int index, String message) {
        alerts.add("----------------------------------------");
        alerts.add("Cúpula: " + dome.getName());
        alerts.add("Registro de sensor: " + (index + 1) + " | Data: " + sensorData.getCreatedAt());
        alerts.add(message);
    }

    private static void verifyTemperature(List<String> alerts, Dome dome, SensorData sensorData, int index) {
        if (sensorData.getTemperature() < 18) {
            addAlert(alerts, dome, sensorData, index, "Temperatura baixa: " + sensorData.getTemperature() + " C");
        }

        if (sensorData.getTemperature() > 30) {
            addAlert(alerts, dome, sensorData, index, "Temperatura alta: " + sensorData.getTemperature() + " C");
        }
    }

    private static void verifyHumidity(List<String> alerts, Dome dome, SensorData sensorData, int index) {
        if (sensorData.getHumidity() < 45) {
            addAlert(alerts, dome, sensorData, index, "Umidade baixa: " + sensorData.getHumidity() + "%");
        }

        if (sensorData.getHumidity() > 85) {
            addAlert(alerts, dome, sensorData, index, "Umidade alta: " + sensorData.getHumidity() + "%");
        }
    }

    private static void verifyOxygen(List<String> alerts, Dome dome, SensorData sensorData, int index) {
        if (sensorData.getOxygen() < 19) {
            addAlert(alerts, dome, sensorData, index, "Oxigenio baixo: " + sensorData.getOxygen() + "%");
        }
    }

    private static void verifyLuminosity(List<String> alerts, Dome dome, SensorData sensorData, int index) {
        if (sensorData.getLuminosity() < 50) {
            addAlert(alerts, dome, sensorData, index, "Luminosidade baixa: " + sensorData.getLuminosity() + "%");
        }
    }

    private static void verifyWaterLevel(List<String> alerts, Dome dome, SensorData sensorData, int index) {
        if (sensorData.getWaterLevel() < 35) {
            addAlert(alerts, dome, sensorData, index, "Nível de água baixo: " + sensorData.getWaterLevel() + "%");
        }
    }
}
