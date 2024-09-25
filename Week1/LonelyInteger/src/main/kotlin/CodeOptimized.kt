package main.kotlin

fun lonelyIntegerOptimized(a: Array<Int>): Int = a.filter{ v-> a.count{it == v}== 1}.get(0)
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyIntegerOptimized(a)

    println(result)
}