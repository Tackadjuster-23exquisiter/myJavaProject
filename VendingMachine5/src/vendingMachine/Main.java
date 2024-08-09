package vendingMachine;

import mypkg.VendingMachine;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int no=0,charge;

		VendingMachine myjihanki=new VendingMachine();	//インスタンス

		while(no !=9) {
			no=myjihanki.saleStart();			//販売開始とドリンク選択

			if(no<=3) {
				charge=myjihanki.inputMoney(no);	//お金の投入
				myjihanki.outputDrink(no,charge);	//ドリンク排出と釣銭表示
			}
			else if(no==5) {			//売上管理
				myjihanki.dispUriage();
			}
			else if(no==6) {
				myjihanki.dispChange();
			}
			else if(no==7) {
				myjihanki.plusChange();
			}
			else if(no==8) {
				myjihanki.plusStock();
			}
		}
		//System.out.println("販売を終了します。");
		myjihanki.saleEnd();
	}
}