//外部类
public class MOuter {
 	
 	//外部类中的方法
 	//public void show(){
 	//	final int a=25;
 	//	int b=13;
 	//	//方法内部类
 	//		 class MInner {
 	//		 	int c=2;
 	//		 	public void print(){
 	//		 		System.out.println("访问外部类的方法中的变量a:"+a);
 	//		 		System.out.println("访问内部类中的变量b:"+b);
 	//		 		}
 	//		}
 	//		MInner mi=new MInner();//创建方法内部类的对象
 	//		mi.print();
 	//	}
 	//	
 	//	public static void main(String args[]){
 	//			MOuter mo=new MOuter();
 	//			mo.show();
 	//		}
 	

    
    private String name = "爱慕课";
    
    // 外部类中的show方法
    public void show() { 
		// 定义方法内部类
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        
		// 创建方法内部类的对象
        MInner mi=new MInner();
        
        // 调用内部类的方法
		int newScore=mi.getScore();
        
		System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
	}
    
	// 测试方法内部类
	public static void main(String[] args) {
        
		// 创建外部类的对象
        MOuter mo=new MOuter();
        
        // 调用外部类的方法
		mo.show();
	}

}