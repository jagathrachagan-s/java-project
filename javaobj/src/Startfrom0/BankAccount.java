package Startfrom0;

 class BankAccount {
        private int accnum;
        private double balance;
     public void setacc(int accnum ) {
        	this.accnum=accnum;
        }
     public int getacc() {
    	 return accnum;
     }
    
     public double getbal() {
    	
    	 return balance;
     }
     public void deposit(double deposit)
     {
    	 if(deposit>0)
    	 {
    		 this.balance+=deposit;
    	 }
    	 else {
    		 System.out.println("outra");
    	 }
     }
     public void withdraw(double withdraw) {
    	 if(withdraw > 0 && withdraw <=balance) {
    		 this.balance -= withdraw;
    	 }else {
    		 System.out.println("balance is insuficient");
    	 }
     }
     
     
public static void main(String []args) {
	BankAccount obj=new BankAccount();
	obj.setacc(2003);
	System.out.println("MY AC NO:"+obj.getacc());
	System.out.println(obj.getbal());
	obj.deposit(100);
	System.out.println(obj.getbal());
	obj.withdraw(50);
	System.out.println(obj.getbal());
	obj.deposit(1000);
	System.out.println(obj.getbal());
	
	
	
	
	
}

}
