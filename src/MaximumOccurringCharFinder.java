import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOccurringCharFinder
{
    private static void printMaxOccurringChar()
    {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] charArray = "The purpose of our lives is to be happy".replaceAll("\\s+", "").toCharArray();

        for (char c : charArray)
        {
            if (charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }

        Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();

        int maxCount = 0;

        char maxChar = 0;

        for (Entry<Character, Integer> entry : entrySet)
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();

                maxChar = entry.getKey();
            }
        }

        System.out.println("Input String : "+ "The purpose of our lives is to be happy");

        System.out.println("Maximum Occurring char and its count :");

        System.out.println(maxChar+" : "+maxCount);
    }

    public static void main(String[] args)
    {
        printMaxOccurringChar();

    }
}
