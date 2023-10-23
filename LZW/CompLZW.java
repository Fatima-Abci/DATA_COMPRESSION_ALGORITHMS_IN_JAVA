
public class CompLZW {

    //method insert
    public void insert(String ch, String[] dict, int taille)
    {
        boolean trouve = false;
        int i = 256;
        while( i < taille && trouve == false)
        {
            if(dict[i] == "")
            {
                dict[i] = ch;
                trouve = true;
            }
            i++;
        }
    }

    //method returnIndice
    public int returnIndice(String ch, String[] dict, int taille)
    {
        for(int i = 0; i< taille; i++)
        {
            if(ch.equals(dict[i]))
            {
                return i;
            }
        }
        return -1;
    }

    //method LZW
    public void coderLZW(String chaine,String[] Dictionnaire, int taille)
    {
        int j;
        Boolean equal;
        String current, next;
        current = String.valueOf(chaine.charAt(0));
        for(int i = 1; i < chaine.length(); i++)
        {
            equal = false;
            next = String.valueOf(chaine.charAt(i));
            j = 256;
            while(j < taille && (equal == false))
            {
                   if ((current.concat(next)).equals(Dictionnaire[j]))
                  {
                     equal = true;
                  }

              j++;
            }
            if(equal == true)
            {
                current = current.concat(next);
            }
            else
            {
                System.out.print("\t"+returnIndice(current, Dictionnaire, taille));
                insert(current.concat(next), Dictionnaire, taille);
                current = next;
            }
        }
        System.out.print("\t"+returnIndice(current, Dictionnaire, taille));
    }

    public static void main(String[] args)
    {
        //déclarer une chaine
        String chaine = "thisisthe";
        int n = chaine.length();
        int taille = 256 + n;
        //initialistation du dictionnaire
        String[] Dictionnaire = new String[taille];
        for(int i = 0; i <= 255; i++)
        {
            Dictionnaire[i] = String.valueOf((char)i);
        }
        for(int i = 256; i < taille; i++)
        {
            Dictionnaire[i] = "";
        }
        CompLZW obj = new CompLZW();
        //appel de la méthode coderLZW
        obj.coderLZW(chaine, Dictionnaire, taille);

    }
}
