object calculator{
    def add(y:Int, x:Int)=x+y;
    def add2(x:Int)=(y:Int)=>x+y;//curried fuction
    def add3(x:Int)(y:Int)=x+y;//simple scala version
    def main(args: Array[String]){
        println(add(10,20));
        println(add2(10)(20));
        println(add3(10)(20));

    }


}