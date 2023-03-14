package Java_sem_2.java_hw_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

public class hw_task_1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(hw_task_1.class.getName());
        FileHandler fh = new FileHandler("log_hw_2_task1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int [] nums = {6, 0, 1, 5, 11, 28, 4, 15, 2, 3, 100};
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i] > nums[i+1]){
                    isSorted = false;

                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    logger.log(Level.INFO, "Резултат итерации: \n" + "temp = " + temp + "\n" + "nums[i] = " + nums[i] + "\n" + "nums[i+1] = " + nums[i+1]);
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(nums));
    }


}

