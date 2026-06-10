import java.io.FileWriter;
import java.io.Writer;
import java.io.BufferedWriter;

public class CSVReader implements SensorDataHandler {
    private String datei;

    public CSVReader(String datei) throws Exception{
        this.datei = datei;
        Writer fw = new FileWriter(this.datei);
        BufferedWriter bw = new BufferedWriter(fw);
    }

    @Override
    public void handle(SensorReading2 reading) {
        if (reading == null) {
            System.out.println("Reading ist NULL!");
        }
        else {
            try {
            fw.write(reading.getseq() + "," + reading.getstation_id() + "," + reading.gettemperature() + "," + reading.gethumidity() + "\n");
            fw.close();
            }
            catch (Exception e) {
                System.out.println("Fehler: " + e);
            }
        }
    }

    @Override
    public void close() {

    }
}