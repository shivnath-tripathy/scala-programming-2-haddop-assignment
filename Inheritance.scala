object Inheritance {
 def main(args: Array[String]): Unit ={
   val class1 = new ExtendClass1("Dummy Value-1") // Create Instance of the Extended Class 1
   println("Name method value from Class one: " + class1.Name) // Extended class 1's Method Name is accessed
   println("#########################################################")
   val class2 = new ExtendClass2("Dummy Value-2") //Create Instance of the Extended Class 2 which Inherit from Extended Class 2
   println("Name method value from Class one: " + class2.Name) // Extended Class 2's Method Name is accessed
 }
}
abstract class BaseClass(name: String){ // Create the base class with Abstract keyword
  println("This is from Base Class") //When ever the subclass is called this will be executed, this is Primary Constructor
  def Name: String   // a method signature only
}
//********** SINGLE LEVEL INHERITANCE*******
class ExtendClass1(name: String) extends BaseClass(name) { // Use "extends" keyword to inherit from the base class
  println("This is from Extended Class 1")  //Primary Constructor for the extended class, this will be printed when the class is initiated
  override def Name: String = { return name} // All the methods of the base class has to be implemented
  
}
// ********** MULTIPLE INHERITANCE*******
class ExtendClass2(name: String) extends ExtendClass1(name) { // Create a class extended from the another Extended Class
  println("This is from Multiple Inherited Extended Class 2") //Primary Constructor for the extended class, this will be printed when the class is initiated
  override def Name: String = { return name} // All the methods of the base class has to be implemented
 }