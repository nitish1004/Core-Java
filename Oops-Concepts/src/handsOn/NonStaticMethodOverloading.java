package handsOn;
//Advantage of Overloading:-It benifits the end user that is i,e end user need not to remember many individuals methods
public class NonStaticMethodOverloading {
	int product(int x, int y) {
		   return x * y;
		  }
		  public static void main(String[] args) {
			  NonStaticMethodOverloading calcnew = new NonStaticMethodOverloading();
			  //calcnew.product(5, 3);
		   int ans = calcnew.product(5, 3); // call the non-static method
		   System.out.println(ans);
		  }
		}
