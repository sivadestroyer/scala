class sivainfo
{
    var name="sivabalamurugan"
    var age=21
    var branch = "CSE"
    def printinfo()
    {
        println("hai"+name+"welcome to"+branch)
    }
}

object info
{
    def main(args: Array[String])
    {
        var s = new sivainfo
        s.printinfo()
    }
}
//output
// haisivabalamuruganwelcome toCSE