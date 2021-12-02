import scala.util.{Try, Failure, Success}

/** Реализуйте следующие функции.
 *
 * List(1, 2) match {
 *   case head :: tail => ???
 *   case Nil          => ???
 *   case l            => ???
 * }
 *
 * Option(1) match {
 *   case Some(a) => ???
 *   case None    => ???
 * }
 *
 * Either.cond(true, 1, "right") match {
 *   case Left(i)  => ???
 *   case Right(s) => ???
 * }
 *
 * Try(impureExpression()) match {
 *   case Success(a)     => ???
 *   case Failure(error) => ???
 * }
 *
 * Try(impureExpression()).toEither
 *
 */
object Adts {

  // a) Дан List[Int], верните элемент с индексом n

  def getNth(list: List[Int], n: Int): Option[Int] = list.lift(n);

  // примените функцию из пункта (a) здесь, не изменяйте сигнатуру 
  def testGetNth(list: List[Int], n: Int): Option[Int] = getNth(list, n)

  // b) Напишите функцию, увеличивающую число в два раза.

  def double(n: Option[Int]): Option[Int] = n.map(_ * 2);

  // примените функцию из пункта (b) здесь, не изменяйте сигнатуру
  def testDouble(n: Option[Int]): Option[Int] = double(n)

  // c) Напишите функцию, проверяющую является ли число типа Int четным. Если так, верните Right. В противном случае, верните Left("Нечетное число.").

  def isEven(n: Int): Either[String, Int] = Either.cond(n % 2 == 0, n, "Нечетное число.")

  // примените функцию из пункта (c) здесь, не изменяйте сигнатуру
  def testIsEven(n: Int): Either[String, Int] = isEven(n)

  // d) Напишите функцию, реализующую безопасное деление целых чисел. Верните Right с результатом или Left("Вы не можете делить на ноль.").

  def safeDivide(a: Int, b: Int): Either[String, Int] = Either.cond(b != 0, a / b, "Вы не можете делить на ноль.")

  // примените функцию из пункта (d) здесь, не изменяйте сигнатуру
  def testSafeDivide(a: Int, b: Int): Either[String, Int] = safeDivide(a, b)

  // e) Обработайте исключения функции с побочным эффектом вернув 0.

  def goodOldJava(impure: String => Int, str: String): Try[Int] = Try(impure(str)) match {
    case Success(a) => Try(a)
    case Failure(_) => Try(0)
  }

  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testGoodOldJava(impure: String => Int, str: String): Try[Int] = goodOldJava(impure, str)

}