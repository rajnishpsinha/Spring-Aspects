package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Accountserviceaspect {
@Before(value = "execution(* accountservice.Accountserviceimpl.*(..))") 
	public void beforeAdvice()
{System.out.println("Before advice method running");}
@After (value ="execution(* accountservice.Accountserviceimpl.*(..))")
public void afterAdvice()
{System.out.println("After advice method running");}

}
