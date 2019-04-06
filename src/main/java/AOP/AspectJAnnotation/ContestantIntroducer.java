package AOP.AspectJAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {

    @DeclareParents(
            value = "AOP.AspectJAnnotation.Performer+",
            defaultImpl = AOP.AspectJAnnotation.GraciousContestant.class
    )
    public static Contestant contestant;
}
