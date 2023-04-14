//Удалить в строке все цифры.

fun main() {
    val inputString = "2kke930jflsi330-4kldl93;l ekle0-=9"
    var newString = ""

    for (i in 0 until inputString.length) {
        if (!inputString[i].isDigit()){
            newString += inputString[i]
        }
    }
    println(newString)
}