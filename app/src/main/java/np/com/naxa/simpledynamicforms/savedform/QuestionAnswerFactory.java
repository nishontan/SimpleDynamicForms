package np.com.naxa.simpledynamicforms.savedform;

import android.support.annotation.NonNull;

/**
 * Created on 8/29/17
 * by nishon.tan@gmail.com
 */

public class QuestionAnswerFactory {

    public final static String QUESTION_TYPE_TEXT = "TEXT";
    public final static String QUESTION_TYPE_DATETIME = "DATETIME";


    public static QuestionAnswer getEditTextQuestion(@NonNull int order,@NonNull String question, @NonNull String hint,@NonNull String answer,@NonNull int InputType, @NonNull boolean isRequired) {
        QuestionAnswer questionAnswer = new QuestionAnswer();

        questionAnswer.setQuestionType(QUESTION_TYPE_TEXT);
        questionAnswer.setQuestion(question);
        questionAnswer.setHint(hint);
        questionAnswer.setRequired(isRequired);
        questionAnswer.setInputType(InputType);
        questionAnswer.setOrder(order);
        questionAnswer.setAnswer(answer);

        return questionAnswer;
    }

    public static QuestionAnswer getDateTimeQuestion(@NonNull int order,@NonNull String question, @NonNull String answer, @NonNull boolean isRequired) {
        QuestionAnswer questionAnswer = new QuestionAnswer();

        questionAnswer.setQuestionType(QUESTION_TYPE_DATETIME);
        questionAnswer.setQuestion(question);
        questionAnswer.setRequired(isRequired);
        questionAnswer.setOrder(order);
        questionAnswer.setAnswer(answer);

        return questionAnswer;
    }



}
