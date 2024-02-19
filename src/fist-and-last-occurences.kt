package src
fun main() {
    solution("abbaa")
}
fun solution(s: String): Int {
    val list = mutableListOf<String>()

    list.add(s)
    val iterations = s.length - 1
    var array = s.toCharArray()
    var count = 0
    var result = 0

    while (count < iterations) {
        val start = array.sliceArray(0 until 1)
        val end = array.sliceArray(1 until array.size)
        //nimetumia spread operator to combine two char arrays
        val combined = charArrayOf(*end, *start)
        array = combined
        list.add(String(combined))
        count++
    }
    val test = list.toTypedArray()
    for (i in test.indices) {
        val size = test[i].length
        val first = test[i][0]
        val last = test[i][size - 1]

        if (first == last) {
            result++
        }
    }
    return result
}