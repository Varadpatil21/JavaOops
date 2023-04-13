package ABC;


import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    Book b=new Book();
	    Magazine m=new Magazine();
	    int choice,k;
	    do {
	    	System.out.println("-------Welcome to libarary--------------");
	    	System.out.println("\n1.Book \n2.Magazine \n3.Exit");
	    	System.out.println("Enter your choice:");
	    	choice=input.nextInt();
	    	switch(choice) {
	    	case 1:
	    		System.out.println("Book data\n");
	    	    System.out.println("1.read book");
	    	    System.out.println("\n2.display book");
	    	    System.out.println("\n3.sale book");
	    	    System.out.println("\n4.order book");
	    	    System.out.println("Enter your choice:");
	    	    choice=input.nextInt();
	    	    switch(choice) {
	    	       case 1:
	    	    	   b.getdata();
	    	       break;
	    	       case 2: b.display();
	    	       break;
	    	       case 3:System.out.println("Enetr no. of books:");
	    	       choice=input.nextInt();
	    	    	   b.salecopy(choice);
	    	    	   break;
	    	       case 4:System.out.println("Enter order copies:");
	    	       choice=input.nextInt();
    	    	   b.getcopies();
    	    	   break;
	    	       
	    	       }
	    	       break;
	    	      
	    	case 2:System.out.println("magazine data\n");
 	       		System.out.println("1.read magazine");
 	       		System.out.println("\n2.display magazine");
 	       		System.out.println("\n3.sale magazine");
 	       		System.out.println("\n4.order magazine");
 	       		System.out.println("\n5.get issued date");
 	       		System.out.println("Enter your choice:");
 	       choice=input.nextInt();
 	       switch(choice) {
 	       case 1:m.getdata();
 	       break;
 	       case 2:m.display();
 	       break;
 	       case 3:System.out.println("Enetr no. of books:");
 	       choice=input.nextInt();
 	    	   b.salecopy(choice);
 	    	   break;
 	       case 4:System.out.println("Enter order copies:");
 	       choice=input.nextInt();
	    	   b.getcopies();
	    	   break;
 	     //  case 5: m.receive_issue();
 	       //break;
 	       }
	    	
		    
		   
	    	}
	    	System.out.println("Do you want to continue:");
	    	k=input.nextInt();
	    }while(k==1);
	    
	   

	}

}
class Publication{
	private String title;
    private int price;
	private int copies;
	private int total;
		
		Scanner input=new Scanner(System.in);
		public void settitle(String title){
			this.title=title;
		}
		public void setcopies(int copies){
			this.copies=copies;
		}
		public String gettitle() {
			return title;
		}
		public int getprice() {
			return price;
		}
		public int getcopies() {
			return copies;
		}
		public int gettotal() {
			return total;
		}
		public void getdata() {
			System.out.println("Enter the title:");
			title=input.nextLine();
			System.out.println("Enter the price:");
			price=input.nextInt();
			System.out.println("Enter the copies:");
			copies=input.nextInt();
		}
		public void display() {
			System.out.println("Title:" + title + "\nPrice:" + price + "\nCopies:" + copies);
		}
		public void salecopy(int number) {
			if(copies<=number) {
				copies=copies-number;
		        total=total+number*price;
		        System.out.println("Total price of sellcopies is:" + (number*price) );
		        }
			else {
				System.out.println("---------OUT of STOCK------------");
			}
			
		}
		
	}
	class Book extends Publication{
		private String author;
		
		public void ordercopies(int number) {
			int x=getcopies()+number;
			setcopies(x);
			System.out.println("Copies:" + x);
			
		}
		
		void getBook() {
			getdata();
			System.out.println("Enter author name:");
			author=input.next();
		}
		void display_book() {
			display();
			System.out.println("author Name:" + author);
		}
		
	}
	class Magazine extends Publication{
		int orderquantity;
		String issue_date;
		void receive_issue(String new_issue_date) {
			System.out.println("Enter new copies to be ordered:");
			orderquantity=input.nextInt();
			setcopies(orderquantity);
			issue_date=new_issue_date;
			System.out.println("\t The Magazine "+ gettitle()+"\n\t with issue date"+ issue_date +"available");
			
		}
		void getMagazine() {
			getdata();
			System.out.println("Enter the current issue Date[DD/MM/YYYY]:");
			issue_date=input.next();
		}
		void display_magazine() {
			display();
			System.out.println("date:" + issue_date);
		}
		
		
		
	}
