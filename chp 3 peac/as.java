

/**
 * Write a description of class as here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class as
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans;
    private int tokens;
    /**
     * Default constructor for objects of class as
     */
    public void fillUp(int numCans)
    {
      // update instence variable cans
      cans += numCans;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void insertToken(int numTokens)
    {
        //Instructions for updating to token and can counts
        tokens += numTokens;
        cans -= numTokens;
    }

}
