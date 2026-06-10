import java.util.ArrayList;
import java.util.List;

public class InMemoryStore implements SensorDataHandler {
    private List<SensorReading2> readings = new ArrayList<>();

    @Override
    public void handle(SensorReading2 reading) {
        readings.add(reading);
    }

    @Override
    public void close() {
        SensorReading2 firstElement = readings.get(0);
        double maxTemp = firstElement.gettemperature();
        double minTemp = firstElement.gettemperature();

        for (int i=1; i<readings.size(); i++){
            SensorReading2 element = readings.get(i);
            double temperature = element.gettemperature();
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
