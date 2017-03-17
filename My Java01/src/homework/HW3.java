package homework;

public class HW3 {
	public static void main(String[] args) {
		int i,j;
		for(i=2;i<=100;i++){ 
			static boolean prime(int i) {
				boolean prime = true;
				Julie:
					for(j=2;j<i;j++){
						if( i % j == 0){
							System.out.println("i = "+ i + " , j = " + j + " ; " + i + "«D½è¼Æ");
							prime = false;
							break Julie;
							}
						else{
							continue Julie;
							}
						}
				return prime;
			}
		}
	}
}
