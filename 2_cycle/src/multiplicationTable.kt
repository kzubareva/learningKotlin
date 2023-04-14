//Using Kotlin display multiplication table from 1 to 10

fun main() {

    for (i in 1..10) {
        for (k in 1..10){
            print("$i*$k=${i*k}\t")
        }
        println ()
    }
}