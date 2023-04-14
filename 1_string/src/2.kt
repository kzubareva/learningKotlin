//You need to print the last n characters from a string in kotlin "Hello, World!"

fun main() {
    val inputString = "Hello, World"
    val n = 5

  println(inputString.substring(0,n))
  println(inputString.substring(inputString.length-n, inputString.length))
}