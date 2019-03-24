package command;

public class StopCommand implements Command {
    Computer comp;

    public StopCommand(Computer comp) {
        this.comp = comp;
    }

    public void execute() {
        comp.stop();
    }
}
