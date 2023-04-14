//define longest word in the sentence
//create a separate function "findLongestWord" with input parameter "sentence" that will return longest word from this sentence

fun main() {
    val sentence = "It is estimated that you need to know at least 8,000-9,000 words in English in order to understand the majority of conversations in movies and TV shows."

    println(findLongestWord(sentence))
}

fun findLongestWord(sentence: String): String{
    var longestWord = ""
    val wordList = sentence.split(" ")

    for (word in wordList) {
        if (longestWord.length < word.length) {
            longestWord = word
        }
    }
    return longestWord
}