//�ⲿ��
public class MOuter {
 	
 	//�ⲿ���еķ���
 	//public void show(){
 	//	final int a=25;
 	//	int b=13;
 	//	//�����ڲ���
 	//		 class MInner {
 	//		 	int c=2;
 	//		 	public void print(){
 	//		 		System.out.println("�����ⲿ��ķ����еı���a:"+a);
 	//		 		System.out.println("�����ڲ����еı���b:"+b);
 	//		 		}
 	//		}
 	//		MInner mi=new MInner();//���������ڲ���Ķ���
 	//		mi.print();
 	//	}
 	//	
 	//	public static void main(String args[]){
 	//			MOuter mo=new MOuter();
 	//			mo.show();
 	//		}
 	

    
    private String name = "��Ľ��";
    
    // �ⲿ���е�show����
    public void show() { 
		// ���巽���ڲ���
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        
		// ���������ڲ���Ķ���
        MInner mi=new MInner();
        
        // �����ڲ���ķ���
		int newScore=mi.getScore();
        
		System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + newScore);
	}
    
	// ���Է����ڲ���
	public static void main(String[] args) {
        
		// �����ⲿ��Ķ���
        MOuter mo=new MOuter();
        
        // �����ⲿ��ķ���
		mo.show();
	}

}