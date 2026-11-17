class Solution {
    public int sumOfEncryptedInt(int[] nums) {
int sum = 0;

        for (int num : nums) {
            int max = 0;
            int count = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                max = Math.max(max, digit);
                count++;
                temp /= 10;
            }

            int encrypted = 0;

            for (int i = 0; i < count; i++) {
                encrypted = encrypted * 10 + max;
            }

            sum += encrypted;
        }

        return sum;
        
    }
}