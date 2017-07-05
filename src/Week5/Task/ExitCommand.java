package Week5.Task;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Goodbye!");
    }
}
