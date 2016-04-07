package fibbonaci;
import javax.swing.*;
public class feebles {

	public static void main(String[] args) {		
	long a=1;
	long b=1;
	long c=0;
	
	
	
	String out="";{
	String timesstr = JOptionPane.showInputDialog("Wanted number");
	int times = Integer.parseInt(timesstr);
	
		while ( times >1)
			{
			if (times>47){
				System.out.println ("CRASH PREVENTION SYSTEM ACTIVATED");
				JOptionPane.showMessageDialog(null,"CRASH PREVENTION SYSTEM ACTIVATED" );
				System.exit(0);
			}
			c=a+b;
			a=b;
			b=c;
			c=0;
			times=times-1;
			}
		
			out="" + b;
			System.out.println(out);
			JOptionPane.showMessageDialog(null,out);
					
		}
	}	

		// TODO Auto-generated method stub

	}


