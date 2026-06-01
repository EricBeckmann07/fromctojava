public class SensorReading2 {
    public String timestamp;
    public String station_id;
    public double temperature;
    public float humidity;

    public SensorReading2 (String timestamp, String station_id, double temperature, float humidity) {
        this.timestamp = timestamp;

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

    public void print() {
        System.out.println("Timestamp: " + this.timestamp + " | Station ID: " + this.station_id + " | Temperatur: " + this.temperature + " | Humidity: " + this.humidity);
    }
}