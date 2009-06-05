package checkers.algorithm;

import java.util.List;

import checkers.domain.CalculationContext;
import checkers.domain.Model;
import checkers.domain.Move;
import checkers.domain.Player;
import checkers.evaluation.IEvaluation;
import checkers.rules.ISuccessor;

/**
 * Greedy Algoritmas� uygulamas�
 * 
 * @author ozge
 *
 */
public class GreedyAlgorithm {
	
	/**
	 * Greedy algoritmas�n� kullanarak belirli bir durumda bir sonraki hamleye karar verir.
	 * 
	 * @param context durum bilgilerini ta��r.
	 * @param model	tahtan�n �u anki durumunu belirtir.
	 * @param whosTurn s�ran�n kimde oldu�unu belirtir.
	 * @return
	 */
	public Move algorithm(CalculationContext context, Model model, Player whosTurn) {
		IEvaluation evaluationFunction = context.getEvaluationFunction();
		
		ISuccessor successorFunction = context.getSuccessorFunction();
		List<Move> successors = successorFunction.getSuccessors(model, whosTurn);
		double maxValue=0;
		Move selectedMove = null;
		for (int i = 0; i < successors.size(); i++) {
			Move currentMove = successors.get(i);
			model.tryMove(currentMove);
			double currentValue = evaluationFunction.evaluate(model, whosTurn);
			model.undoTryMove(currentMove);
			
			if(selectedMove == null){
				maxValue = currentValue;
				selectedMove = currentMove;
			}
			if (maxValue<currentValue){
				maxValue=currentValue;
				selectedMove = currentMove;
			}	
		}
		return selectedMove;
	}
}
