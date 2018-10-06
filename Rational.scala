

object RationalObject {
  def main(args: Array[String]): Unit = {
    var R = new Rational() // Class without parameter 
    var X = new Rational(1,3)
    var Y = new Rational(7,21)
    var Z = X.add(Y)
    println("Rational Addition Output is: " + Z.numer + "/" + Z.denom)
    println("Normal Addition Output  is: " + R.add(10,5))  // Normal Number Calculations and Overloading Call
    X = new Rational(1,6)
    Y = new Rational(7,21)
    Z = X.sub(Y)
    println("Rational Subtraction Output is: " + Z.numer + "/" + Z.denom)
    println("Normal Subtraction Output  is: " + R.sub(10,5)) // Normal Number Calculations and Overloading Call
    
    Z = X.mul(Y)
    println("Rational Multiplication Output is: " + Z.numer + "/" + Z.denom)
    println("Normal Multiplication Output  is: " + R.mul(10,5)) // Normal Number Calculations and Overloading Call
    X = new Rational(1,5)
    Y = new Rational(7,8)
    Z = X.div(Y)
    println("Rational Division Output is: " + Z.numer + "/" + Z.denom)
    println("Normal Division Output  is: " + R.div(10,5))
    
    var W1 = new Rational(10) //Testing Whole Numbers and Auxillary Constructors
    var W2 = new Rational(26) // Testing Whole Numbers and Auxillary Constructors
    var Wo  = W1.add(W2)
    println("Rational Addition Output for Whole Number Class creation: " + Wo.numer + "/" + Wo.denom)
  }
}
class Rational(x: Int, y: Int) {
  //Default Constructors
  var numer = 0
  var denom = 0
  if(x!=0 && y != 0) {
    numer = x/gcd(x,y)
    denom = y/gcd(x,y)
  }
  def this(){  //Auxillary Constructors
    this(0,0)
  }
  def this(x: Int) = { //Auxillary Constructors for Whole number, here Numerator is the passed value and denominator is 1
    this(x, 1)
  }
  private def gcd(a: Int, b: Int): Int = { // private method to be called within the class only for calculating the GCD
    if (b == 0) a else gcd(b, a % b)
  }
  def add(r: Rational): Rational = { // Add Method for Rational Type   
    println("*************Rational Addtion Method Called*************")
    return new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
  }
  def add(a:Int, b:Int): Int = { // Add Method for Normal Numbers      ***** Method Overloading *****
    println("*************Normal Numbers Addtion Method Called*************")
    return a+b
  }
  def mul(r: Rational): Rational = { // Mul Method for Rational Type 
    println("*************Rational Multiplication Method Called*************")
    return new Rational(numer *  r.numer , denom * r.denom)
  }
  def mul(a:Int, b:Int): Int = { //Mul Method for Normal Numbers   ***** Method Overloading *****
    println("*************Normal Numbers Multiplication Method Called*************")
    return a*b
  }
  
  def sub(r: Rational): Rational = {  // Sub Method for Rational Type 
    println("*************Rational Subtraction Method Called*************")
    return new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
  }
  def sub(a:Int, b:Int): Int = { //Sub Method for Normal Numbers   ***** Method Overloading *****
    println("*************Normal Numbers Subtraction Method Called*************")
    return a-b
  }
  
  def div(r: Rational): Rational = {  // Div Method for Rational Type 
    println("*************Rational Division Method Called*************")
    return new Rational(numer * r.denom,  denom * r.numer)
  }
  
  def div(a:Int, b:Int): Float = { //Div Method for Normal Numbers   ***** Method Overloading *****
    println("*************Normal Division Method Called*************")
    return a/b
  }
}

