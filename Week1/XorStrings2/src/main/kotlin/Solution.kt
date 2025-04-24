package main.kotlin

fun main() {

    val s1 = readln()
    val s2 = readln()
    var r = " "
    for (i in s1.length - 1 downTo 0) {
        r += convertToXorKotlin(s1[i], s2[i])
    }
    println(r)
}

fun convertToXorKotlin(a: Char, b: Char): Char = if(a != b)  '1' else  '0'