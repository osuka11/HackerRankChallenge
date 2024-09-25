package main.kotlin

fun main() {
    val stringsCount = readLine()!!.trim().toInt()

    val strings = Array<String>(stringsCount, { "" })

    for(i in 0 until stringsCount){
        val stringsItem = readLine()!!
        strings[i] = stringsItem
    }
    val queriesCount = readLine()!!.trim().toInt()

    val queries = Array<String>(queriesCount, {""})

    for ( i in 0 until queriesCount){
        val queriesItem = readLine()!!
        queries[i] = queriesItem
    }
    val res = matchingStrings(strings, queries)
    println(res.contentToString())
}
fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int>{
    val results = Array<Int>(queries.size) { i -> 0 }
    var counter = 0
    for ((index, element) in queries.withIndex()){
        for (j in strings){
            if (element == j) counter++

        }
        results[index] = counter
        counter = 0
    }
    return results

}