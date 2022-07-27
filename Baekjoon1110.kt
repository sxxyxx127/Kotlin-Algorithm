package Algorithm_2

import java.util.*


fun main(){

    val input = Scanner(System.`in`)
    var num:Int = input.nextInt() //input
    var res:Int = num //res = num 초기값으로 할당
    var sum: Int //각 자리수의 합
    var len = 0 // cycle

    do{
        sum = res/10 + res%10
        res = (res%10)*10 + sum%10
        len ++
    }while(res != num) //res 와 num 값이 같으면 while 탈출


    println(len)


}
