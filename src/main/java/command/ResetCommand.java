package command;

public class ResetCommand implements Command {
    Computer comp;

    public ResetCommand(Computer comp) {
        this.comp = comp;
    }

    public void execute() {
        comp.reset();
    }
}
