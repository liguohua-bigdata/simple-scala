package chapter003

object ArrayTest {
  def main(args: Array[String]): Unit = {
    //1.定义一个3行3列的二维数组
    import scala.Array._
    val myMatrix = ofDim[Int](3, 3)
    //2.二维数组赋值
    for (i <- 0 until myMatrix.length) {
      for (j <- 0 until myMatrix(i).length) {
        myMatrix(i)(j) = (j + i) * 2;
      }
    }
    //3.二维数组取值
    for (i <- 0 until myMatrix.length) {
      for (j <- 0 until myMatrix(i).length) {
        print(myMatrix(i)(j) + "\t")
      }
      println()
    }
  }
}


