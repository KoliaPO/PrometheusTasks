package Week5.Task;

/**
 *
 * Створіть застосування, що реалізуватиме патерн Команда
 * для підтримки наступних команд:
 * help
 * Виводить на екран рядок Help executed
 * echo <text>
 * Виводить на екран рядок вказаний як текст <text>
 * Наприклад
 * echo "Hello World"
 * виведе на екран
 * Hello World
 * date now
 * Виводить на екран поточну дату в мілісекундах починаючи з 1 січня 1970 року. Для виводу дати скористайтеся рядком
 * System.out.println(System.currentTimeMillis());
 * exit
 * Виводить на екран Goodbye!
 * Кожна з реалізацій це окремий клас!


 */

public class MainCommand {

    public static void main(String[] args) {
        HelpCommand help = new HelpCommand();
        EchoCommand echo = new EchoCommand();
        DateCommand date = new DateCommand();
        ExitCommand exit = new ExitCommand();

        args = new String[]{"help"};
        try {
            if (args.length > 0) {
                if (args[0].equals("help") && args.length < 2) {
                    help.execute();
                }
                else if (args[0].equals("echo")  && args.length < 3) {
                    echo.text = args[1];
                    echo.execute();
                }
                else if (args[0].equals("date") && args[1].equals("now") && args.length < 3){
                    date.execute();
                }
                else if (args[0].equals("exit") && args.length < 2){
                    exit.execute();

                }else { System.out.println("Error");}

            }else { System.out.println("Error");}

        }catch (NullPointerException e){ System.out.println("Error"); }



    }
}
