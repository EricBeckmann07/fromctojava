public class Hello { 
    public static void main(String[] args) { 
        System.out.println("Hallo, Java!"); 
        int zahl = 42; 
        System.out.println("Die Zahl ist: " + zahl); 
        double temp = 19.3; 
        System.out.println("Temperatur: " + temp); 
        System.err.println("Temperatur: " + temp);
        SensorReading reading = new SensorReading(1, "S1", 19.3, 64.2);
        System.out.println("Konstruktor: " + reading.getTemperatureC());
        reading.temperatureC = -999.0; // ← diese Zeile hinzufügen
        System.out.println("Danach: " + reading.temperatureC);
    } 
} 