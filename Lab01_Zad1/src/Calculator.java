public class Calculator {
	
	public int add(int l1, int l2){
		return l1 + l2;		
	}
	
	public int sub(int l1, int l2){
		return l1 - l2;		
	}
	
	public int multi(int l1, int l2){
		return l1 * l2;		
	}
	
	public int div(int l1, int l2){
		return l1 / l2;		
	}	
	
	public boolean greater(int l1, int l2){
		if (l1 > l2)
			return true;
		else return false;
	}
	
	public Calculator(){
		System.out.println("Calc: " + this);
	}
	
}
