package Week2.Tasks;

/**
 * Напишіть застосування для сортування масиву методом бульбашки

 */
public class Task3 {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for(int i = 0;i < length;i++) {
            for(int j = i+1;j < length;j++){
                if(array[i] > array[j]){
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }

        for (int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
