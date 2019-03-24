package command;

class StartCommand implements Command {
    Computer comp;

    public StartCommand(Computer comp) {
        this.comp = comp;
    }

    public void execute() {
        comp.start();
    }
//Concrete command


}
