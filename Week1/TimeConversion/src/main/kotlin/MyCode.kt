package main.kotlin

fun timeConversion(s:String):String{
    val format = s[8]
    val auxTime = s.subSequence(0, 2).toString()
    var result = " "
    if(format == 'P' && auxTime == "12"){
        result = "12:${s.subSequence(3, 8)}"
    }else if(format == 'P'){
        val time = auxTime.toInt() +12
        result = "$time:${s.subSequence(3, 8)}"
    }else if(format == 'A' && auxTime == "12"){
        result = "00:${s.subSequence(3, 8)}"

    }else if( format == 'A'){
        result = "${s.subSequence(0, 8)}"
    }
    return result

}
fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}