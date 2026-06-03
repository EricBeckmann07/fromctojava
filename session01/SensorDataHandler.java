public interface SensorDataHandler {
    void handle(SensorReading2 reading);

    void close();
}
