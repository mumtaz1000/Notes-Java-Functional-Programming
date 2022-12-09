package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValidPredicate.test("070"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("073"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("070"));

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
        phoneNumber.startsWith("07") && phoneNumber.length() == 3;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
