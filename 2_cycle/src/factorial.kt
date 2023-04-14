//Using Kotlin write a function to calculate factorial

fun main() {
    val number = 0
    print(findFactorial(number))
}

fun findFactorial(number: Int): Int{
    var result = 1

    for (i in 1..number-1){
        result = result*(i+1)
        println ("$i $result")
    }
    return result
}

//ИЛИ
////Using Kotlin write a function to calculate factorial
//
//fun main() {
//    val number = 4
//    print(findFactorial(number))
//}
//
//fun findFactorial(number: Int): Int{
//    return if (number==0){
//        1
//    } else {
//        number * findFactorial(number-1)
//    }
//}