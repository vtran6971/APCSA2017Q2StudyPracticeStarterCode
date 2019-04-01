/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice{
    private int firstInt;
    private int secondInt;

    public MultPractice(int first, int second)
    {
        this.firstInt = first;
        this.secondInt = second;
    }

    public String getProblem() {
        String problem = firstInt + " Times " + secondInt;
        return problem;
    }

    public void nextProblem() {
        secondInt++;
    }
}
