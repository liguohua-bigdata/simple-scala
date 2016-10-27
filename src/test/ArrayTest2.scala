package test

/**
  * Created by liguohua on 2016/10/27.
  */
object ArrayTest2 {
  def main(args: Array[String]): Unit = {
    //1.定义一个数组
    val arr = new Array[Int](10)
    //2.遍历数组进行赋值操作
    for (i <- 0 until arr.length) {
      arr(i) = (i * 2)
    }
    //3.遍历数组进行取值操作,使用数组的元素进行遍历
    for (e <- arr) {
      //打印数组中的每一个元素
      print(e + "\t")
    }
  }
}
