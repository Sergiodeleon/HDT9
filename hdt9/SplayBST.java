
/**
 *
 * @author Sergio
 */
public class SplayBST implements WordSet{
        SplayTree<Word> Tree= new SplayTree<Word>();
    
    	public void add(Word wordObject)
	{
		Tree.insert(wordObject);
	}
        
    	public Word get(Word word)
	{
		return Tree.find(word);
	}
}
