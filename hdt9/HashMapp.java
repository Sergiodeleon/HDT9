

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Sergio
 */
public class HashMapp<k,v> implements WordSet{
     private HashMap<String,String > stringMap=new HashMap<String, String>();
     public boolean valor;
     
    public void add(Word objeto) {
        stringMap.put(objeto.getWord(),objeto.getType());
    }

    public Word get(Word pal) {
        stringMap.containsValue(pal.getWord());
        valor=stringMap.containsKey(pal.getWord());
        if(valor==true){
            Word palabra=new Word();
            palabra.setWord(pal.getWord());
            palabra.setType(stringMap.get(pal.getWord()));
            return palabra;
        }else{
            return null;
        }
      }
     
}
