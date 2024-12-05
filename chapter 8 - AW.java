//aw - 1
if (Character.toUpperCase(choice) == 'Y')

//aw - 2
int spaceCount = 0;
for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == ' ') spaceCount++;
}

//aw - 3
int digitCount = 0;
for (int i = 0; i < str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) digitCount++;
}

//aw - 4
int lowercaseCount = 0;
for (int i = 0; i < str.length(); i++) {
    if (Character.isLowerCase(str.charAt(i))) lowercaseCount++;
}


//aw - 5
public static boolean endsWithCom(String str) {
    return str.endsWith(".com");
}

//aw - 6 
public static boolean endsWithComIgnoreCase(String str) {
    return str.toLowerCase().endsWith(".com");
}

//aw - 7
LocalDate date = LocalDate.of(2000, 9, 5);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
System.out.println(date.format(formatter));


//aw - 8 a
StringTokenizer tokenizer = new StringTokenizer("cookies>milk>fudge:cake:ice cream", ">:");

while (tokenizer.hasMoreTokens()) {
    System.out.println(tokenizer.nextToken());
}

//aw - 8 b
String[] tokens = "cookies>milk>fudge:cake:ice cream".split("[:>]");
for (String token : tokens) {
    System.out.println(token);
}

//aw - 9
public static void printAverage(int num1, int num2) {
    System.out.println("Average: " + ((num1 + num2) / 2.0));
}


//aw 10
System.out.println("Binary: " + Integer.toBinaryString(i));
System.out.println("Hexadecimal: " + Integer.toHexString(i));
System.out.println("Octal: " + Integer.toOctalString(i));


//aw 11
value = Double.parseDouble(str);
