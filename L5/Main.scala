object Main extends App {
  println(Typeclasses.testReversableString("Hello!"))
  println(Typeclasses.testSmashInt(3, 5))
  println(Typeclasses.testSmashDouble(2, 4))
  println(Typeclasses.testSmashString("Nikita ", "Sokolovskiy"))
}