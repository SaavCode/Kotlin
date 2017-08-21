
class  Singleton{
    var name:String?=null
   private constructor(){//dont allow instance
        println("instance is created")
    }

    companion object {
        val instance:Singleton by lazy { Singleton() }//sends previous
    }
}

fun  main(args:Array<String>){

    var s1=Singleton.instance 
    s1.name="nestor"
    println(s1.name)//prints name

    var s2=Singleton.instance//gets instancce 1
    println(s2.name)       

    var s3=Singleton.instance//gest instance 1
    println(s3.name)
}
