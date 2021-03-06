/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Dell
 */
public class BusinessAccount extends Account {
    private Double loanLimit;
    
    public BusinessAccount(){
    }

    public BusinessAccount(Double loanLimit, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
     @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
    
}
