class Account(var name: String, var id: Int, var amount: Int){
}

fun main(args: Array<String>)
{
    val myClass = Account("Aditya",10,100000)
    println("Name is  ${myClass.name}")
}


