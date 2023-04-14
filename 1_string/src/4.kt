//define longest word in the sentence
//It is estimated that you need to know at least 8,000-9,000 words in English in order to understand
//the majority of conversations in movies and TV shows.

fun main() {
    val sentence = "It is estimated that you need to know at least 8,000-9,000 words in English in order to understand the majority of conversations in movies and TV shows."
    var longestWord = ""

    val wordList = sentence.split(" ")

    for (word in wordList) {
        if (longestWord.length < word.length) {
            longestWord = word
        }
    }
    println(longestWord)
}