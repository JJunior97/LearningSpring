package AOP.AspectJ;

public aspect JudgeAspect {

    public JudgeAspect(){

    }

    pointcut performance(): execution(* perform(..));

    after() returning(): performance(){

    }


    //Wstrzyknięty obiekt
    private CriticismEngine criticismEngine;
    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
