import java.util.*;

class Main {

    public static void main(String[] args) {

        byte[] bytes = {10, 2, 15, 11};
String st="";
        for (byte b : bytes) {
             st = javax.xml.bind.DatatypeConverter.printHexBinary(bytes);
            
        }
      System.out.print(st);
    } 
}