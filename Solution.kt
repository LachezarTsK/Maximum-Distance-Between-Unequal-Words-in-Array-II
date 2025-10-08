
class Solution {

    fun maxDistance(words: Array<String>): Int {
        var front = 0
        var back = words.size - 1
        var maxDistanceBetweenUnequalWords = 0

        while (front <= back) {
            if (words[front] != (words[words.size - 1])) {
                maxDistanceBetweenUnequalWords = words.size - front
                break
            }
            if (words[back] != (words[0])) {
                maxDistanceBetweenUnequalWords = back + 1
                break
            }
            ++front
            --back
        }

        return maxDistanceBetweenUnequalWords
    }
}
