public class APLine
{
  private int a, b, c;
  public APLine(int aVal, int bVal, int cVal){
    a = aVal;
    b = bVal;
    c = cVal;
  }
  public double getSlope(){
    return -(double) a/b;
  }
  public boolean isOnLine(int x, int y){
    return a*x + b*y + c ==0;
  }
}
