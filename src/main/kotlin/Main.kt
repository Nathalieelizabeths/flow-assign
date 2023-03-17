fun  main(){
numbers()
    println(names(arrayOf("nathalie","rebeccah","hamisa","paula","juicy","vonne")))
    robot(5)
    robot(1)
    robot(12)
    robot(7)
    robot(35)
integers()
}


//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
//2.Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun numbers (){
    for(num in 0..100)
    if(num%2!=0){
        println("$num odd")
}

}
fun names(names:Array<String>):Int{
    var x=0
    for (name in names){
        if (name.length>5){
            x++

        }

    }
    return x
}
//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
 fun robot(age:Int){
     when(age){
         in (0..6) -> println("serve milk")
         in (6..15)-> println("bottle of fanta")
         else -> println("serve cocacola")
     }

 }
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
//fun numberfizzbuzz(multiple:String){
//    var x=0
//    for(num in 0..100)
//    if (num*3!=0){
//        println("$num fizz")
//        if (num*5!=0){
//            println("$num buzz")
//        }
//        if ()
//
//    }
//
//
//
//}

fun integers(){
    for(x in 1..100){
        if (x%3==0){
            println(" Fizz")

        }

        else if (x%5==0){
            println("buzz")

        }
         else  if  (x%3==0 && x%5==0){
             println("fizzbuzz")
        }

        }


}





