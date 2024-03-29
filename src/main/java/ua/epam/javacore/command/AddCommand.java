package ua.epam.javacore.command;

public class AddCommand implements Command {

    private AutoСonfigurator autoСonfigurator;

    public AddCommand(AutoСonfigurator autoСonfigurator) {
        this.autoСonfigurator = autoСonfigurator;
    }

    @Override
    public void execute() {
        autoСonfigurator.addOption();
    }
}
