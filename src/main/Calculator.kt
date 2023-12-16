package main

class Calculator(){
    fun calculate():Double{
        println("[첫 번째 수]")
        var num1 = getInput().inputNum()
        println("[연산자( + - * / )]")
        var oper = getInput().inputOper()
        println("[두 번째 수]")
        var num2 = getInput().inputNum()

        when(oper) {
            "+" -> return operation(AddOperation(), num1, num2)
            "-" -> return operation(SubsOperation(), num1, num2)
            "*" -> return operation(MultOperation(), num1, num2)
            "/" -> return operation(DivOperation(), num1, num2)
//            "%" -> return num1 % num2
        }
        return 0.0
    }
    fun operation(ao:AbstractOperation, _n1:Double, _n2:Double):Double {
        var result = ao.operation(_n1, _n2)
        return result
    }
}