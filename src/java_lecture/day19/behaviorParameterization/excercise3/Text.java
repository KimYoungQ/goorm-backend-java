package java_lecture.day19.behaviorParameterization.excercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static void sout(List<Text> sentence, Consumer<Text> textConsumer) {
        for (Text text : sentence) {
            textConsumer.accept(text);
        }
    }

    private static void sentenceToUpperCase(List<Text> sentence, Consumer<Text> textConsumer) {

        for (Text text : sentence) {
            textConsumer.accept(new Text(text.getText().toUpperCase()));
        }
    }

    public static void main(String[] args) {
        List<Text> sentence = Arrays.asList(
                new Text("Tennis"),
                new Text("Soccer"),
                new Text("Baseball")
        );

        sout(sentence, text -> System.out.println(text));
        sentenceToUpperCase(sentence, text -> System.out.println(text));
    }


}
