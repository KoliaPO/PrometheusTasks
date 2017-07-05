package Week5.Task;

public class EchoCommand implements Command {
    public String text;
    @Override
    public void execute() {
        System.out.println(text);
    }
}
