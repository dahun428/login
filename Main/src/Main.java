
public class Main {

	public void sum(int a, int b) {
		
		int sum = 0, odd =0, even = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
			if( i%2 == 0) {
				even += i;
				
			}
			else
			{
				odd += i;
				
			}
			
			System.out.println( a + "~" + b + "������ �� : " + sum);
			System.out.println( a + "~" + b + "������ ¦���� : "+ even);
			System.out.println( a + "~" + b + "������ Ȧ�� �� : " + odd);
			
			
		}
		
	}

	
	public static void main(String[] args) {

		Main nes = null;
		nes = new Main();
		System.out.println(nes);
		nes.sum(0, 20);
		
	
		}
		
		
	}

