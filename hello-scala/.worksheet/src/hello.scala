object hello {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(14); 

  var i = 0;System.out.println("""i  : Int = """ + $show(i ));$skip(4); val res$0 = 
  i;System.out.println("""res0: Int = """ + $show(res$0));$skip(9); 
  i += 1;$skip(29); 

	val lst = List("1", "99");System.out.println("""lst  : List[java.lang.String] = """ + $show(lst ));$skip(22); 
	lst.foreach(_.toInt)}
}