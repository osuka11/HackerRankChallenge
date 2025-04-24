package main.kotlin


fun maxMin(k: Int, arr: Array<Int>): Int {
    val mList = arr.toList().sorted()
    var min = Int.MAX_VALUE

    println("min: $min")
    for (i in 0..mList.size - k) {
        val a = mList[i + (k - 1)] - mList[i]
        if (min > a) min = a
    }
    return min

}

fun main(args: Array<String>) {
    /*
    val n = readLine()!!.trim().toInt()

    val k = readLine()!!.trim().toInt()

    val arr = Array<Int>(n, { 0 })
    for (i in 0 until n) {
        val arrItem = readLine()!!.trim().toInt()
        arr[i] = arrItem
    }

     */
    val arr = arrayOf(4504, 1520, 5857, 4094, 4157, 3902, 822, 6643, 2422, 7288, 8245, 9948, 2822, 1784, 7802, 3142, 9739, 5629, 5413, 7232)

    val result = maxMin(5, arr)

    println(result)
}