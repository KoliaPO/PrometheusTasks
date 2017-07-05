package Week5.Task;

public class DateCommand implements Command {
    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());

    }
}
