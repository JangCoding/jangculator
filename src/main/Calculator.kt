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
            "+" -> return addOperation(AddOperation(), num1, num2)
            "-" -> return subsOperation(SubsOperation(), num1, num2)
            "*" -> return multOperation(MultOperation(), num1, num2)
            "/" -> return divOperation(DivOperation(), num1, num2)
//            "%" -> return num1 % num2
        }
        return 0.0;
    }

    fun addOperation(addOp:AddOperation, _n1:Double, _n2:Double):Double{
        var result = addOp.operation(_n1, _n2)
        return result
    }
    fun subsOperation(subsOp:SubsOperation, _n1:Double, _n2:Double):Double{
        var result = subsOp.operation(_n1, _n2)
        return result
    }
    fun multOperation(multOp:MultOperation, _n1:Double, _n2:Double):Double{
        var result = multOp.operation(_n1, _n2)
        return result
    }
    fun divOperation(divOp:DivOperation, _n1:Double, _n2:Double):Double{
        var result = divOp.operation(_n1, _n2)
        return result
    }

}