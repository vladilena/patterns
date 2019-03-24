package command;

class Main {
    public static void main(String[] args) {
Computer comp = new Computer();
User user = new User(new StartCommand(comp),new StopCommand(comp), new ResetCommand(comp));
    user.startComputer();
    user.stopComputer();
    user.resetComputer();
    }

}
