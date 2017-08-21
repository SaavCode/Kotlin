
class  UserAdmins<T >(credit:T ){ //class recives credit, dont know type: **** use temporary T

    init {
        println(credit)
    }

}

fun <T> display(process:T){ //temporary function
    println(process)//print T
}

fun main(args:Array<String>){

    var userAdmin =UserAdmins<String>("Nestor")//data needs to be string, Nestor is printed
    var userAdmin2 =UserAdmins<Int>(1234)//T is changed to integer
    var userAdmin3 =UserAdmins<Double>(1234.5)

    display<Int>(22)//send interger to temp display function
    display<String>("process user")
}
