package Task3;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap certificationCosts = new ConcurrentHashMap<>();
        certificationCosts.put("ABC", 1);
        certificationCosts.put("BCD", 2);
        certificationCosts.put("CDE", 3);
        certificationCosts.put("DEF", 4);

        Set concurrentSet = certificationCosts.keySet();

        System.out.println("Before adding in Set: " + concurrentSet);
        //concurrentSet.add("EFG");
        System.out.println("After adding in Set: " + concurrentSet);

        Set concurentHashSet = certificationCosts.newKeySet();
        concurentHashSet.add("asd");
        concurentHashSet.contains("asd");
        concurentHashSet.remove("asd");
        System.out.println("After addinmg into concurrent hash set: " + concurrentSet);

        concurrentSet = certificationCosts.keySet(246);
        concurrentSet.add("Sping enterprise");

    }
}
