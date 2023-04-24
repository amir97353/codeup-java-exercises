public class ServerNameGenerator {
    private static String[] adjectives = {"share", "guide", "real", "stimulation", "twilight", "achieve", "steak",
            "myth",
            "painter",
            "mixture"
    };

    private static String[] nouns ={"share", "guide", "real", "stimulation", "twilight", "achieve", "steak", "myth",
            "painter",
            "mixture"};

    private static String randomElement(String[] strings){
        int ramdomNumber = (int)(Math.random() * strings.length);
        return strings[ramdomNumber];
    }

    public static void main(String[] args) {
        String adj = randomElement(adjectives);
        String noun = randomElement(nouns);
        System.out.println("here is your server name");
        System.out.println(adj + " - " + noun);
    }
}
