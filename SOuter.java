public class SOuter {
 	private int a=99;//外部类的私有变量
 	static int b=1;//外部类的静态变量
 	
 	//静态内部类
 	public static class SInner{
 			int b=2;
 			public void test(){
 				System.out.println("访问外部类中的a:"+SOuter.this.a);
 					System.out.println("访问外部类中的b:"+SOuter.b);
 					System.out.println("访问内部类中的b:"+b);
 				}
 		}
 		
 		public static void main(String args[]){
 				SInner si=new SInner();//直接创建内部类的对象
 				si.test();//调用test方法
 			}
}