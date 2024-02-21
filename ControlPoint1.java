

public class ControlPoint1 {

    public static int target(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }
        return nums.length;
    }

    public boolean check
    public static void main(String[] args){
//1)	Учитывая отсортированный массив различных целых чисел и целевое значение, верните индекс, если цель найдена.
// Если нет, верните индекс там, где он был бы, если бы он был вставлен по порядку.
        int[] nums = { 1, 3, 5, 6};
        System.out.println(target( nums, 5));
        System.out.println(target( nums, 2));
        System.out.println(target( nums, 7));

// 2)	Написать код, который выводит числа от 0 до 1000, которые делятся на 3, но не делятся на 5, и сумма цифр в которых меньше десяти.






// 3)	Напишите метод для поиска самой длинной строки общего префикса среди массива строк. Если общего префикса нет, верните пустую строку "".
    }
}
