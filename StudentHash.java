package student;


	import java.util.HashSet;
	import java.util.Iterator;

	class Student//default constructor
	{
	    String name;
	 // String will refer set of characters
	    int rollNo;
	 //int is datatype which consists of integer
	    String department;
	 
	    public Student(String name, int rollNo, String department)
	    //parameterized constructor
	    {
	        this.name = name;
	 //this will refer current object 
	        this.rollNo = rollNo;
	 
	        this.department = department;
	    }
	 
	    @Override
	    public int hashCode()
	   //hashCode() method which digest the data stored in a instance of the class
	    {
	        return rollNo;
	        //return the value
	    }
	 
	    @Override
	    public boolean equals(Object obj)
	    //This method checks if some other object passed to it as an argument is equal to the object on which this method is invoked.
	    {
	        Student student = (Student) obj;
	        //This method is used to compare two objects.
	        return (rollNo == student.rollNo);
	    }
	 
	    @Override
	    //This method returns itself a string.
	    public String toString()
	    {
	        return rollNo+", "+name+", "+department;
	    }
	}
	 
	public class StudentHash
	
	{
	    public static void main(String[] args)
	   
	    {
	       //creating the object
	    	HashSet<Student> set = new HashSet<Student>();
	 
	        //Adding elements to HashSet
	        //set is an interface which extends Collection 
	        //add method inserts the specified element E at the specified position in this list.
	        set.add(new Student("vishwas", 111, "ECE"));
	 
	        set.add(new Student("durga", 141, "EEE"));
	 
	        set.add(new Student("abimanyu", 112, "Civil"));
	 
	        set.add(new Student("Suresh", 300, "IT"));
	 
	        set.add(new Student("Vikram", 450, "CS"));
	 
	        set.add(new Student("Bharat", 331, "IT"));
	 
	        set.add(new Student("Amit", 121, "IT"));          
	        //duplicate element
	 
	        set.add(new Student("Bhavya", 234, "ECE"));
	 
	        set.add(new Student("sanju", 341, "CS"));       
	        //duplicate element
	 
	        set.add(new Student("rahul", 455, "Civil"));
	 
	        //Iterating through HashSet
	        //Iterators are used in Collection framework in Java
	        Iterator<Student> it = set.iterator();
	      //while loop is used to iterate a part of the program several times
	        while (it.hasNext())
	        {
	        	//creating the object
	            Student student = (Student) it.next();
	          
		          
	            System.out.println(student);
	        }
	    }
	}
