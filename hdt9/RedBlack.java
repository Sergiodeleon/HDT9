/**
 *
 * @author Sergio
 */
public class RedBlack implements WordSet{
    RedBlackTree<Word> Tree= new RedBlackTree<Word>();
    
    	public void add(Word wordObject)
	{
		Tree.add(wordObject);
	}
        
    	public Word get(Word word)
	{
		return Tree.get(word);
	}
}
