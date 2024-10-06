package main.kotlin


fun diagonalDifferenceOptimized(arr: Array<Array<Int>>): Int {
    /*
    var (diag1, diag2, c ) = arrayOf(0,0,arr.lastIndex)  <- Forma de declarar multiples variables en una sola línea
     */

    var firstSum = 0
    var secondSum = 0
    for (i in arr.indices){
        firstSum += arr[i][i]
        secondSum += arr[i][arr.lastIndex - i]  //De izquierda a derecha
        //  secondSum += arr[((arr.size - 1)-i)][i] // De derecha a izquierda
    }
    return Math.abs( (firstSum-secondSum))
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