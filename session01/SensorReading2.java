public class SensorReading2 implements Describable {
    private int seq;
    private String station_id;
    private double temperature;
    private float humidity;

    public SensorReading2 (int seq, String station_id, double temperature, float humidity) {
        this.seq = seq;

        if (station_id == null) {
            System.err.println("Station ID ist leer");
            this.station_id = "Unbekannt";
        } else {
            this.station_id = station_id;
        }

        if (temperature < -273.15) {
            System.err.println("Ungültige Temperatur: " + temperature);
            this.temperature = -273.15;
        } else{
            this.temperature = temperature;
        }

        if (humidity < 0 || humidity > 100) {
            System.out.println("Ungültige Humidity: "+ humidity);
            this.humidity = -1;
        } else {
            this.humidity = humidity;
        }
    }

    //Getter

    public int getseq() {return this.seq;}
    public String getstation_id() {return this.station_id;}
    public double gettemperature() {return this.temperature;}
    public float gethumidity() {return this.humidity;}

    //Setter

    public void settimestamp(int seq) {
        this.seq = seq;
    }

    public void setstation_id(String station_id) {
        this.station_id = station_id;
    }

    public void settemperature(double temperature) {
        this.temperature = temperature;
    }

    public void sethumidity(float humidity) {
        this.humidity = humidity;
    }

    public double gettemperatureF() {
        return this.temperature * 9 / 5 + 32;
    }

    @Override
    public String describe() {
        return "Reading " + seq + ": " + temperature + "°C @ " + station_id;
    }


    public void print() {
        System.out.println("Seq: " + this.seq + " | Station ID: " + this.station_id + " | Temperatur: " + this.temperature + " | Humidity: " + this.humidity);
    }
}