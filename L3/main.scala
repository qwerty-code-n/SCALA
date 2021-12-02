object main {
  def main(args: Array[String]):Unit= {
    println("Compositions")
    println("testCompose", Compositions.testCompose((a:Int)=> a*2)((b:Int)=>b*3)((c:Int)=>Math.pow(c,2))(2))
    println("testMapFlatMap", Compositions.testMapFlatMap((a:Int)=> Some(a.toString))((b:String)=> Some(b.isBlank))((c:Boolean)=> c.toString)(Some(0)))
    println("testForComprehension", Compositions.testForComprehension((a:Int)=> Some(a.toString))((b:String)=> Some(!b.isBlank))((c:Boolean)=> c.toString)(Some(5)))
    println("--------------------------------------------------")
    println("Recursive-Functions")
    println("testReverse", RecursiveFunc.testReverse(Cons(1,Cons(2, Cons(3, Nil())))))
    println("testMap", RecursiveFunc.testMap(Cons(1,Cons(2, Cons(3, Nil()))), (a:Int)=>a*2))
    println("testFlatMap", RecursiveFunc.testFlatMap(Cons(1,Cons(2, Cons(3, Nil()))),(a:Int)=>Cons(a*2,Nil())))
    println("--------------------------------------------------")
    println("Recursive-Data")
    println("testListIntEmpty", RecursiveData.testListIntEmpty(Cons(1,Nil())))
    println("testListIntEmpty", RecursiveData.testListIntEmpty(Nil()))
  }
}