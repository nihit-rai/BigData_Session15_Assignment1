
/**
 * author Nihit Rai
 * 
 * This is the parent class
 */
class Employee {
  var salary:Float = 20000 ; 
}

/**
 * author Nihit Rai
 * 
 * This is the child class
 */
class Programmer extends Employee{  
    var bonus:Int = 2500;  
    println("Salary = "+salary);  
    println("Bonus = "+bonus);  
}  
  
object MainObject{  
    def main(args:Array[String]){  
        new Programmer();  
    }  
}  
