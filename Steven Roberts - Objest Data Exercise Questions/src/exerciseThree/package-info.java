/**
 * 
 */
/**
 * @author Steven Roberts
 *
 */
package exerciseThree;



class StringDemo3
{
  public static void main ( String[] args )
  {
    String landTime;
    String fixTime;
    
    landTime = new String( "        'The Land Before Time' was one of my favorite children's movies.      " );

    fixTime = landTime.trim();

    System.out.println(landTime);
    System.out.println(fixTime);

  }
}







