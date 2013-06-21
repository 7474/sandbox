package jp.koudenpa.sandbox.scala.hello

/**
 * HelloScala
 */
object HelloScala {

  /**
   * 全ての引数を出力する。
   */
  def main(args: Array[String]): Unit = {
    println("HelloScala")
    println("argument count:" + args.length)
    var i = 0
    for (arg <- args) {
      println(i.toString + ":" + arg)
      i += 1
    }
  }
}