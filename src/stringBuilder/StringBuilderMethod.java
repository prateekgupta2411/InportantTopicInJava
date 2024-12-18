package stringBuilder;


//StringBuilder in Java
//
//StringBuilder ek mutable class hai jo strings ko efficiently manipulate karne ke liye use hoti hai. Iska primary purpose hai mutable string operations, jo ki String ke immutable nature se alag hai.
//Difference Between String and StringBuilder
//Feature	String (Immutable)	StringBuilder (Mutable)
//Mutability 	Strings immutable hoti hain, har modification ek new object banata hai.	Strings mutable hoti hain, ek hi object modify hota hai.
//Performance	Slow hai for frequent modifications kyunki naye objects create hote hain.	Faster hai kyunki same object modify hota hai.
//Thread-Safety	Thread-safe hai (String immutable hone ki wajah se).	Not thread-safe (use StringBuffer for thread-safety).
//Use Case	Jab aapki string rarely change hoti hai (e.g., constants).	Jab frequent changes ki zarurat ho (e.g., loops, concatenation).
//Why Use StringBuilder?
//
//Performance:
//Jab aapko repeatedly string concatenate karni ho (e.g., in loops), StringBuilder better performance deta hai.
//
//Memory Efficient:
//StringBuilder ke sath ek hi object modify hota hai, is wajah se kam memory allocate hoti hai.
//
//Ease of Use:
//Predefined methods jaise append(), insert(), replace(), etc., string manipulation ko simple aur efficient banate hain.
//
//Key Features of StringBuilder
//
//Initial Capacity:
//Jab StringBuilder object banate ho, default capacity 16 characters hoti hai.
//Agar capacity exceed ho jaye, toh capacity double hoti hai plus 2.
//
//Example:
//
//StringBuilder sb = new StringBuilder();
//    System.out.println(sb.capacity()); // Output: 16
//
//Dynamic Memory Management:
//StringBuilder memory ko automatically adjust karta hai jaise hi string ki size badhti hai.
//
//Methods in StringBuilder
//1. append()
//
//String ko end mein add karta hai.
//        Syntax:
//
//        sb.append(String str);
//
//Example:
//
//StringBuilder sb = new StringBuilder("Hello");
//    sb.append(" World");
//    System.out.println(sb); // Output: Hello World
//
//2. insert()
//
//String ko specific position par insert karta hai.
//Syntax:
//
//        sb.insert(int offset, String str);
//
//Example:
//
//StringBuilder sb = new StringBuilder("Hello");
//    sb.insert(5, " Java");
//    System.out.println(sb); // Output: Hello Java
//
//3. replace()
//
//String ke specific portion ko replace karta hai.
//Syntax:
//
//        sb.replace(int start, int end, String str);
//
//Example:
//
//StringBuilder sb = new StringBuilder("Hello World");
//    sb.replace(6, 11, "Java");
//    System.out.println(sb); // Output: Hello Java
//
//4. delete()
//
//Specific portion ko delete karta hai.
//Syntax:
//
//        sb.delete(int start, int end);
//
//Example:
//
//StringBuilder sb = new StringBuilder("Hello Java");
//    sb.delete(6, 10);
//    System.out.println(sb); // Output: Hello
//
//5. reverse()
//
//String ko reverse karta hai.
//        Syntax:
//
//        sb.reverse();
//
//Example:
//
//StringBuilder sb = new StringBuilder("Hello");
//    sb.reverse();
//    System.out.println(sb); // Output: olleH
//
//6. capacity()
//
//Current capacity ko return karta hai.
//Syntax:
//
//        sb.capacity();
//
//Example:
//
//StringBuilder sb = new StringBuilder();
//    System.out.println(sb.capacity()); // Output: 16
//
//        7. setLength()
//
//String ki length ko set karta hai (truncate ya pad karta hai).
//Syntax:
//
//        sb.setLength(int newLength);
//
//Example:
//
//StringBuilder sb = new StringBuilder("Hello World");
//    sb.setLength(5);
//    System.out.println(sb); // Output: Hello
//
//8. charAt() and setCharAt()
//
//charAt() ek specific index ka character return karta hai.
//setCharAt() ek specific index ka character set karta hai.
//
//Example:
//
//StringBuilder sb = new StringBuilder("Hello");
//System.out.println(sb.charAt(1)); // Output: e
//        sb.setCharAt(1, 'a');
//System.out.println(sb); // Output: Hallo
//
//When to Use StringBuilder?
//
//Jab strings ko frequently modify karna ho.
//Jab concatenation loops mein ho.
//Jab memory efficiency aur performance zaroori ho.

public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
         sb.setCharAt(1, 'z'); // "Java" becomes "Jzva"
        System.out.println(sb);

        // Append
        sb.append(" Programming");
        System.out.println("After Append: " + sb); // Java Programming

        // Insert
        sb.insert(5, "is Awesome ");
        System.out.println("After Insert: " + sb); // Java is Awesome Programming

        // Replace
        sb.replace(5, 14, "is Fun");
        System.out.println("After Replace: " + sb); // Java is Fun Programming

        // Reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb); // gnimmargorP nuF si avaJ
    }
}
//
//Haan, StringBuilder objects Java ki heap memory mein create hote hain, kyunki Java mein all objects, including mutable objects like StringBuilder, heap memory mein allocate hote hain.
//Detailed Explanation:
//
//Heap Memory:
//Java mein heap memory runtime par allocate hoti hai aur sabhi objects aur instance variables yahan store hote hain.
//Jab aap ek StringBuilder object banate ho, toh uska reference stack memory mein hota hai, aur actual object heap memory mein store hota hai.
//
//StringBuilder Internals:
//Jab aap StringBuilder banate ho, toh internally ek character array (char[]) create hota hai, jo ki mutable hota hai. Yeh array bhi heap memory mein allocate hota hai.
//For example:
//
//StringBuilder sb = new StringBuilder("Hello");
//
//sb: Reference (stored in stack memory)
//            "Hello" ka character array: Stored in heap memory.
//
//Difference Between String and StringBuilder in Memory:
//String:
//        Immutable hai, aur String literals ko JVM String pool mein store karta hai (jo heap memory ka part hai). Agar ek String modify kiya jaye, toh naya object banta hai.
//StringBuilder:
//        Mutable hai, aur modifications existing object par hote hain (no new object is created).
//
//Example of Memory Allocation:
//
//public class MemoryDemo {
//    public static void main(String[] args) {
//        // StringBuilder object creation
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" World");
//
//        System.out.println(sb); // Output: Hello World
//    }
//}
//
//Memory Allocation:
//StringBuilder sb: Reference stored in stack memory.
//        Internal char[] array: Stored in heap memory.
//Modifications (append) directly update the char[] in the heap.
//
//Mutable Behavior Advantage:
//
//Since StringBuilder modifies the same object in heap memory:
//
//No new objects are created for every modification (unlike String).
//This makes StringBuilder more memory-efficient and faster for frequent string operations.
