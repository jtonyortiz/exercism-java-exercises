import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return this.languages.isEmpty();
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        for(int i = 0; i < this.languages.size(); i++){
            if(this.languages.get(i).equals(language)){
                this.languages.remove(i);
            }
        }
    }

    public String firstLanguage() {
        
        if(languages.isEmpty()){
            return "";
        }else{
            return this.languages.get(0);
        }
    }

    public int count() {
        //Return the size of the ArrayList
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        //Check to see if the ArrayList contains the language 
        //return true if in list
        //or false if not
        if(this.languages.contains(language)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isExciting() {
        //Ckeck and see if the ArrayList contains either Java or Kotlin
        if(this.languages.contains("Java") || this.languages.contains("Kotlin")){
            return true;
        }else{
            return false;
        }
    }
}
