package cloudstudying;

public class pratice22 {
	  public static void main(String[] args) {
	    // ���� ����
	    double tomVocal = 8.8;
	    double tomDance = 7.6;
	    double kateVocal = 9.2;
	    double kateDance = 7.8;
	    
	    // ��� ���
	    System.out.printf("Tom�� ����� ���: %s\n", result(tomVocal, tomDance));
	    System.out.printf("Kate�� ����� ���: %s\n", result(kateVocal, kateDance));
	  }

	  // ���ð� �� ������ ���� ��� ���ڿ��� ��ȯ
	  public static String result(double vocal, double dance) {
	    return ((vocal * dance) >=70) ? "�հ�": "���հ�";
	  }  
	}
//���� �������� ����
//(���ǽ�) ? ���� ��ȯ�� :  ������ ��ȯ��;
//string result = (score >= 60) ? "Passed" : "Failed";
