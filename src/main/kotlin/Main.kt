//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten

fun main(){
    val  details=Humans("Cynthia",19,65)
    details.eat(5)
    details.Speak("i love smiling")
    details.birthday()
    var person =User("Cynthia","Wambua","cynthiamumbuawambua@gmail.com",713504579,7065)
    person.user("Cynthia")
    person.email("cynthiamumbuawambua@gmail.com")
}
class Humans(var name:String,var age:Int,val weight:Int) {
    fun eat(foodWeight: Int) {
        var newWeight = weight + foodWeight
        println("i am eating $newWeight kgs of food")

    }
   // speak(speech: String) :Prints the string passed to it
    fun Speak(speech:String){
        println(speech)
    }
   // birthday( ) :Increments the human’s age by 1
  //  Create an instance of this human class and invoke all its functions
    fun birthday(){
        var newAge = ++age
        println(newAge)
    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
data class User(var firstName:String,var lastName:String,var email:String,val phoneNumber:Int,val password:Int){
    fun user(firstName: String){
        println(firstName)

    }
    fun email(email: String){
        println(email)
    }

}