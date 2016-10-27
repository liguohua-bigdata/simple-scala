###
先要引入scala.collection.mutable.ArrayBuffer,才能使用ArrayBuffer
```scala
scala> import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ArrayBuffer
```
####创建ArrayBuffer
创建ArrayBuffer，用以盛放字符串
```scala
scala> val arrbr=ArrayBuffer[String]()
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer()

```
创建ArrayBuffer，用以盛放字符串
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)
```

####追加操作
prepend()方法的原型如下：
```scala
 def prepend(elems: A*) { prependAll(elems) }
```
 
追加一个元素：append()方法，可以追加一个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr.append("jack")

scala> arrbr
res5: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua, jack)
```

追加多个元素：append()方法，可以追加多个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr.append("jack","lily","mark")

scala> arrbr
res11: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)
```

追加一个元素：'+='可以追加一个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr+="jack"
res16: arrbr.type = ArrayBuffer(xiao ming, xiao hua, jack)

scala> arrbr
res17: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua, jack)
```


追加多个元素：'+='可以追加多个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr+=("jack","lily","mark")
res18: arrbr.type = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)

scala> arrbr
res19: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)
```

####追加操作之
prependAll()方法的原型如下：
```scala
   def prependAll(xs: TraversableOnce[A]) { xs ++=: this }
```

追加Array: prependAll()方法可以追加一个Array
执行代码
```scala
val arrbr=ArrayBuffer[String]("ming","hua")
arrbr.appendAll(Array("jack","lily","mark"))
arrbr
```
执行效果：
```scala
scala> val arrbr=ArrayBuffer[String]("ming","hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(ming, hua)

scala> arrbr.appendAll(Array("jack","lily","mark"))

scala> arrbr
res1: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(ming, hua, jack, lily, mark)
```

追加List: prependAll()方法可以追加一个List
执行代码
```scala
val arrbr=ArrayBuffer[String]("ming","hua")
arrbr.appendAll(List("jack","lily","mark"))
arrbr
```
执行效果：
```scala
scala> val arrbr=ArrayBuffer[String]("ming","hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(ming, hua)

scala> arrbr.appendAll(List("jack","lily","mark"))

scala> arrbr
res5: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(ming, hua, jack, lily, mark)
```


追加Set: prependAll()方法可以追加一个Set
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr.appendAll(Set("jack","lily","mark"))

scala> arrbr
res27: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)
```


异常1： prependAll()方法把能用于追加单个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr.appendAll"jack")
<console>:1: error: identifier expected but string literal found.
arrbr.appendAll"jack")
```


异常1： prependAll()方法把能用于追加多个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr.appendAll(("jack","lily","mark"))
<console>:14: error: type mismatch;
 found   : (String, String, String)
 required: scala.collection.TraversableOnce[String]
       arrbr.appendAll(("jack","lily","mark"))
                       ^
```


追加Array：'++='可以追加一个Array
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr++=Array("jack","lily","mark")
res31: arrbr.type = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)

scala> arrbr
res32: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)
```

追加List：'++='可以追加一个List
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr++=List("jack","lily","mark")
res33: arrbr.type = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)

scala> arrbr
res34: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)
```

追加Set：'++='可以追加一个Set
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr++=Set("jack","lily","mark")
res35: arrbr.type = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)

scala> arrbr
res36: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua, jack, lily, mark)
```

异常1：'++='不能追加单个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr++="jack"
<console>:14: error: type mismatch;
 found   : String("jack")
 required: scala.collection.TraversableOnce[String]
       arrbr++="jack"
               ^
```

异常2：'++='不能追加多个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr++=("jack","lily","mark")
<console>:14: error: too many arguments for method ++=: (xs: scala.collection.TraversableOnce[String])arrbr.type
       arrbr++=("jack","lily","mark")
            ^
```


####插入操作
insert()方法的原型如下：
```scala
  def insert(n: Int, elems: A*) { insertAll(n, elems) }
```

在指定位置处插入一个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr.insert(1,"xiao wang")

scala> arrbr
res2: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao wang, xiao hua)
```

在指定位置处插入多个元素
```scala
scala> val arrbr=ArrayBuffer[String]("xiao ming","xiao hua")
arrbr: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao hua)

scala> arrbr.insert(1,"xiao wang","xiao zhang","xiao li")

scala> arrbr
res7: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(xiao ming, xiao wang, xiao zhang, xiao li, xiao hua)
```



```scala

```


```scala

```



```scala

```


```scala

```



```scala

```


