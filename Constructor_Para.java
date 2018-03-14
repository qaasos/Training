package EvenNumber;

 class Constructor_Para
{
	
int id;
String name;

Constructor_Para(int i,String n) {
	id =i;
	name = n;
	}

void display(){
	System.out.println(id +""+ name);
	
}



	public static void main(String[] args) {
		Constructor_Para s1 = new Constructor_Para(111, "Karan");
		Constructor_Para s2 = new Constructor_Para (112, "Kiran");
	
	s1.display();
	s2.display(); 

	}
}


