fun main() {
    val text = "akirachix"
    val letters = ("a,i,r")
    println(letters.split(" ,"))

    println(create ("Winnie" ,34))

    println(word("plantation"))

    val market= "Debora"
    val market2 = "Denise"
    if(market== market2) {
        println("that's me")
    }
        else{
            println("i don't know who that is")


    }

    }
    fun create (name:String, age:Int):String{
        val  sentence = "Hi, my name is $name I am $age years old"
        return sentence

    }
fun word (length:String):String {
    return ("The length of the length string is" + length.length)

}



