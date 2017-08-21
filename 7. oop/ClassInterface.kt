
interface op{
    fun sum(n1:Int,n2:Int) { println("sum:"+ n1+n2)}//summation, takes two numbers
    fun div(n1:Int,n2:Int) { println("div:"+ n1/n2)}//division, takes println by
                    //default if given implementation
}


class UserOp:op{//needs to implement two methods
    override fun sum(n1: Int, n2: Int) {//override original function
        println("sum:"+ n1+n2)
      }

    override fun div(n1: Int, n2: Int) {//override division function
        println("div:"+ n1/n2)
    }

}

class AdminOp:op{//override functions again
    override fun sum(n1: Int, n2: Int) {
        println("sum:"+ (n1+n2-2))
    }

    override fun div(n1: Int, n2: Int) {
        println("div:"+ (n1/n2-2))
    }
    fun display(){
        println(" show")
    }

}

class ManagerOp:op{


}

fun main( args:Array<String>){
    //TODO:
    var adminop=AdminOp()
    adminop.sum(3,10)

}
