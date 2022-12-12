package classes;

import java.time.LocalDateTime;

public class Logger {
    protected int num = 1;

    private static Logger instance = null;

    private Logger() {
        this.num = 0;
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void log(String msg) {
        System.out.println(LocalDateTime.now() + "[" + num++ + "] " + msg);
    }
}
