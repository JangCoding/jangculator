package main

class Calculator(){
    var num1:Double =0.0
    var num2:Double =0.0
    var oper:String =""

    fun inputNum():Double{
        var n:Double?=null
        while(n==null) {
            try {
                print("숫자를 입력해주세요 : ")
                n = readLine()?.toDouble()
            } catch (e : Exception) {
                println("유효한 숫자가 아닙니다. 다시 입력하세요.")
            }
        }
        return n?:0.0;  // n이 null 이면 0.0 반환
    }
    fun inputOper():String
    {
        var o:String?=null
        while(true) {
            try {
                print("연산자( + - * / )를 입력해주세요 : ")
                o = readLine()
            } catch (e : Exception) {
                println("유효한 연산자가 아닙니다. 다시 입력하세요.")
            }
            if(o in setOf("+", "-", "*", "/"))
                break
            else
                println("유효한 연산자가 아닙니다. 다시 입력하세요.")
        }
        return o?:"";  // n이 null 이면 0.0 반환
    }

    fun calculate():Double{
        println("[첫 번째 수]")
        num1 = inputNum()
        println("[연산자( + - * / )]")
        oper = inputOper()
        println("[두 번째 수]")
        num2 = inputNum()

        when(oper) {
            "+" -> return num1 + num2
            "-" -> return num1 - num2
            "*" -> return num1 * num2
            "/" -> return num1 / num2
        }
        return 0.0;
    }

}
fun main(){
    var c = Calculator()
    println("계산 결과 : ${c.calculate()}")
}