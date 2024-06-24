public class Binomial_coefficient {
  // calculate the factorial number:-
  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static int bin_coeff(int n, int r) {
    int n_Fact = factorial(n);
    int r_Fact = factorial(r);
    int n_r_Fact = factorial(n - r);
    int BC = n_Fact / (r_Fact * n_r_Fact);
    return BC;
  }

  public static void main(String args[]) {
    System.out.println("Binomial Coefficient is: " + bin_coeff(5, 2));
  }
}
