package Week2.Tasks;
/**      Завдання 1

       * (2/2 бали)
       * Створіть застосування що знаходить корені рівняння виду ax2 + bx + c = 0. Коефіцієнти задаються через змінні:
       *
       * double a;
       * double b;
       * double c;
       * Примітка: для обрахування квадратного кореня використовуйте конструкцію Math.sqrt(). Наприклад:
       *
       * double x = Math.sqrt(4);
       * після виконання х буде рівним 2
       *
       * Результат повинен мати наступний формат (за умови що корені, наприклад, 2 та 3):
       *
       * x1=2
       * x2=3
       * Якщо корінь один (наприклад 5)
       *
       * x1=5
       * x2=5
       *
       * Якщо корені відсутні
       *
       * x1=
       * x2=
 */

public class Task1 {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double D;
        double x1, x2;
        if(a == 0){
            if(b != 0){
                x1 = x2 = c / b;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
            else {
                System.out.println("x1=");
                System.out.println("x2=");
            }
        }
        else {
            D = b * b - 4 * a * c;
            if (D > 0) {
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);

            }
            else if (D == 0){
                x1 = -b / (2 * a);
                x2 = x1;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);

            }
            else if (D < 0) {
                System.out.println("x1=");
                System.out.println("x2=");
            }
        }
    }

}
