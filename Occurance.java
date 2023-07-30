public class Occurance
{
    public static void main(String[] args) {
        String name = "Wellcome to java ";
        int t1= name.length();

        name = name.replaceAll("a","");
        int t2 = name.length();

        int count= t1-t2;

        System.out.println( "Occurance of character a is : "+count);
    }
}