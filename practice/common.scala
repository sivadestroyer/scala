def reverse(arr:Array[Int],arr1:Array[Int]):Array[Int] ={
    var l=Array[Int]()
    for (i <-arr)
    for (j <- arr1)
    if (i==j)
    l:+=i
    l
}
var arr=Array[Int](1,2,3,4,5,6)
var arr1=Array(2,3,5,7,8,4)
print((reverse(arr,arr1)).mkString(","))