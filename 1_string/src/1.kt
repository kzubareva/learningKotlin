//AAABBCCCCAAD -> 3A2B4C2A1D

fun main() {
    val startString = "AAABBCCCCAADEE"
    var endString = ""
    var count = 1
    var currentChar = startString[0]

    for (i in 1 until startString.length) {
        if (startString[i] == currentChar) {
            count++
        } else {
            endString += "$count$currentChar"
            count = 1
            currentChar = startString[i]
        }
    }
    endString += "$count$currentChar"
    println(endString)
}