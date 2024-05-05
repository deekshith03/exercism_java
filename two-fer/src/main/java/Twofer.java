public class Twofer {
    public String twofer(String name) {
        String end_name = name!=null ? name.trim() : "you";
        return String.format("One for %s, one for me.", end_name);
    }
}
