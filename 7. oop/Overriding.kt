open class Operations1(){

    open fun sum(n1:Int,n2:Int):Int //change to open, because any action is initiated as final
        return n1+n2
    }
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
}

class  MultiOperations1:Operations1{
   constructor(): super(){

   }
    override fun sum(n1:Int,n2:Int):Int{ //this function is overrided. 
        //This method is used insted of original



        return n1+n2*3

    }
    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
}


fun main(args:Array<String>){

    var op=Operations1()
    var sum=op.sum(10,15)//sum is called from operation
    println("sum:"+ sum)
    var div= op.div(12,11)//div called from operation
    println("div:"+ div)

    // second
    var op2=MultiOperations1()
    sum=op2.sum(10,15)//does not go to parent class because of overriding
    println("sum:"+ sum)
    div= op2.div(12,11)
    println("div:"+ div)



}
