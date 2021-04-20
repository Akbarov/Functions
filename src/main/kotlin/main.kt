fun main() {

    greeting()
    greetingWithPerson("Abdulloh")
    favoriteBook("Mehrobdan chayon")
    happyBirthday("Ali","Valiyev",25)
    happyBirthday(firstName = "John",age = 30,lastName = "Smith")
//   val fullName =  fullName("John","Smith")
//    println(fullName)
    println(fullName("John","Smith"))
    val product = fun (num1:Int,num2:Int):Int{
        return num1*num2
    }
    val sum = {num1:Int,num2:Int->num1+num2}
    println(product(2,3))
    println(sum(10,20))

}
fun greeting(){
    println("Hello World")
}
fun greetingWithPerson(name: String) {
    println("Hello $name")
}
fun favoriteBook(bookName: String = "Baxtiyor oila") {
    println("My favorite book is $bookName")
}
fun happyBirthday(firstName: String, lastName: String, age: Int) {
    println("Hello $firstName $lastName you turn to $age today")
}
fun fullName(firstName: String,lastName: String) = "$firstName, $lastName"
