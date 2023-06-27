class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != element2) {

                count1 = 1;
                element1 = nums[i];

            } else if (count2 == 0 && nums[i] != element1) {

                count2 = 1;
                element2 = nums[i];

            } else if (nums[i] == element1) {

                count1 += 1;

            } else if (nums[i] == element2) {

                count2 += 1;

            } else {

                count1--;
                count2--;

            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == element1) {
                count1 += 1;
            }
            if (num == element2) {
                count2 += 1;
            }
        }

        if (count1 > n / 3) {
            list.add(element1);
        }

        if (count2 > n / 3) {
            list.add(element2);
        }

        return list;
    }
}