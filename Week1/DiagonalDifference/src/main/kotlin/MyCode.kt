package main.kotlin

fun diagonalDifference(arr: Array<Array<Int>>): Int{
    var firstSum = 0
    var secondSum = 0
    for (row in arr.indices){
        firstSum += arr[row][row]

    }
    var counterAux = 0
    for (row in (0..arr.lastIndex).reversed()){
        secondSum += arr[row][counterAux]
        counterAux++
    }
    return Math.abs((secondSum - firstSum))
}
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}