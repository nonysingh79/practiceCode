package my.practice.scala

import org.scalatest.FunSuite

/**
 * Created by naveen on 2/9/15.
 */
class HighOrderFunctionsTest extends FunSuite{

  test("factorial of 3 should be 6")
  {
    val highOrderFunction = new HighOrderFunction()
    assert(highOrderFunction.factorial(3)==6)
  }

  test("factorial of 1 should be 1")
  {
    val highOrderFunction = new HighOrderFunction()
    assert(highOrderFunction.factorial(1)==1)
  }

  test("factorial of 0 should be 0")
  {
    val highOrderFunction = new HighOrderFunction()
    assert(highOrderFunction.factorial(0)==1)
  }

  test("findFirst A within A,B,C shouwld return 1")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array("A","B","C")
    assert(highOrderFunction.findFirst("A",ar)==0)
  }

  test("findFirst A within B,C,A shouwld return 2")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array("B","C","A")
    assert(highOrderFunction.findFirst("A",ar)==2)
  }

  test("findFirst E within B,C,A should return -1")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array("B","C","A")
    assert(highOrderFunction.findFirst("E",ar)== -1)
  }

  test("findFirst E within B,C,A should return -1 with generic function")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array("B","C","A")
    assert(highOrderFunction.genericFindFirst("E",ar)== -1)
  }

  test("findFirst A within B,C,A should return 2 with generic function")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array("B","C","A")
    assert(highOrderFunction.genericFindFirst("A",ar)==2)
  }

  test("findFirst 3 within 1,3,2 should return 1 with generic function")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array(1,3,2)
    assert(highOrderFunction.genericFindFirst(3,ar)==1)
  }

  test("isSorted gives true for 1,5,10,20 with generic function")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array(1,5,10,20)
    assert(highOrderFunction.genericisSorted(ar,highOrderFunction.compareInt))
  }

  test("isSorted gives false for 1,10,5,20 with generic function")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array(1,10,5,20)
    assert(!highOrderFunction.genericisSorted(ar,highOrderFunction.compareInt))
  }

  test("isSorted gives true for 1,10 with generic function")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array(1,10)
    assert(highOrderFunction.genericisSorted(ar,highOrderFunction.compareInt))
  }

  test("isSorted gives true for 1 with generic function")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array(1)
    assert(highOrderFunction.genericisSorted(ar,highOrderFunction.compareInt))
  }

  test("isSorted gives true for A,B,C,D with generic function")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array("A","B","C","D")
    assert(highOrderFunction.genericisSorted(ar,highOrderFunction.compareChar))
  }

  test("isSorted gives false for A,C,D,B with generic function")
  {
    val highOrderFunction = new HighOrderFunction()
    val ar = Array("A","C","D","B")
    assert(!highOrderFunction.genericisSorted(ar,highOrderFunction.compareChar))
  }

}
