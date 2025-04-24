package main.kotlin

fun pangramsOptimized(s: String) = if (s.toLowerCase()
        .filterNot { it == ' ' }
        .groupBy { it }
        .count() == 26)  "pangram" else "not"

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = pangramsOptimized(s)

    println(result)
}