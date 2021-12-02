object Main extends App {
  println(Strings.testUppercase("scala"))
  println(Strings.testInterpolations("Anna", 20))
  println(Strings.testComputation(1, 1))
  println(Strings.testTakeTwo("Long string"))
  println()

  println(Adts.testGetNth(List(1, 2, 3), 1))
  println(Adts.testDouble(Some(2)))
  println(Adts.testIsEven(2))
  println(Adts.testSafeDivide(4, 0))
  println(Adts.testGoodOldJava(_.charAt(100), ""))
  println()

  println(Maps.testGroupUsers(Seq(Maps.User("Vanya", 63), Maps.User("Petya", 33), Maps.User("Danya", 20))))
  println(Maps.testNumberFrodos(Map("first" -> Maps.User("Nikita", 8), "second" -> Maps.User("Valera", 13))))
  println(Maps.testUnderaged(Map("first" -> Maps.User("Sasha", 21), "second" -> Maps.User("Mark", 38))))
  println()

  println(Sequence.testLastElement(Seq(1, 2, 3)))
  println(Sequence.testZip(Seq(1, 2), Seq(2, 3)))
  println(Sequence.testForAll(Seq(1, 2, 3, 4))(_ % 2 == 0))
  println(Sequence.testPalindrom(Seq(1, 2, 1)))
  println(Sequence.testFlatMap(Seq(1, 2, 3))(item => Seq(item, item * item)))
}