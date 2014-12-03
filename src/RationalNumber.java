// Write a class called RationalNumber that represents a fraction with an integer numerator and denominator
public class RationalNumber
{
  int num;
  int denom;
  public RationalNumber()
  {
    num = 0;
    denom = 1;
  }
  public RationalNumber(int numerator, int denominator)
  {
    int gcd = GCD(numerator, denominator);
    num = numerator/gcd;
    denom = denominator/gcd;
    if(num == 0)
    {
      denom = 1;
    }
    else if(denom < 0)
    {
      denom = -denom;
      num = -num;
    }
  }
  public int GCD(int first, int second)
  {
    int temp;
    while (second != 0)
    {
      temp = second;
      second = first % second;
      first = temp;
    }
    return first;
  }
  public int LCM(int first, int second)
  {
    int lcm = (first * second)/GCD(first, second);
    return lcm;
  }
  public int getDenominator()
  {
    return denom;
  }
  public int getNumerator()
  {
    return num;
  }
  public String toString()
  {
    String s = num+"/"+denom;
    if(denom == 1)
    {
      s = " "+num;
    }
    return s;
  }
  public void add(RationalNumber frac)
  {
    int num2 = frac.getNumerator();
    int denom2 = frac.getDenominator();
    int num1 = denom2 * num;
    num2 = denom * num2;
    int denom3 = denom * denom2;
    int newnum = num2 + num1;
    int gcd = GCD(newnum, denom3);
    newnum = newnum/gcd;
    denom3 = denom3/gcd;
    num = newnum;
    denom = denom3;
  }
  public void subtract(RationalNumber frac)
  {
    int num2 = frac.getNumerator();
    int denom2 = frac.getDenominator();
    int num1 = denom2 * num;
    num2 = denom * num2;
    int denom3 = denom * denom2;
    int newnum = num1 - num2;
    int gcd = GCD(newnum, denom3);
    newnum = newnum/gcd;
    denom3 = denom3/gcd;
    num = newnum;
    denom = denom3;
  }
  public void multiply(RationalNumber frac)
  {
    int num2 = frac.getNumerator();
    int denom2 = frac.getDenominator();
    int num1 = num2 * num;
    denom2 = denom2  * denom;
    int gcd = GCD(num1, denom2);
    num1 = num1/gcd;
    denom2 = denom2/gcd;
    num = num1;
    denom = denom2;
  }
  public void divide(RationalNumber frac)
  {
    int num2 = frac.getNumerator();
    int denom2 = frac.getDenominator();
    int newnum = num * denom2;
    int denom3 = num2 * denom;
    int gcd = GCD(newnum, denom3);
    newnum = newnum/gcd;
    denom3 = denom3/gcd;
    num = newnum;
    denom = denom3;
  }
}
