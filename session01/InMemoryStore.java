import java.util.ArrayList;
import java.util.List;

public class InMemoryStore implements SensorDataHandler {
    private List<SensorReading> readings = new ArrayList<>();

    @Override
    public void handle(SensorReading reading) {
        readings.add(reading);
    }

    @Override
    public void close() {
        SensorReading firstElement = readings.get(0);
        double maxTemp = firstElement.getTemperatureC();
        double minTemp = firstElement.getTemperatureC();

        for (int i=1; i<readings.size(); i++){
            SensorReading element = readings.get(i);
            double temperature = element.getTemperatureC();
            if (temperature > maxTemp){
                maxTemp = temperature;

            }
            if (temperature < minTemp){
                minTemp = temperature;
            }
        }

        // Zusammenfassung ausgeben:
        // wie viele Readings, min/max Temperatur
        System.out.println("Zusammenfassung der Daten");
        System.out.println("Max Temperatur: " + maxTemp);
        System.out.println("Min Temperatur: " + minTemp);
    }
}
