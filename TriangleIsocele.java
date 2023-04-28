package rebe;

public class TriangleIsocele {

	public static void main(String[] args) {
		// Triangle isocele  
		int n=7;
		for(int i=0;i<n;i++) {
			
			int space=(n-i);
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=2*i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Affichage d'un triangle équilateral
		int m=7;
		for(int i=0;i<m;i++) {
			for(int j=m;j>0;j--) {
				if(i>=j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
