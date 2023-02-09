import java.lang.Math;

class PasswordGenerator {   
  private static int counter = 0;    
  private String pre = "A";    
  private int num = 0;        
   
  public PasswordGenerator(int number, String prefix) {        
    num = number;        
    pre = prefix;    
  }    
     
  public PasswordGenerator(int number) {        
    num = number;    
  }    
  
  public String pwGen() {        
    String password = pre + ".";        
    password += randomNum(num);        
    counter++;        
    return password;    
  }    
  
  private String randomNum(int digits) {        
    String randomNum = "";        
    for (int i = 0; i < digits; i++) {            
      randomNum += Integer.toString((int)(Math.random() * 10));
    }
    return randomNum;
  }

  public int pwCount() {
    return counter;
  }
}