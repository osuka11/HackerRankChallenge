package main.kotlin

fun plusMinusOptimized(arr:Array<Int>){
    val zeros: Float = arr.filter { z -> z == 0  }.size.toFloat()
    val positives:Float = arr.filter { z -> z in 1..1000 }.size.toFloat()
    val negatives:Float = arr.filter { z -> z in -1000 .. -1  }.size.toFloat()

    println(String.format("%.6f", positives/arr.size))
    println(String.format("%.6f", negatives/arr.size))
    println(String.format("%.6f", zeros/arr.size))

}

fun main(args: Array<String>) {

}