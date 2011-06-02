
package jsat.classifiers;

/**
 *
 * @author Edward Raff
 */
public class CategoricalData
{
    private int n;//Number of different categories
    private String[] catNames;

    /**
     * 
     * @param n the number of categories
     */
    public CategoricalData(int n)
    {
        this.n = n;
        catNames = null;
    }

    /**
     * 
     * @return the number of possible categories there are for this category
     */
    public int getNumOfCategories()
    {
        return n;
    }
    
    public boolean isValidCategory(int i)
    {
        if (i < 0 || i >= n)
            return false;
        
        return true;
    }
    
    public String catName(int i)
    {
        if(catNames != null)
            return catNames[i];
        else
            return Integer.toString(i);
    }
    
    
}