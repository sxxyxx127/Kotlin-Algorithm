package Algorithm_2

import java.util.*

fun main(){

    val input = Scanner(System.`in`)

    var a:Int= input.nextInt()
    var b:Int= input.nextInt()
    var c:Int= input.nextInt()
    val numbers=listOf(a, b, c)

    if(a==b && b==c) {
        println("${10000+(a*1000)}")
    } else if (a==b && b!=c) {
        println("${1000+(a*100)}")
    } else if (a!=b && b==c) {
        println("${1000+(c*100)}")
    } else if (a==c && b!=c) {
        println("${1000+(c*100)}")
    } else if (a!=b && b!=c && a!=c) {
        println("${Collections.max(numbers)*100}")
    }
}

