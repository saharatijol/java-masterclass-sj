package codingbatexercise.string1;

public class MakeTags {
    public static void main(String[] args) {
        /* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
           In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
           Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
                makeTags("i", "Yay") → "<i>Yay</i>"
                makeTags("i", "Hello") → "<i>Hello</i>"
                makeTags("cite", "Yay") → "<cite>Yay</cite>"
        * */
        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));
    }

    private static String makeTags(String tag, String word) {
        String tagBuilder = "";
        String openTag = "<" + tag + ">";
        String closeTag = "</" + tag + ">";

        tagBuilder = openTag + word + closeTag;
        return tagBuilder;
    }
}
