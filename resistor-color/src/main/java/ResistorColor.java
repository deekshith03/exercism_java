import java.util.List;
import java.util.Arrays;

class ResistorColor {
    int colorCode(String color) {
        List<String> list = Arrays.asList(this.colors());
        return list.indexOf(color);
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
