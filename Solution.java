
public class Solution {

    public int maxDistance(String[] words) {
        int front = 0;
        int back = words.length - 1;
        int maxDistanceBetweenUnequalWords = 0;

        while (front <= back) {
            if (!words[front].equals(words[words.length - 1])) {
                maxDistanceBetweenUnequalWords = words.length - front;
                break;
            }
            if (!words[back].equals(words[0])) {
                maxDistanceBetweenUnequalWords = back + 1;
                break;
            }
            ++front;
            --back;
        }

        return maxDistanceBetweenUnequalWords;
    }
}
