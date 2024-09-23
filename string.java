package string.java;
import java.io.File;

public class string {
	

public static void main(String[] args) {

String s= "myna";

int length = s.length();

System.out.println(length);



//charAt

char charat = s.charAt(2);

System.out.println(charat);



//indexof

int indexof = s.indexOf("a");

System.out.println(indexof);



//lastindexof

int lio = s.lastIndexOf("a");

System.out.println(lio);



//isempty

boolean empty = s.isEmpty();

System.out.println(empty);



//contains

boolean contain = s.contains("i");

System.out.println(contain);



//trim

String p = " janani ";

String trim=p.trim();

System.out.println(trim);



//startswith

boolean sw=s.startsWith("ja");

System.out.println(sw);



//endswith

boolean ew=s.endsWith("i");

System.out.println(ew);



//uppercase

String uc=s.toUpperCase();

System.out.println(uc);



//lowercase

String lc = s.toLowerCase();

System.out.println(lc);



//equal

boolean e=s.equals(p);

System.out.println(e);



//equalignorecase

boolean eic=s.equalsIgnoreCase(p);
System.out.println(eic);



//replace

String replace =s.replace("j", "h");

System.out.println(replace);



//replaceall

String ra = s.replaceAll(s, "janani");

 System.out.println(ra);



//sunstring

String ss = s.substring(3);

System.out.println(ss);



String s1=s.substring(3,5);

System.out.println(s1);

	}
}
