package com.cydeo.java13;

public class TextBlockDemo {

    public static void main(String[] args) {

        var address1 = "7925 Jones Branch Dr \n" +
                "McLean, VA 22102";

        System.out.println(address1);

        var address2 = """
                7925 Jones Branch Drive
                McLean, VA 22102
                """;

        System.out.println(address2);


    }
}
