/**
 * 
 */
/**
 * @author Steven Roberts
 *
 */
package exerciseFour;



class StringDemo4
{
  public static void main ( String[] args )
  {
    String str = new String( "Golf is a good walk spoiled." ); // create the original object

    String substring = str.substring(12, 25); //create a new object from the original

    System.out.println( substring );

  }
}




