package cloudstudying;

public class pratice39 {

	public static void main(String[] args) {
 
		String [] cores = {"�ڹ�","�ڷᱸ��","�˰�����","�����ͺ��̽�"};
		String [] electives = {"��ǻ�� ��Ʈ��ũ", "�ü��", "����Ʈ�������"};
		String [] generals = {"����ȸȭ","������","���۹�","����ũ","��������"};
		
		for(int i = 0; i < cores.length; i++) {
			if( i == 0) {
				System.out.print("�ٽɰ��� : ");
			}
			System.out.printf( "%s ", cores[i]);
			
		}
		for(int i = 0; i < electives.length; i++) {
			if( i == 0) {
				System.out.print("\n���ð��� : ");
			}
			System.out.printf( "%s ", electives[i]);
			
		}
		for(int i = 0; i < generals.length; i++) {
			if( i == 0) {
				System.out.print("\n������� : ");
			}
			System.out.printf( "%s ", generals[i]);
			
		}
	}

}