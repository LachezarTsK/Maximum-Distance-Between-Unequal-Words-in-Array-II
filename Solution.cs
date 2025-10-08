
using System;

public class Solution
{
    public int MaxDistance(string[] words)
    {
        int front = 0;
        int back = words.Length - 1;
        int maxDistanceBetweenUnequalWords = 0;

        while (front <= back)
        {
            if (!words[front].Equals(words[words.Length - 1]))
            {
                maxDistanceBetweenUnequalWords = words.Length - front;
                break;
            }
            if (!words[back].Equals(words[0]))
            {
                maxDistanceBetweenUnequalWords = back + 1;
                break;
            }
            ++front;
            --back;
        }

        return maxDistanceBetweenUnequalWords;
    }
}
