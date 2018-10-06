

object Fibonacci {
  def main(args: Array[String]): Unit = {
    val Fib = new FibonacciSeries //Create a instance of the class
    Fib.PrintFibonacci(6) // Call the Function to print the Fibonacci series in Sequence of Digits
    var result =Fib.FibNormalLoop(6)
    println("Using Normal Loop, 6th Digit in Fibonacci Series is:" + result)
    var result1 = Fib.FibRecursion(6)
    println("Using Recursion, 6th Digit in Fibonacci Series is:" + result1)
}}
//Class named FibonacciSeries is created
class FibonacciSeries {
  
  def FibNormalLoop(n:Int): Int={
    var a = 0     //Initialze the Starting two numbers a and B
    var b = 1
    var c=0
    var counter = 1 // Counter for the Nth Series
    var result = "" //Result variable created as a string to store concatenated output
    while(counter<= n){    //Loop until Nth Series
      c = a+b          // Calculate the addition of the two series number
      a = b                // Second Series is saved to First Variable
      b = c                // Result of addition is saved to second variable
      counter +=1          // Increase the counter
    }
    return c
    
  }
  // Defines the Fib Recursive function  
  def FibRecursion( n : Int) : Int = { 
    def Fib_tail( n: Int, a:Int, b:Int): Int = n match { //Define a tail function with in a function
      case 0 => b  // If n = 0 return the b value i.e the final result where the values is summed to the Nth Series
      case _ => Fib_tail( n-1, b, a+b ) //if n is not zero call the function recursively
  }
  return Fib_tail( n, 0, 1) //First time calling the recursive function
}
  
  // Create a method to Calculate and Print FibonacciSeries
  def PrintFibonacci(n:Int):Unit= {
    var a = 0 //Initialze the Starting two numbers a and B
    var b = 1
    var counter = 1 // Counter for the Nth Series
    var result = "" //Result variable created as a string to store concatenated output
    while(counter<= n){    //Loop until Nth Series
      var c = a+b          // Calculate the addition of the two series number
      a = b                // Second Series is saved to First Varaiable
      b = c                // Result of addition is saved to second varaiable
      result += c          // Result of addition is concatenated with result variabe
      counter +=1          // Increase the counter
    }
    println(result)        // Print the results
  }
}