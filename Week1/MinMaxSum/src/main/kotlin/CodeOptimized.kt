package main.kotlin

fun minMaxSumOptimized(arr:Array<Int>){
    arr.sort()
    val longArr: Array<Long> = arr.map { it -> it.toLong() }.toTypedArray()

    val minSum:Long  = (longArr.sum() - arr.last()).toLong()
    val maxSum:Long  = (longArr.sum() - arr.first()).toLong()
    println("$minSum $maxSum")
}