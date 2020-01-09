package ua.epam.javacore.command;

public class DeleteCommand implements Command {

    private AutoСonfigurator autoСonfigurator;

    public DeleteCommand(AutoСonfigurator autoСonfigurator) {
        this.autoСonfigurator = autoСonfigurator;
    }

    @Override
    public void execute() {
        autoСonfigurator.deleteOption();
    }
}
