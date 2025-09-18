package Startfrom0;

 class BankAcc {
      private long accno;
      private double balance;
      
      public void setacc (long accno) {
    	  this.accno=accno;
      }
      public long getacc() {
    	  return accno;
      }
      public double getbal() {
    	  return balance;
      }
      public void deposit (double deposit) {
    	  if(deposit>0) {
    		this.balance+=deposit;
    	  }else {
    		 throw new IllegalArgumentException("check the deposited amount");
    	  }
      }
      public void withdraw (double withdraw) {
    	  if(withdraw > 0 && withdraw <=balance) {
    		  balance -= withdraw;
    	  }else {
    		  System.out.println("no should more than 0 and equal to balance amount");
    	  }
      }
      
	public static void main(String[] args) {

   BankAcc obj=new BankAcc();
    obj.setacc(1025200366);
    System.out.println("Mr.Jagath Your Account number is :"+obj.accno);
  obj.deposit(500000);
  System.out.println("     Mr.Jagath Your Account balance is :"+obj.getbal());
  obj.withdraw(25000);
  System.out.println("        Mr.Jagath it is a your Account balane after withdraw :"+obj.getbal());
	}

}
