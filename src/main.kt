fun main(){
    g()
    var z=stmt("Laura",23)
    println(z)
    details()
    var e=t()
    println(e)

}
fun g() {
    var text = "akirachix"
    var y = (text[0].toString() + text[2] + text[3])
    println(y)
}


fun stmt(name:String, age:Int):String{
    var x="Hi, my name is $name and i am $age years old"
    return x
}

fun t():Int{
    var s="Kengaaju"
    var l =s.length
    return l
}

fun details() {
    var name = "Laura"
    if (name == "Laura") {
        println("That's me !")
    } else {
        println("I don't know who that is")
    }
}
