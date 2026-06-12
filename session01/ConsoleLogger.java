public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(String name) {
        super(name); // Pflicht: Basisklassen-Konstruktor zuerst
    }
    
    @Override
    public void writeLog(String message) {
        System.out.println("[" + getName() + "] " + message);
    }
}
