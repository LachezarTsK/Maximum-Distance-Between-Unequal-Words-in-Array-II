
package main

func maxDistance(words []string) int {
    front := 0
    back := len(words) - 1
    maxDistanceBetweenUnequalWords := 0

    for front <= back {
        if words[front] != (words[len(words) - 1]) {
            maxDistanceBetweenUnequalWords = len(words) - front
            break
        }
        if words[back] != (words[0]) {
            maxDistanceBetweenUnequalWords = back + 1
            break
        }
        front++
        back--
    }

    return maxDistanceBetweenUnequalWords
}
