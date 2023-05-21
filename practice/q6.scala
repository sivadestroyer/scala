def reverse(arr:Array[Int]):Unit ={
    var s=0
    var e=(arr.length)-1
    while (s<e)
    {
        temp=arr(s)
        arr(s)=arr(e)
        e-=1
        s+=1
    }
}

print(reverse(Array(1,2,3,4,5)))