//дана строка нужно определить что она палиндром

fun main() {
    val  inputString = "арозаупаланалапуазора"

    if (isPolindrom(inputString)){
        println("This is a palindrom")
    } else {
        println("This isn't a palindrom")
    }
}

fun isPolindrom(inputString: String): Boolean{
    for (i in 0 until inputString.length/2){
        if (inputString[i] != inputString[inputString.length-1-i]) {
            return false
        }
    }
    return true
}