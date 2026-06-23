package Array.Easy;

public class SumOfLongestString {
    public static void main(String args[]){
        int a[] = {1,2,3,1,1,1,3,3,2,1};
        int Max = 6;
        int j = 0;
        int sum = 0;
        int l = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum >= Max) {
                if (sum == Max) {
                    l = Math.max(i - j + 1, l);
                }
                sum = sum - a[j];
                j++;
            }
        }
        System.out.println(l);
    }
}
