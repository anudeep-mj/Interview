package testPackage;

import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.Handler;
import org.owasp.html.HtmlSanitizer;
import org.owasp.html.HtmlStreamEventReceiver;
import org.owasp.html.HtmlStreamRenderer;
import org.owasp.html.PolicyFactory;
import org.owasp.html.Sanitizers;

public class testing {
	
	  public void sanit()
	  {
		  PolicyFactory sanitizer = Sanitizers.FORMATTING.and(Sanitizers.BLOCKS);
		  String cleanResults = sanitizer.sanitize("<p>Hello, <b>World!</b>");
		  System.out.println(cleanResults);
	  }
	  
	  public void main()
	  {
		  sanit();
	  }

}
