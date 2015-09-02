package my.practice.scala

import org.scalatest.FunSuite

/**
 * Created by naveen on 2/9/15.
 */
class SignumTest extends FunSuite{



  test ("SingNum returns 1 when the number is positive")
  {
    val chap= new Signum()
    assert(chap.signum(10)==1);
  }

  test ("SingNum returns -1 when the number is negative")
  {
    val chap= new Signum()
    assert(chap.signum(-10)== -1)
  }

  test ("SingNum returns 0 when the number is 0")
  {
    val chap= new Signum()
    assert(chap.signum(0)==0)
  }
}
