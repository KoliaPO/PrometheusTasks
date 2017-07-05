package Week2.Tasks;

/**
 * Напишіть застосування, що виконує пошук заданого числа у відсортованому масиві — бінарний пошук
 * У випадку коли число знайдено виведіть на екран його позицію в масиві (позиції нумеруємо з нуля) або -1 в іншому випадку
 */
public class Task5 {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int pos = -1;
        int low = 0;
        int hight = data.length - 1;
        int mid;
        while(low <= hight){

            mid = (low + hight) / 2;
            if(data[mid] == numberToFind)
            {
                pos = mid;
            }

            if(numberToFind > data[mid])
            {
                low = mid + 1;
            }else{
                hight = mid - 1;
            }
        }

        System.out.println(pos);
   }
}
