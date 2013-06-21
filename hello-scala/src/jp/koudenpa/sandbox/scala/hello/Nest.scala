package jp.koudenpa.sandbox.scala.hello

/**
 * 再帰の試行。
 */
object Nest {
  /**
   * 引数として与えた数全件の階乗を計上して出力する。
   * 長整数以上の結果はサポートしない。
   *
   * @param args 階乗のn配列
   */
  def main(args: Array[String]) = {
    args.foreach(n => println(n + " -> " + factorial(n.toLong).toString))
  }

  /**
   * nの階乗を返却する。
   * 長整数以上の結果はサポートしない。
   */
  def factorial(n: Long): Long = {
    if (n == 0) {
      1
    } else if (n > 0) {
      factorial(n - 1) * n
    } else {
      factorial(n + 1) * n
    }
  }
}