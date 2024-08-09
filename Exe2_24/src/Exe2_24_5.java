
public class Exe2_24_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i,j;
		int ninzu[]=new int[5];
		int[] tensu = {85, 78, 69, 45, 72, 88, 69, 55, 13, 66,
						23, 63, 56, 87, 77, 90, 74, 50, 71, 30};

		   for ( i = 0; i < ninzu[i]; i++) {
			      for (j = 0; j <tensu.length; j++) {
			        if (i >= (20 - tensu[j])) {
			          System.out.print('*');
			        } else {
			          System.out.print(' ');
			        }
			        if (j == ( ninzu.length- 1)) {
			          System.out.println();
			        } else {
			          System.out.print(' ');
			        }
			      }
			    }
			    for (i = 0; i <ninzu.length; i++) {
			      System.out.print('-');
			      if (i == ninzu.length- 1) {
			        System.out.println();
			      } else {
			        System.out.print('-');
			      }
			    }
				for(i=0;i<ninzu.length;i++) {
					ninzu[i]=0;
				}
				for(i=0;i<tensu.length;i++) {
					ninzu[tensu[i]/20]++;
				}
			    for (i = 0; i < ninzu.length; i++) {
			    	if(i<4) {
			      System.out.print((i * 20)+"-"+(i*20+19)+" ");
			      }
			    	else {
			    		System.out.print((i * 20)+"-"+(i+1)*20);
			    	}
					}
		}
	}