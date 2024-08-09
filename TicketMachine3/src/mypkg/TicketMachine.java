package mypkg;
import java.util.Scanner;

public class TicketMachine {

	public String inputDestination() {		//行先の入力
		String dest;

		System.out.println("北上からの新幹線の切符を販売します。");
		System.out.println("行先はどこですか？");
		System.out.println("  "+"上り 仙台、福島、宇都宮、大宮、東京");
		System.out.println("  "+"下り  盛岡、八戸、新青森");
		System.out.println();
		System.out.print(">");

		Scanner scan = new Scanner(System.in);

		dest = scan.next();
		scan.close();

		return dest;
	}

	public void dispFare(String dest) {		//運賃の表示
		int charge;
		Fare train = new Fare();

		charge = train.checkFare(dest);//目的地迄の運賃計算

		if(charge>0) {
			System.out.println();
			System.out.println(dest + "までの乗車料金は運賃" +train.getTicketCharge()
								+"円、特急料金"+train.getExpCharge()+"円  合計"+charge+"円です。");
		}
		else {

			System.out.println("そのような駅はありません。");
		}
	}
}