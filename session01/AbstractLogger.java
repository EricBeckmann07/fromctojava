public abstract class AbstractLogger {
    private String name;
    private int count;

    public AbstractLogger(String name) {
        this.name = name;
        this.count = 0;
    }
    // Jede Unterklasse muss diese Methode implementieren
    public abstract void writeLog(String message); // Gemeinsame Logik: null-Check + Zähler

    public void log(String message) {
        if (message == null) {
        System.err.println(name + ": null ignoriert");
        return;
    }
        count++;
        writeLog(message); // Aufruf der abstrakten Methode
    }
    
    public String getName() { return name; }
    public int getCount() { return count; }
}