
public class DataRunner {

	public static void main(String[] args) {
		int a[]={10, 20, 30, 40, 50};
		int b[]= {10, 20};
		DataSet d = new DataSet(a, 10, 50);
		DataSet e = new DataSet(b, 10, 10);
		int answer = d.getSum();
		int answerb = e.getSum();
		System.out.println(answer);
		System.out.println(answerb);

	}

}
