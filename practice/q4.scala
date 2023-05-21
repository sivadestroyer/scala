def remove(name: String, pos:Int):String = {
    if (pos<0 || pos>name.length){
        name
    }
    else
    name.substring(0,pos)+name.substring(pos+1)
}
print (remove(sivabalamurrgan,12))