package Algorithm_1

import java.util.Scanner

fun main(){    val input = Scanner(System.`in`) //input
    var h = input.nextInt() //h - 시간
    var m = input.nextInt() //m - 분

    if(m < 45){ // 45분 미만
        if(h == 0) {//자정이라면 초기화
            h = 24
            h--; // 1시간 감소
            m = m + 15
        }
        else{
            h--;
            m = m + 15
        }
    }else
        m = m -45
    println(h)
    println(m)
}

