package pid.exercise.sort;

public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index])
                    index = j;
            }

            int lowerNum = array[index];
            array[index] = array[i];
            array[i] = lowerNum;
        }
    }

}
