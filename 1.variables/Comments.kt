
// Main function
fun main(args:Array<String>){
    //ask for username
    print("Enter your name:")
    var name= readLine()
    print("Enter your age:")
    var age:Int= readLine()!!.toInt()
    print("Enter your department:")
    var dep:String?
    dep= readLine()
    print("Enter pi:")
    var pi:Double= readLine()!!.toDouble()

    /*
    print output
     */
    println("OUTPUT")
    println("name:"+ name)
    println("age:"+ age)
    println("department:"+ dep)
    println("PI:"+ pi)



}
