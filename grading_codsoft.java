package codsoft;
import java.util.*;
public class grading_codsoft {
	
	public static float final_per(int score) {
		float scr=score/4;
		return scr;
	}
	public static float get_marks() {
		Scanner sc=new Scanner(System.in);
		
		int eng,math,dsa,comp_net;
		String name_stud;
		int sum=0;
		float per;
		
		System.out.println("Enter your name:");//get student name
		name_stud=sc.next();
		System.out.println("Please provide your Marks of each subject <3 :");
		System.out.println("English ::");
		eng=sc.nextInt();
		System.out.println("MATH ::");
		math=sc.nextInt();
		System.out.println("DSA ::");
		dsa=sc.nextInt();
		System.out.println("COMPUTER NETWORK ::");
		comp_net=sc.nextInt();
		
		sum=eng+math+dsa+comp_net;
		System.out.println("Your Total Marks out of 400 ::\t "+sum);
		
		
		per=final_per(sum);
		System.out.println("FINAL Percentage is :: "+per);
		
		return per;
	}
	public void grades(float gr) {
		float gr1=gr;
		
		if(gr1<0 || gr1>100)
	    {
			System.out.println("Wrong Entry");
	    }
	    else if(gr1<50)
	    {
	    	System.out.println("Grade F");
	    }
	    else if(gr1>=50 && gr1<60)
	    {
	    	System.out.println("Grade D");
	    }
	    else if(gr1>=60 &&gr1<70)
	    {
	    	System.out.println("Grade C");
	    }
	    else if(gr1>=70 && gr1<80)
	    {
	    	System.out.println("Grade B");
	    }
	    else if(gr1>=80 &&gr1<90)
	    {
	    	System.out.println("Grade A");
	    }
	    else
	    {
	    	System.out.println("Grade A+");
	    }
		
	}

	public static void main(String[] args) {
		float gg;
		grading_codsoft gs=new grading_codsoft();
		gg=get_marks();
		 //static calling  using class name because static function can be called only with class name 
		gs.grades(gg);;
	}

}
