public class TimestampLogger extends AbstractLogger {
    public TimestampLogger (String name) {
        super(name);
    }

    @Override
    public void log (String message) {
        if (message == null) {
            super.log(null);
            return;
        }
        String stamped = "[t=" + System.currentTimeMillis() + "] " + message;
        super.log(stamped);
    }

    @Override
    public void writeLog(String message) {
        System.out.println(message);
    }

}