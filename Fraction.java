public class Fraction {
   private int num;
   private int den;
   private int gcf;
   
   public Fraction() {
     num = 0;
     den = 1;
   }
   
   public Fraction(int n, int d) {
     num = n;
     den = d;
   }
   
   public int getNum() {
     return num;
   }
   
   public int getDen() {
     return den;
   }
   
   public Fraction getReciprocal() {
     Fraction reciprocal = new Fraction(den, num);
     return reciprocal;
   }
   
   public void setValue(int n, int d) {
     num = n;
     den = d;
   }
   
   public double getValue() {
     return num/den;
   }
   
   public boolean equals(Fraction other) {
     return getValue() == other.getValue();
   }
   
   public void multiply(Fraction other) {
     setValue(num*other.getNum(), den*other.getDen());
   }
       
   public void divide(Fraction other) {
     setValue(num*other.getDen(), den*other.getNum());
   }
   
   public void add(Fraction other) {
     setValue(num*other.getDen() + (other.getNum() + den),den*other.getDen());
   }
   
   public void subtract(Fraction other) {
     setValue(num*other.getDen() + (other.getNum() + den),den*other.getDen());
   }
   
    public static int GCF() { 
       if (getNum()%getDen() == 0) 
         gcf = getNum(); 
       else 
         return (GCF(den, num % den)); 
     }
   
   public void simplify() {
    

   }
}
