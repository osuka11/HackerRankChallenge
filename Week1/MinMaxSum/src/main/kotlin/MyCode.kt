package main.kotlin

fun minmaxSum(arr: Array<Int>){
    var minSum: Long = 0L
    var maxSum: Long = 0L
    arr.sort()
    if (arr.first() == arr.last()){
        println("${arr.sum() - arr[0]} ${arr.sum() - arr[0]}")

    }else{
        for (i in arr){
            if (i > arr.first()) maxSum+=i
            if (i < arr.last()) minSum+=i
        }
    }
    println("$minSum $maxSum")

}
fun main() {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    minmaxSum(arr)
}