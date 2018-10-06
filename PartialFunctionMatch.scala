object PartialFunctionMatch {
  def main(args: Array[String]):Unit ={
   val const =5  // Initialize a constant
   val addvalues = PartialFunction[(Int, Int), Int] {  // Partial Function which takes 2 inputs
   case(x,y) => x+y+ const                          // Take Parameter and add along with Constan
  }
  def getSquare(a: Int): Int = {  //Function to do Square of the value
   return a*a
  }
 println("Output of the PartialFuncton = " + addvalues((2,3))) // Executing the Partial Function
 println("Square of a Function= " + getSquare(addvalues((2,3)))) // Executing the Square function which take function as a parameter
 println("#######################################################################")
 
 def GetCourseFee(course: String): Int = { course match { //Get the Course Fee using Pattern Match function
   case "Android" =>12999
   case "Big Data Development" =>17999
   case "Spark" =>19999
   case _ =>0
 }}  
 println("Fee for Andriod Course: " + GetCourseFee("Android"))
 println("Fee for Big Data Development Course: " + GetCourseFee("Big Data Development"))
 println("Fee for Spark Course: " + GetCourseFee("Spark"))
 println("Fee for some other Course: " + GetCourseFee("some other"))
 }
 
}

