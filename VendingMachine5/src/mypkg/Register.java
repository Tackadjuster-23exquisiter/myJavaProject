package mypkg;

public class Register {
	int m100;		 // 釣銭100円枚数
	int m10; 		// 釣銭10円枚数
	int total;		//売上合計
	int stock;

	Register(int s100,int s10){		//コンストラクタ
		m100 = s100;
		m10 = s10;
		total=0;
	}
	public int getM100() { // ゲッター 100円の枚数を返す
		return m100;
	}
	public int  getM10() {		// getM10(), setM100(), setM10()を追加
		return m10;
	}
	public void setM100(int add) {
		m100=add;
	}
	public void setM10(int add) {
		m10=add;
	}

	public void plusTotal(int m) {		//売上加算　mはドリンクの単価
		total+=m;
	}
	public int getTotal() {			//売上合計を返す
		return total;
	}
	public void RegiInitialization(){	//値の初期化
		m100=0;
		m10=0;
		total=0;
	}
	public void decChange(int c) { 	// 釣銭の枚数を更新 cは釣銭金額
		m100 = m100 - c/100;
		m10 = m10 - (c%100)/10;
		}
}