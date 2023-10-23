public class CompressionRLE {

    //La méthode coder
    public void coder(int n, String chaine)
    {
        String chaineFinal = new String();
        String chaine1 = new String();
        int temp = 0;

        for(int i=0;i<n;i++)

        {
         int j = 1;
         chaine1 = String.valueOf(chaine.charAt(i));
         while(i+1<n && chaine.charAt(i) == chaine.charAt(i+1))
         {
             chaine1 = chaine1 + chaine.charAt(i);
             j++;
             i++;
         }
         if(j < 3)
         {
             if(temp == 0)
             {
                 chaineFinal = chaineFinal + "0" + chaine1;
             }
             else{
                 chaineFinal = chaineFinal + chaine1;
             }
             temp = j;
         }
         else
         {
           temp = 0;
           chaineFinal = chaineFinal + j + chaine.charAt(i);
         }
        }
        System.out.println("----------------------------------------------------------------------------------------------\n"+
                "la chaine " + chaine +" après compression = " + chaineFinal);
    }

    //La méthode compare
    public void compare(String chaine, String chaineComp)
    {
        System.out.println("le taux de compression est de : "+((float)chaineComp.length()/(float)chaine.length())*100+"%");
    }

}
