public class Outer{
		private int a=99;
		public class Inner {
		 	int b=2;
		 	public void test(){
		 			System.out.println("�����ⲿ���е�a��"+a);
		 			System.out.println("�����ڲ����е�b��"+b);
		 		}
		}
		public static void main(String args[]){
				Outer o=new Outer();
				Inner i=o.new Inner();
				i.test();			
			}
	}