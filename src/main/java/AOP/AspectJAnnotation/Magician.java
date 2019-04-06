package AOP.AspectJAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader {

    private String thoughts;

    @Pointcut("execution(* AOP.AspectJAnnotation.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts){
    }

    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Przechwytuję myśli ochotnika: ");
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
