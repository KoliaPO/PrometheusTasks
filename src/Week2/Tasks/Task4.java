package Week2.Tasks;

/**
 * Напишіть застосування для сортування масиву методом сортування Шелла (ShellSort). Завдання додаткове! (без оцінювання)
 */
public class Task4 {
    public static void main(String[] args) {

    int[] array = {30, 2, 10, 4, 6};
    int length = array.length;
    int j;
    for (int step = length / 2; step > 0; step /= 2){
        for (int i = step; i < length; i++)
        {
            int t = array[i];
            for (j = i; j >= step; j -= step)
            {
                if (t < array[j - step])
                    array[j] = array[j - step];
                else
                    break;
            }
            array[j] = t;
        }
    }
		for (int i = 0; i < length; i++) {
        System.out.print(array[i] + " ");
    }
}
}
