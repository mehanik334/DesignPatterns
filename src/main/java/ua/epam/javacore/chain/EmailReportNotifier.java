package ua.epam.javacore.chain;

public class EmailReportNotifier extends Notifier {

    public EmailReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Send email " + message);
    }
}
