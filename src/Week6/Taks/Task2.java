package Week6.Taks;

/**
 * Створіть застосування, що буде декодувати рядки отримані в завданні з кодуванням рядків. Наприклад:

 * Hh9h4e4l2o5

 * Потрібно перетворити на:

 * Hhhhhhhhhhhhhheeeellooooo

 * Дані для декодування будуть надходити як аргументи командного рядка (лише один рядок). Зверніть увагу на перевірку вхідних даних: на вході НЕ може бути null але може бути пустий рядок. У випадку пустого рядку на вході Ваше застосування повинно вивести на екран пустий рядок. Також на вході можуть бути завідомо некоректні рядки. Наприклад:

 * Hh90helo

 * В даному випадку кількість повторів 90, що не допустимо за умовами задачі кодування. В такому випадку виведіть на екран порожній рядок.
 * В кодованому рядку не повинно бути символів, що повторюються. Наприклад

 * Hhhhhhhhhhhhhheeeellooooo

 *  В такому випадку виведіть пустий рядок
 */

public class Task2 {

    public static void main( String[] args )
    {
        if (args[0] == "" || args[0] == null) System.out.println("");
        else {
            char[] stArr = args[0].toCharArray();
            char lastseen = 0;
            int c = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < stArr.length; i++) {
                if (i + 1 < stArr.length && Character.isDigit(stArr[i]) && Character.isDigit(stArr[i + 1])) {
                    sb.delete(0, i);
                    sb.append("");
                    break;
                }
                else if (i < 1 && Character.isDigit(stArr[i]))
                {
                    sb.append("");
                    break;
                }
                else if (i + 1 < stArr.length && stArr[i] == stArr[i + 1]){
                    sb.delete(0, i);
                    sb.append("");
                    break;
                }
                else if (!Character.isDigit(stArr[i])) {
                    lastseen = stArr[i];
                    sb.append(stArr[i]);
                } else {
                    int n = Integer.parseInt(String.valueOf(stArr[i]));
                    if (n > 9) {
                        System.out.println("");
                        break;

                    } else {
                        for (int j = 1; j < n; j++) {
                            sb.append(lastseen);
                        }
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
