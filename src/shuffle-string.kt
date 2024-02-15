fun main() {
    restoreString(s = "codeleet", indices = intArrayOf(4, 5, 6, 7, 0, 2, 1, 3))
}


fun restoreString(s: String, indices: IntArray): String {
    val array = s.toList().toCharArray()
    val sa = s.toList().toCharArray()

    for (k in sa.indices) {
        array[indices[k]] = sa[k]
    }

    return String(array)
}
