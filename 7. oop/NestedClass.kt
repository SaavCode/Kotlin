
class Outer {

    private  val name:String?=null//no value
//nested class
   inner class Nested {
        
        fun Show(){
            println(name)//print from outer
        }
    }

}


fun  main(args:Array<String>){

   var outer=Outer()//create instance
    //var nested=Outer.Nested()
   // nested.Show()//call nested class


}
