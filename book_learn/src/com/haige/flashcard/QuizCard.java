package book_learn.src.com.haige.flashcard;

/**
 * @className: book_learn.src.com.haige.flashcard-> QuizCard
 * @description: 表示卡片数据的类
 * @author: cqh
 * @createDate: 2021-05-25 13:01
 * @version: 1.0
 * @todo:
 */
public class QuizCard {
    private String question;
    private String answer;

    public QuizCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
