package repositories;

import models.dome.Dome;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

//salva no json.
public class DomeRepository {


    public static void saveAll(List<Dome> domes) {
        try {
            FileWriter writer = new FileWriter("src/data/domes.json");

            writer.write("[\n");

            for (int i = 0; i < domes.size(); i++) {
                Dome dome = domes.get(i);

                writer.write(domeToJson(dome));

                if (i < domes.size() - 1) {
                    writer.write(",");
                }

                writer.write("\n");
            }

            writer.write("]");
            writer.close();
        } catch (IOException error) {
            System.out.println("Erro ao salvar o arquivo domes.json");
        }
    }

    private static String domeToJson(Dome dome) {
        return "  {\n" +
                "    \"nome\": \"" + dome.getName() + "\",\n" +
                "    \"cultivo\": \"" + dome.getCultivo() + "\",\n" +
                "    \"capacidade\": " + dome.getCapacidade() + ",\n" +
                SensorRepository.sensorListToJson(dome.getSensorDataList()) + "\n" +
                "  }";
    }
}
