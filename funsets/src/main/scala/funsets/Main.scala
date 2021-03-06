package funsets

object Main extends App {
  import FunSets._
  val s = (x: Int) => 2 <= x && x <= 20
  val se = filter(s, x => x % 2 == 0)
  printSet(s)
  printSet(se)
  println(forall(s, (x: Int) => x % 2 == 0))
  println(forall(se, (x: Int) => x % 2 == 0))
}
