package stringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Create StringBuilder with default capacity
        StringBuilder sb = new StringBuilder();

        // Display initial capacity
        System.out.println("Default Capacity: " + sb.capacity()); // Output: 16

        // Add characters more than 16 to see capacity grow
        sb.append("abcdefghijklmnopqr");
        // newCapacity = (currentCapacity * 2) + 2
        System.out.println("New Capacity after exceeding limit: " + sb.capacity()); // Output: 34

//        Custom Initial Capacity
        StringBuilder s = new StringBuilder(28); // Initial capacity set to 28
        System.out.println(s.capacity()); // Output: 28

    }
}

