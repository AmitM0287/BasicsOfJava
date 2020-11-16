package practice_problems;

public class P_05_ObjCountUsingStaticKey {
	static int count = 0;
	
	P_05_ObjCountUsingStaticKey(){
		count++;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		P_05_ObjCountUsingStaticKey obj1 = new P_05_ObjCountUsingStaticKey();
		P_05_ObjCountUsingStaticKey obj2 = new P_05_ObjCountUsingStaticKey();
		P_05_ObjCountUsingStaticKey obj3 = new P_05_ObjCountUsingStaticKey();
		P_05_ObjCountUsingStaticKey obj4 = new P_05_ObjCountUsingStaticKey();
		
		System.out.println(count);
	}

}
