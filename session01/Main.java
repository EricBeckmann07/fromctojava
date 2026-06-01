public class Main {
    public static void main(String[] args) {
        SensorReading2 r1 = new SensorReading2("2026-06-01", "S1", 18.3, 30.5f);
        r1.print();

        SensorReading2 r2 = new SensorReading2("2026-05-01", "S2", -300.2, 35.5f);
        r2.print();

        SensorReading2 r3 = new SensorReading2("2026-06-01", null, 18.3, 30.5f);
        r3.print();

        SensorReading2 r4 = new SensorReading2("2026-05-01", "S2", 30.3, 105.5f);
        r4.print();

        SensorReading2 r5 = new SensorReading2("2026-05-01", null, -300.3, 105.5f);
        r5.print();
    }
}