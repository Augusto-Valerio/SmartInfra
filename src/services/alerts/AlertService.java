package services.alerts;

import models.dome.Dome;
import models.sensor.SensorData;

import java.util.ArrayList;
import java.util.List;

public class AlertService {
    public static List<String> verifyAlerts(List<Dome> domes) {
        List<String> alerts = new ArrayList<>();

        for (Dome dome : domes) {
            if (dome.getSensorDataList().isEmpty()) {
                alerts.add("----------------------------------------");
                alerts.add("Cúpula: " + dome.getName());
                alerts.add("Nenhum dado de sensor foi gerado para verificar alertas.");
            } else {
                for (int i = 0; i < dome.getSensorDataList().size(); i++) {
                    SensorData sensorData = dome.getSensorDataList().get(i);

                    AlertVerifier.verifySensorData(alerts, dome, sensorData, i);
                }
            }
        }
        if (alerts.isEmpty()) {
            alerts.add("Nenhum alerta identificado");
        }

        return alerts;
    }


}
