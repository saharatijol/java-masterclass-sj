package codingbatexercise.string1;

public class WithoutX2 {
    public static void main(String[] args) {
        /* Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
           and otherwise return the string unchanged.
           This is a little harder than it looks.
                withoutX2("xHi") → "Hi"
                withoutX2("Hxi") → "Hi"
                withoutX2("Hi") → "Hi"
                withoutX2("xxHi") → "Hi"
                withoutX2("Hix") → "Hix"
                withoutX2("xaxb") → "axb"
                withoutX2("xx") → ""
                withoutX2("x") → ""
                withoutX2("") → ""
                withoutX2("Hello") → "Hello"
                withoutX2("Hexllo") → "Hexllo"
                withoutX2("xHxllo") → "Hxllo"
        * */
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
        System.out.println(withoutX2("xxHi"));
        System.out.println(withoutX2("Hix"));
        System.out.println(withoutX2("xaxb"));
        System.out.println(withoutX2("xx"));
        System.out.println(withoutX2("x"));
        System.out.println(withoutX2(""));
        System.out.println(withoutX2("Hello"));
        System.out.println(withoutX2("Hexllo"));
        System.out.println(withoutX2("xHxllo"));

    }

    private static String withoutX2(String str) {
        String result = "";
        if(str.length() < 2) {
            return result;
        }

        if(str.length() >= 2 && str.charAt(0) != 'x' && str.charAt(1) != 'x') {
            return str;
        }

        if(str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return result = str.substring(2);
        }



        if(str.charAt(0) == 'x') {
            result = str.substring(1);
        }

        if(str.charAt(1) == 'x') {
            result = str.substring(0,1) + str.substring(2);
        }
        return result;
    }
}
