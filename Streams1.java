import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Streams1 {

    public static void main(String[] args) {
        
        List<String> stringslist = Arrays.asList("", "boat", "car", "boat", "bike", "ship", "plane", "skateboard", "truck", "");

        System.out.println(stringslist);
        
        // A simple count of elements in the stream.
        long count = stringslist.stream().count();
        
        System.out.println("Strings in the stream: " + count);
        
        // Filtering with lambda expression + doing count of filtered elements
        count = stringslist.stream().filter(str -> str.length() > 2).count();
        
        System.out.println("Strings which are longer than 2 chars: " + count);
        
        // Creating a new list of Strings and removing the empty strings.
        
        List<String> cleanedlist = stringslist.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        
        System.out.println(cleanedlist);
        
        // Sort the cleaned list
        
        List<String> sortedlist = cleanedlist.stream().sorted().collect(Collectors.toList());
        
        System.out.println(sortedlist);
        
        // Count the occurrances of "boat"
        long boats = sortedlist.stream().filter(str -> str == "boat").count();
        
        System.out.println("boats counted: " + boats);
        
        // Remove the duplicates from the original list (2 empty strings and 2 "boats")
        
        List<String> dupesremoved = stringslist.stream().distinct().collect(Collectors.toList());
        
        System.out.println(dupesremoved);
    }
}
