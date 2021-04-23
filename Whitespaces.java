public class Whitespaces {
public static void main(String[] args)
{
String sentence = "t    his is m  ana     sa";
System.out.println("Original sentence: " + sentence);
sentence = sentence.replaceAll("\\s", "");
System.out.println("After replacement: " + sentence);
}
}