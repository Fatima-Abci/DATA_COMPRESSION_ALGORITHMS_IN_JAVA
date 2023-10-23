public class Test {
    public static void main(String [] args)
    {
        //tester la ch1
     String ch1 = "ABABABABABABABABABABABABABABABABABAB";
     CompressionRLE compression = new CompressionRLE();
     compression.coder(36,ch1);
        compression.compare("ABABABABABABABABABABABABABABABABABAB","0ABABABABABABABABABABABABABABABABABAB");
     // tester la ch2
        String ch2 = "AAAAAABBBBBBAAAAAABBBBBBAAAAAABBBBBB";
        CompressionRLE compression2 = new CompressionRLE();
        compression.coder(36,ch2);
        compression.compare("AAAAAABBBBBBAAAAAABBBBBBAAAAAABBBBBB","6A6B6A6B6A6B");
        //tester la ch3
        String ch3 = "AAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBB";
        CompressionRLE compression3 = new CompressionRLE();
        compression.coder(36,ch3);
        compression.compare("AAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBB","18A18B");

    }
}
