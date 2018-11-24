
public class Database {
		Programme programme;
		Course ccourse;
		Person individual;
		
		Database()
		{
			Programme programme = new Programme();
			Course ccourse = new Course();
			Person individual = new Person();
		}
		
		Database(Programme progrme, Course crse, Person idvl )
		{
			programme = progrme;
			ccourse = crse;
			individual = idvl;
		}
		
		Database(Database dataobj)
		{
			programme = dataobj.programme;
			ccourse = dataobj.ccourse;
			individual = dataobj.individual;
		}
		
		public void setProgramme(Programme progrme)
		{
			programme = progrme;
		}
		
		public Programme getProgramme()
		{
			return programme;
		}
		
		
		public void setCourse(Course crse)
		{
			ccourse= crse;
		}
		
		public Course getCourse()
		{
			return ccourse;
		}
		
		
		public void setPerson(Person idvl)
		{
			individual = idvl;
		}
		
		public Person getPerson()
		{
			return individual;
		}
		
		public void display()
		{
			System.out.println("Programme : " +programme);
			System.out.println("Course : " +ccourse);
			System.out.println("Student/Staff Information : " +individual);
			
		}
		
		

}
