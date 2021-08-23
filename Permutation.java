package demo;

public class Permutation {

static void permutation(String str, String ans)
{
if (str.length() == 0) {
System.out.print(ans + "" );
// str.length() is ‘0’
}
for (int i = 0; i < str.length(); i++) {
// str.length is not '0' …. Can you Explain this Please.
char ch = str.charAt(i);

String ros = str.substring(0, i) +
str.substring(i + 1);

permutation(ros, ch+ans);
}
}

public static void main(String[] args)
{
String s = "abc";
permutation(s, "");
}
}
