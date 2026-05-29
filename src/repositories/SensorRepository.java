package repositories;

import models.sensor.SensorData;

import java.util.List;

public class SensorRepository {
    public static String sensorListToJson(List<SensorData> sensorDataList) {
        String json = "    \"sensores\": [\n";

        for (int i = 0; i < sensorDataList.size(); i++) {
            SensorData sensor = sensorDataList.get(i);

            json += "      {\n" +
                    "        \"temperatura\": " + sensor.getTemperature() + ",\n" +
                    "        \"umidade\": " + sensor.getHumidity() + ",\n" +
                    "        \"oxigenio\": " + sensor.getOxygen() + ",\n" +
                    "        \"luminosidade\": " + sensor.getLuminosity() + ",\n" +
                    "        \"nivelAgua\": " + sensor.getWaterLevel() + "\n" +
                    "      }";

            if (i < sensorDataList.size() - 1) {
                json += ",";
            }

            json += "\n";
        }

        json += "    ]";

        return json;
    }
}
