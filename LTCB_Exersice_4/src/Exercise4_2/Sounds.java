package Exercise4_2;


public class Sounds extends Gallery {
    private PlayingTimeOfTheRecording time;

    public Sounds(String nameForSourceFile, double sizes, PlayingTimeOfTheRecording time) {

        super(nameForSourceFile, sizes);
        this.time = time;
    }
}
