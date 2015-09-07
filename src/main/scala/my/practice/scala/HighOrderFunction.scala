package my.practice.scala

import scala.annotation.tailrec

/**
 * Created by naveen on 2/9/15.
 */
class HighOrderFunction() {
  def genericisSorted[A](ar: Array[A],p:(Array[A],Int)=>Boolean) =
    {
      @tailrec
      def loop(n:Int):Boolean={
        print(n)
        if(n<ar.length-1)
          if (p(ar,n)) loop(n+1) else false
        else true
      }
      if(ar.length<2) true
      else loop(0)
    }


  def compareInt(ar: Array[Int], n: Int): Boolean = {
    ar(n) < ar(n + 1)
  }

  def compareChar(ar: Array[String], n: Int): Boolean = {
    ar(n).<(ar(n+1))
  }

  def findFirst(s: String, ar: Array[String]) = {
    def loop(n:Int):Int={
      if(ar(n)==s) return n else if (n<ar.length-1) loop(n+1) else -1
    }
    loop(0)

  }

  def genericFindFirst[A] (s:A,ar: Array[A]) = {
    def loop(n:Int):Int={
      if(ar(n)==s) n
      else if (n<ar.length-1) loop(n+1)
      else -1
    }
    loop(0)

  }


  def factorial(i: Int) = {
   def go(i:Int,acc:Int): Int={
     if(i<=0) acc else go(i-1,i*acc)
   }
    go(i,1)
  }

}
