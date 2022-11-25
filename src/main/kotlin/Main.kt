
class Parents (override val name : String, override val surname : String) : Son1(name,surname), Son2

open class Son1 (open val name : String, open val surname: String){
    fun person1() : String{
        return "$name, $surname"
    }
}
interface Son2 {
    val name: String
    val surname: String
    fun person2(): String {
        return "$name, $surname"
    }
}

fun main() {
    val son1 = Parents("Marcus", "Marziano")
    val son2 = Parents("Mauro", "Marziano")
    println("First son: " + son1.person1())
    println("Second son: " + son2.person2())
}