package accountservice;

import org.springframework.stereotype.Service;

import model.Account;
@Service("accountservice")
public class Accountserviceimpl implements Accountservice {
/* (non-Javadoc)
 * @see accountservice.Accountservice#showAccountDetails(model.Account)
 */
@Override
public void showAccountDetails(Account account)
{
	System.out.println(" Account number"+account.getAccount_number()+" Account balance: "+account.getAccount_balance());
	
	
	}
}
