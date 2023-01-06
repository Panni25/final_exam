public class Quiz {
    private int id;
    private int  student;
    private int totalScore;
    private int maxScore;

    public Quiz(int id, int student , int totalScore, int maxScore) {
		this.id = id;
		this.student = student ;
		this.totalScore = totalScore;
		this.maxScore = maxScore;
    }

    public double grade() {
		return (double) this.totalScore / this.maxScore;
    }
}
