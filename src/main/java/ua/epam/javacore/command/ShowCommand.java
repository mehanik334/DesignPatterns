package ua.epam.javacore.command;

public class ShowCommand implements Command {

    private AutoСonfigurator autoСonfigurator;

    public ShowCommand(AutoСonfigurator autoСonfigurator) {
        this.autoСonfigurator = autoСonfigurator;
    }

    @Override
    public void execute() {
        autoСonfigurator.showOption();
    }
}
