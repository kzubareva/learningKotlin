//Напишите функцию, которая принимает на вход строку, а возвращает эту строку «задом наперед»

fun main() {
    val  inputString = "лес"
    print(reverseString(inputString))
}

fun reverseString(inputString: String): String{
    var resultString = ""
    for (i in 0 until inputString.length){
        resultString += inputString[inputString.length-1-i]
    }
    return resultString
}

//ИЛИ
//
////Напишите функцию, которая принимает на вход строку, а возвращает эту строку «задом наперед»
//
//fun main() {
//    val  inputString = "лес"
//    print(reverseString(inputString))
//}
//
//fun reverseString(inputString: String): String{
//    var resultString = ""
//    for (i in inputString.length-1 downTo 0){
//        resultString += inputString[i]
//    }
//    return resultString
//}