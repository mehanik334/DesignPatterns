package ua.epam.javacore.chain;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier use simple report " + message);
    }
}
