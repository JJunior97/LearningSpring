package AOP.SimpleAspects;

public class Magician implements MindReader {

    private String thoughts;

    public void interceptThoughts(String thoughts) {
        System.out.println("Przechwytuję myśli ochotnika: ");
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
