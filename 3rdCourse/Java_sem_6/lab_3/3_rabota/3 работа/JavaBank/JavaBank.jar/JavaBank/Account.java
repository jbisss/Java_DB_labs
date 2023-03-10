package JavaBank;

import JavaBankOld.AbstractBankAccount;

public class Account extends AbstractBankAccount {

	private int bonusValue;
	    public Account(String name, int num,int amt)
	    {
	            super(name,num,amt+calculateInitialBonusValue(amt));
	    }

	    //make a deposit to the balance
		public void deposit(int amt){
			if(amt>100){
				balance+=amt+(int)(bonusValue*0.1);
			}else{
				balance+=amt;
			}
		}
	    //make a withdrawal from the balance

	@Override
	public int getBalance() {
		return this.balance;
	}

	@Override
	public String getBankName() {
		return this.BANK;
	}

	//modifier to set the accountname
	    public void setaccountname(String name)
	    {
	    	    accountName = name;
	    }
	  //modifier to set the accountnumber
	    public void setaccountnum(int num)
	    {
	    	    accountNum = num;
	    }
	  //modifier to set the balance
	    public void setbalance(int num)
	    {
	    	    balance = num;
	    }
	  //accessor to get the accountname
	    public String getaccountname ( ) {
	    	 
	    	return accountName;
	    }
	    
	  //accessor to get the accountnumber
	    public int getaccountnum ( ) {
	   	 
	    	return accountNum;
	    }
	  //accessor to get the account balance
	    public int getbalance ( ) {
	      	 
	    	return balance;
	    }

		private static int calculateInitialBonusValue(int amt){
			if(amt>=1 && amt<=100){
				return 10;
			}
			else if(amt<=100){
				return 20;
			}
			else{
				return 30;
			}
		}
	}