import java.io.FileWriter;
import java.io.Writer;
import java.io.BufferedWriter;

public class CSVReader implements SensorDataHandler {
    private String datei;
    private BufferedWriter bw;
    private Writer fw;

    public CSVReader(String datei) throws Exception{
        this.datei = datei;
        this.fw = new FileWriter(this.datei);
        this.bw = new BufferedWriter(fw);
    }

    @Override
    public void handle(SensorReading2 reading) {
        if (reading == null) {
            System.out.println("Reading ist NULL!");
        }
        else {
            try {
                bw.write(reading.getseq() + "," + reading.getstation_id() + "," + reading.gettemperature() + "," + reading.gethumidity() + "\n");
            }
            catch (Exception e) {
                System.out.println("Fehler: " + e);
            }
        }
    }

    @Override
    public void close() {
        try {
            bw.close();
        } catch (Exception e) {
            System.out.println("Fehler beim Schließen: " + e);
        }
    }
}