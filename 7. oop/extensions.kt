

 fun ArrayList<String>.swap(index1:Int,index2:Int){//swap index1 and 2
     var temp=this.get(index1)//get index1 fromn this class
     this.set(index1,this.get(index2))//swap index1 and 2
  //swap with temp
     this.set(index2,temp)
 }

fun main(args:Array<String>){
        var arrayList=ArrayList<String>()
 //add to array
        arrayList.add("nestor")
        arrayList.add("mel")
        arrayList.add("milo")
 //print list
        println(arrayList)
 //swap elements in the array
        arrayList.swap(0,1)
 //print list after swap
        println(arrayList)


}
