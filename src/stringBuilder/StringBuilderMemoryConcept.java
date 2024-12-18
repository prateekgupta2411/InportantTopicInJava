package stringBuilder;

public class StringBuilderMemoryConcept {
}
//Here is a visual representation of how a StringBuilder object is allocated in memory:
//
//Stack Memory:
//The reference variable sb is stored in the stack memory.
//This reference points to the StringBuilder object in the heap.
//
//Heap Memory:
//The StringBuilder object is created in the heap memory.
//Inside the StringBuilder object, a dynamic char[] array (e.g., storing ['H', 'e', 'l', 'l', 'o']) is also stored in the heap.
//
//The arrow from the sb reference in the stack to the StringBuilder object in the heap illustrates the connection between them. Similarly, the object internally links to the char[] array it manages. ​