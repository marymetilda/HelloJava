print:
system.out.print("output");

println:
system.out.println("output");

\n:
system.out.print("output \n");

variables:
type variableName = value;
eg: String name = "tony stark";
int a = 26;
int b = 10;
double price = 25.3;

Data Types :{
Primitive: {
byte - 1byte = 8bits,
short,
char - 2byte,
boolean - 1byte,
int -4byte,
long -8byte,
float -4byte,
double - 8byte
}
Non-Primitive{
String,
Array,
Class,
Object,
Interface
}
}

input:
import java.util.\*;

public class Main {
public static void main(String[] args) {
//input
Scanner sc = new Scanner(System.in);
String name = sc.next();
System.out.println(name);
}
}

sc.next() :=> only support sing word, not multiple words, if there are multiple words, only first word is taken into account.

sc.nextLine() :=> supports multiple words.

sc.nextInt()  :=> for intput integers.
