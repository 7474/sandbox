object hello {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  var i = 0                                       //> i  : Int = 0
  i                                               //> res0: Int = 0
  i += 1

	val lst = List("1", "99")                 //> lst  : List[java.lang.String] = List(1, 99)
	lst.foreach(_.toInt)
}