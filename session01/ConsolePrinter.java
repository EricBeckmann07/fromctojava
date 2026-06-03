public class ConsolePrinter implements SensorDataHandler {
    private String ausgabe;

    public ConsolePrinter (String ausgabe) {
        this.ausgabe = ausgabe;
    }

    @Override
    public void handle(SensorReading2 reading) {
        if (reading == null) {
            this.ausgabe = "Keine Daten Vorhanden scheiße man!!!";
        }
        this.ausgabe = "Seq: " + reading.getseq() + "| Station ID: "+ reading.getstation_id() + "| Temperatur: " + reading.gettemperature() + "| Humidity: " + reading.gethumidity();
    }
    
    @Override
    public void close() {
        System.out.println(ausgabe);
    }
}