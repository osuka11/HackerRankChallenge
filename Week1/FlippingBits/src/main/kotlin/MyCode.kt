package main.kotlin

class MyCode
{
    fun flippingBits(n: Long ):Long = n.toUInt().inv().toLong()
    fun main(args: Array<String>) {
        val q = readLine()!!.trim().toInt()

        for (qItr in 1..q) {
            val n = readLine()!!.trim().toLong()

            val result = flippingBits(n)

            println(result)
        }
    }
}