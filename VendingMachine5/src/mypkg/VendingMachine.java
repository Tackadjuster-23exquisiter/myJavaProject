package mypkg;

import java.util.Scanner;

public class VendingMachine {
	Drink cola=new Drink("コーラ",150,10);
	Drink orange=new Drink("オレンジジュース",160,10);
	Drink tea=new Drink("お茶",120,10);

	Register regi=new Register(50,100);

	Scanner scan;

	int stock;

	public VendingMachine(){				 //コンストラクタ
		System.out.println("いらっしゃいませ！");
		System.out.println("以下のドリンクを販売しています。");
		scan=new Scanner(System.in);
	}
	public int saleStart() {		//販売開始
		int no;
		System.out.println();
		System.out.print("①");
		cola.dispDrink();
		System.out.print("②");
		orange.dispDrink();
		System.out.print("③");
		tea.dispDrink();
		System.out.println();
		System.out.print("  "+"(管理メニュー ⑤売上確認 ⑥釣銭確認 ⑦釣銭補充 ⑧在庫補充 ⑨販売終了)");
		System.out.println();
		System.out.println("どのドリンクを買われますか？番号を入力してください。");
		System.out.print("➔");

		//Scanner scan=new Scanner(System.in);
		no=scan.nextInt();
		return no;
	}
	public int inputMoney(int no) {
		int charge;
		switch(no) {
		case 1:
			System.out.println();
			System.out.println("コーラですね。");
			break;
		case 2:
			System.out.println();
			System.out.println("オレンジジュースですね。");
			break;
		case 3:
			System.out.println();
			System.out.println("お茶ですね。");
			break;
		case 9:
				System.out.println();
				System.out.println("販売を終了します。");
		}
		System.out.println("お金を投入してください。");
		System.out.print("➔");

		//Scanner scan=new Scanner(System.in);
		charge=scan.nextInt();
		return charge;
	}
	public void outputDrink(int no,int charge) {//chargeは投入金額
		int price=0,change;

		System.out.println();
		System.out.print("お買い上げありがとうございます。");
		switch(no) {
		case 1:
			System.out.println("コーラを排出します。");
			price=cola.getPrice();
			stock=cola.getStock();
			break;
		case 2:
			System.out.println("オレンジジュースを排出します");
			price=orange.getPrice();
			stock=orange.getStock();
			break;
		case 3:
			System.out.println("お茶を排出します。");
			price=tea.getPrice();
			stock=tea.getStock();
			break;
		}
		change=charge-price;
		System.out.println("お釣りは"+change+"円です。");
		regi.plusTotal(price);
		regi.decChange(change);
	}
	public void dispUriage() {
		int total;

		total=regi.getTotal();

		System.out.println("売上合計は"+total+"円です。");
	}
	public void dispChange() {		//釣銭の残枚数表示
		System.out.println("釣銭の100円は"+regi.getM100()+"枚残っています。");
		System.out.println("釣銭の10円は"+regi.getM10()+"枚残っています。");
	}
	public void plusChange() {		//釣銭の補充
		int n;

		System.out.println();
		System.out.println("釣銭100円の補充");
		System.out.print("➔");
		n=scan.nextInt();
		regi.setM100(n);

		System.out.println("釣銭10円の補充");
		System.out.print("➔");
		n=scan.nextInt();
		regi.setM10(n);
	}
	public void plusStock() {		//在庫の補充
		int n;

		System.out.println();
		System.out.println("コーラの追加本数");
		System.out.print("➔");
		n=scan.nextInt();
		cola.plusStock(n);

		System.out.println("オレンジジュースの追加本数");
		System.out.print("➔");
		n=scan.nextInt();
		orange.plusStock(n);

		System.out.println("お茶の追加本数");
		System.out.print("➔");
		n=scan.nextInt();
		tea.plusStock(n);
	}
	public void saleEnd() {
		System.out.println();
		System.out.println("販売を終了します。");
		scan.close();
	}
}