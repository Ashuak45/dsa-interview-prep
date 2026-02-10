class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                right = mid - 1;   // try to find smaller valid character
            } else {
                left = mid + 1;
            }
        }

        // If left is within bounds, return letters[left]
        // Otherwise wrap around and return letters[0]
        return letters[left % letters.length];
    }
}
