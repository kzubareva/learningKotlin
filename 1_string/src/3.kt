//Find the number of occurrences of 'aba' in the string "ababaabababa"

fun main() {
    val inputString = "ababaabababa"
    val subString = "labab"
    var count = 0

    for (i in 0 until inputString.length-(subString.length-1)) {
        if (subString == inputString.substring(i, i + subString.length)){
            count++
        }
    }
    println(count)
}