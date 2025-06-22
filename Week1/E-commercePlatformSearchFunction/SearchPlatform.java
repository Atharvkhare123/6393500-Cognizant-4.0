// main file 
import java.util.Arrays;

public class SearchPlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "T-shirt", "Clothing"),
            new Product(103, "Shoes", "Footwear"),
            new Product(104, "Camera", "Electronics"),
            new Product(105, "Book", "Education")
        };

        // Linear Search
        Product resultLinear = LinearSearch.search(products, "Camera");
        System.out.println("Linear Search Result: " + resultLinear);

        // Sort for Binary Search
        Arrays.sort(products);

        // Binary Search
        Product resultBinary = BinarySearch.search(products, "Camera");
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
