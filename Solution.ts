
function maxDistance(words: string[]): number {
    let front = 0;
    let back = words.length - 1;
    let maxDistanceBetweenUnequalWords = 0;

    while (front <= back) {
        if (words[front] !== (words[words.length - 1])) {
            maxDistanceBetweenUnequalWords = words.length - front;
            break;
        }
        if (words[back] !== (words[0])) {
            maxDistanceBetweenUnequalWords = back + 1;
            break;
        }
        ++front;
        --back;
    }

    return maxDistanceBetweenUnequalWords;
};
