public class SOuter {
 	private int a=99;//�ⲿ���˽�б���
 	static int b=1;//�ⲿ��ľ�̬����
 	
 	//��̬�ڲ���
 	public static class SInner{
 			int b=2;
 			public void test(){
 				System.out.println("�����ⲿ���е�a:"+SOuter.this.a);
 					System.out.println("�����ⲿ���е�b:"+SOuter.b);
 					System.out.println("�����ڲ����е�b:"+b);
 				}
 		}
 		
 		public static void main(String args[]){
 				SInner si=new SInner();//ֱ�Ӵ����ڲ���Ķ���
 				si.test();//����test����
 			}
}