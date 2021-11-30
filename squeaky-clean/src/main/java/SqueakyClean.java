class SqueakyClean {
    static String clean(String identifier) {
        //Replace white space from string to underscore:
        boolean isNoLetter = true;
        for(int i = 0; i < identifier.length(); i++){
            if(!Character.isJavaIdentifierPart(identifier.charAt(i))){
                isNoLetter = false;
                break;
            }
        }




        StringBuilder s  = new StringBuilder();
        for(int i = 0; i < identifier.length(); i++){
            if(identifier.charAt(i) ==  ' '){
                s.append('_');
            }
            //If there is a '\0' character, replace str with 'CTRL'
            else if(identifier.charAt(i) == '\0'){
                s.append('C');
                s.append('T');
                s.append('R');
                s.append('L');
            }
            //Resolve kebab case '-' 
            else if(identifier.charAt(i) == '-'){
                i++;
                char v = Character.toUpperCase(identifier.charAt(i));
                s.append(v);
            }
            else if(identifier.charAt(i) != ' '){
                s.append(identifier.charAt(i));
            }
        }


        return s.toString();
                
    }
}
