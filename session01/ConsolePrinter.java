public class ConsolePrinter implements SensorDataHandler {

    @Override
    public void handle(SensorReading2 reading) {
        if (reading == null) {
            System.out.println("Keine Daten Vorhanden scheiße man!!!");
            return;
        }
        System.out.println("Seq: " + reading.getseq() + "| Station ID: "+ reading.getstation_id() + "| Temperatur: " + reading.gettemperature() + "| Humidity: " + reading.gethumidity());
    }
    
    @Override
    public void close() {
    }
}