
fun main(args:Array<String>){
    print("Enter name:")
    var name= readLine()//read input
    print("Enter age:")
    var age:Int= readLine()!!.toInt()//conver to int
    print("Enter department:")
    var dep:String? //could be null
    dep= readLine()
    print("Enter pi:")
    var pi:Double= readLine()!!.toDouble() //conver to double

    println("out")
    println("name:"+ name)
    println("age:"+ age)
    println("department:"+ dep)
    println("PI:"+ pi)



}
