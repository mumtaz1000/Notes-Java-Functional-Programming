package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrl());
        System.out.println(getDbConnectionUrlSupplier.get());
    }

    static String getDbConnectionUrl () {
        return "jdbc://localhost:4321/users";
    }
    static Supplier<String> getDbConnectionUrlSupplier = () -> "jdbc://localhost:4321/suppliers";
}
