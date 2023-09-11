public class Multiples {
    public static void main(String[] args) {
        int nums3 = 0;
        int nums5 = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 5 == 0) {
                nums5++;
            } else if (i % 3 == 0) {
                nums3++;
            }
        }
        System.out.println(nums3 + " 3s\n" +
                nums5+" 5s");
    }
}
