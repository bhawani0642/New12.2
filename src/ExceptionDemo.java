import java.util.Scanner;

public class ExceptionDemo {

// String array declaration
static String[] strings = new String[5];

/**
* Method to check if value is present in array , returns value if found
* else throws ValueNotFoundException
* 
* @param value
* @return
* @throws ValueNotFoundException
*/
public static String searchString(String value) throws ValueNotFoundException {
boolean found = false;
String out = null;
for (int i = 0; i < strings.length; i++) {
if (strings[i].equalsIgnoreCase(value)) {
found = true;
out = strings[i];
return out;
}
}
if (found == false) {
throw new ValueNotFoundException("Value not found");
}
return null;

}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
for (int i = 0; i < strings.length; i++) {
System.out.println("Enter String " + (i + 1) + " to be added into array");
strings[i] = sc.nextLine();
}

System.out.println("Enter value to search in array");
String value = sc.nextLine();
/**
* Call the method her to search for input string and the method returns
* string value if found else throws ValueNotFoundException and this is
* caught and handled in below catch block
*/
try {
String out = searchString(value);
if (out != null && !out.isEmpty()) {
System.out.println(out);
}
} catch (ValueNotFoundException e) {

System.out.println(e);
}

}
}


