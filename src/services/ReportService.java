package services;

import models.dome.Dome;
import models.sensor.SensorData;

import java.util.ArrayList;
import java.util.List;

public class ReportService {
    public static List<String> generateEnvironmentalReport(List<Dome> domes) {
        List<String> report = new ArrayList<>();

        for (Dome dome : domes) {
            report.add("----------------------------------------");
            report.add("Cúpula: " + dome.getName());
            report.add("Cultivo: " + dome.getCultivo());
            report.add("Capacidade: " + dome.getCapacidade() + " plantas");

            if (dome.getSensorDataList().isEmpty()) {
                report.add("Nenhum dado de sensor gerado para esta cúpula.");
            } else {
                double temperatureSum = 0;
                double humiditySum = 0;
                double oxygenSum = 0;
                double luminositySum = 0;
                double waterLevelSum = 0;

                // calcula a média
                for (SensorData sensorData : dome.getSensorDataList()) {
                    temperatureSum += sensorData.getTemperature();
                    humiditySum += sensorData.getHumidity();
                    oxygenSum += sensorData.getOxygen();
                    luminositySum += sensorData.getLuminosity();
                    waterLevelSum += sensorData.getWaterLevel();
                }

                int totalRecords = dome.getSensorDataList().size();

                report.add("Registros analisados: " + totalRecords);
                report.add("Temperatura média: " + round(temperatureSum / totalRecords) + " C");
                report.add("Umidade média: " + round(humiditySum / totalRecords) + "%");
                report.add("Oxigênio médio: " + round(oxygenSum / totalRecords) + "%");
                report.add("Luminosidade média: " + round(luminositySum / totalRecords) + "%");
                report.add("Nível médio de água: " + round(waterLevelSum / totalRecords) + "%");
            }
        }

        return report;
    }

    private static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
