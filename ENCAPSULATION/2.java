import java.util.*;
public class TestEncapsulation {  
public static void main(String[] args) {  
   
    Account acc=new Account();  
    
    acc.setAcc_no(7560504000L);  
    acc.setName("DEEPA");  
    acc.setEmail("DEEPOOA@gmail.com");  
    acc.setAmount(800000f);  
  
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
}  
}  
