class Alpha  
{ 
    static String s = ""; 
    Alpha()  
    { 
        s += "alpha "; 
    } 
} 
class SubAlpha extends Alpha  
{ 
    SubAlpha()  
    { 
        s += "sub "; 
    } 
} 
  
public class SubSubAlpha extends SubAlpha  
{ 
    SubSubAlpha()  
    { 
        s += "subsub"; 
    } 
    public static void main(String[] args)  
    { 
        SubSubAlpha obj=new SubSubAlpha(); 
        System.out.println(obj.s); 
    } 
} 