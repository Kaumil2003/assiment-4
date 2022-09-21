/*


 Write a program to to generate user defined exception using “throw” and “throws” keyword. 
  Understand concepts of throw and throws.


 * github link:
 * ID:21ce108
 * Name:Kaumil ptni
 * 
 */
class set42
{
  static void check() throws ArithmeticException
  {  
    System.out.println("my name is kaumil");
    throw new ArithmeticException("yahello");
  }

  public static void main(String args[])

  { 
    try
    {
      check();
    }
    catch(ArithmeticException e)
    {
        System.out.println("sayonora");
    
    }
  }
}
