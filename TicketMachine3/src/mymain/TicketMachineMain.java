package mymain;

import mypkg.TicketMachine;

public class TicketMachine27 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		TicketMachine kitakamiStation = new TicketMachine();
		String dest;	//目的地
		
		dest = kitakamiStation.inputDestination();			//目的地入力
		
		kitakamiStation.dispFare(dest);						//運賃表示
	}
}