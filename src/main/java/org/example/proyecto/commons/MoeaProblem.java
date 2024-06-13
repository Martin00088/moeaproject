package org.example.proyecto.commons;

import org.moeaframework.core.Solution;
import org.moeaframework.problem.AbstractProblem;

public class MoeaProblem extends AbstractProblem {
    public MoeaProblem(int numberOfVariables,int numberOfObjectives) {
        super(numberOfVariables, numberOfObjectives);
    }
    public MoeaProblem(int numberOfVariables,int numberOfObjectives, int numberOfConstraints) {
        super(numberOfVariables, numberOfObjectives, numberOfConstraints);
    }
    @Override
    public void evaluate(Solution solution){
    //solution.setObjetives()
    }
    @Override
    public Solution newSolution(){
        Solution solution= new Solution(numberOfVariables, numberOfObjectives);
        //solution.setVariable(index 0);
        return null;
    }
}
