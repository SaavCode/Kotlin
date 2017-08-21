abstract class CreditCard(){//abstractno implementation
    fun CreditID():String
    { return "23432dsdfds"}
    abstract fun newCredir()//abstract means this method does not have an implementation

}

class UserInfo(): CreditCard(){
    //this class will return credit card info
    fun getInfo():String{
        return CreditID();
    }
    override  fun newCredir(){ //add impmlementation to abstract class. inhereter has to implement
        println(" new cart created")
    }
}



fun main(args:Array<String>){
    //this willnot work
    //var credit=CreditCard()
    //println(credit.CreditID())
    //get user info
    var user=UserInfo()
    println(user.getInfo())//print info
}
