//сортировка пузырьком

fun main() {
    val array: IntArray = intArrayOf(64, 34, 25, 12, 22, 11, 90)

    sort(array)

    for (i in array){
        print("$i ")
    }
}

fun sort(array: IntArray) {
    for (i in 0 until array.size-1)
        for (j in 0 until array.size-1)
            if (array[j] > array[j+1]){
                val saveNumber = array[j]
                array[j] = array[j+1]
                array[j+1] = saveNumber
            }
}