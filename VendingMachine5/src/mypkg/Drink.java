package mypkg;

public class Drink {
	String name;	//ドリンク名
	int price;		//価格
	int stock;		//在庫数

	Drink(String na,int pri,int zaiko){			//コンストラクタ
		name=na;
		price=pri;
		stock=zaiko;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getStock() {
		stock-=1;
		return stock;
	}
	public void plusStock(int s) {
		stock+=s;
	}
	public void dispDrink() {
		System.out.print(name+" "+price+"円 "+"("+stock+"本) ");
	}
}