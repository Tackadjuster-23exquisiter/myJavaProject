package mypkg;

public class Fare {
	private String[] inboundStation = {"仙台","福島","宇都宮","大宮","東京"};
	private String[] outboundStation = {"盛岡","八戸","新青森"};
	private int[] inboundExp = {3110,3990,4740,5270,5480};//上り特急料金
	private int[] outboundExp = {2360,3110,3990};//下り特急料金
	private int[] inboundTicket = {2270,3670,6260,7340,7880};//上り乗車券
	private int[] outboundTicket = {840,2590,4000};//下り乗車券
	
	int expCharge;
	int ticketCharge;

	public int checkFare(String dest) {
		int i = 0;
		int flg = 0;
		int fare = 0;
		
		if(inboundStation[i].equals(dest)) {
			while(i<inboundStation.length && flg == 0){
				if(inboundStation[i].equals(dest)) {
					flg+=1;
				}
				else {
					i++;
				}
			}
			if(flg > 0) {
				expCharge = inboundExp[i];
				ticketCharge = inboundTicket[i];
				fare = inboundExp[i]+inboundTicket[i];
				return  fare;	//特急料金+乗車券を返す
			}
		}
		else {
			while(i<outboundStation.length && flg == 0){
				if(outboundStation[i].equals(dest)) {
					flg+=1;
				}
				else {
					i++;
				}
			}
			if(flg > 0) {
				expCharge = outboundExp[i];
				ticketCharge = outboundTicket[i];
				fare = outboundExp[i]+outboundTicket[i];
				return fare;	//特急料金+乗車券を返す
			}
		}
		if(flg == 0) {
			return -1;					//見つからないとき
		}
		return fare;
	}
	public int getExpCharge() {		//特急料金 
		return expCharge;
	}
	public int getTicketCharge() {		//乗車券
		return ticketCharge;
	}
}