package homework;
//
public class HW2 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=2;i<=100;i++){ 
		Julie:
		for(j=2;j<i;j++){
			if( i % j == 0){
				System.out.println("i = "+ i + " , j = " + j + " ; " + i + "非質數");
				break Julie;
				}
			else{
				continue Julie;
				if( j=i-1 ){
					break;
					}
				else{
					System.out.println("i = "+ i + " , j = " + j + " ; " + i + "質數");
				}
				
				}
		
			
			}
		}
	}


}
