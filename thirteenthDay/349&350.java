class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        // Sort the arrays (optional if already sorted) not mandatory to add
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < nums1.length && j < nums2.length) {
            int num1 = nums1[i];
            int num2 = nums2[j];

            if (num1 < num2) {
                i++;
            } else if (num1 > num2) {
                j++;
            } else {
                // Found an intersection
                result.add(num1);

                // Move both pointers to skip duplicates
                while (i < nums1.length && nums1[i] == num1) {
                    i++;
                }
                while (j < nums2.length && nums2[j] == num2) {
                    j++;
                }
            }
        }

        // Convert the result list to an array
        int[] intersection = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            intersection[k] = result.get(k);
        }

        return intersection;
    }
}
