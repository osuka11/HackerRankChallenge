package main.kotlin

fun plusMinus(arr:Array<Int>){
    var zeros: Float = 0.0f
    var positives: Float = 0.0f
    var negatives: Float = 0.0f

    for (i in arr){
        when(i){
            0->zeros++
            in -1000 .. -1 -> negatives++
            in 1 .. 1000 ->positives++

        }
    }
    println(String.format("%.6f",positives/arr.size))
    println(String.format("%.6f",negatives/arr.size))
    println(String.format("%.6f",zeros/arr.size))
}
fun main(args: Array<String>){
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}