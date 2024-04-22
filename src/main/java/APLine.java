public class APLine
{
  private int a, b, c;
  public APLine(int aVal, int bVal, int cVal){
    aVal = a;
    bVal = b;
    cVal = c;
  }
  public double getSlope(){
    return -(double)a/b;
  }
  public boolean isOnLines(int x, int y){
    return a*x + b*y + c ==0;
  }
}
