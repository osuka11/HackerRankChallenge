package main.kotlin

fun pangrams(s: String):String{
    val string = s.replace("\\s".toRegex(), "").toLowerCase().toSet()

    return if( string.size == 26) "pangram" else "not pangram"
}
fun main(args: Array<String>) {
    val s = readLine()!!

    val result = pangrams(s)

    println(result)
}