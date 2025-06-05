package Models;

public class FillFormListModel {
	public enum Users
	{
	    Billy,
	    Juan,
	    Miguel
	}
	
	public String FirstName;
	public String LastName;
	public String UserEmail;
	public String TelephoneNumber;
	public String DateBirth;
	public String Subject;
	public String Gender;
	public String Hobbie;
	
	public FillFormListModel(String firstName, String lastName, String userEmail, String telephoneNumber, 
            String dateBirth, String subject, String gender, String hobbie)
	{
			this.FirstName = firstName;
			this.LastName = lastName;
			this.UserEmail = userEmail;
			this.TelephoneNumber = telephoneNumber;
			this.DateBirth = dateBirth;
			this.Subject = subject;
			this.Gender = gender;
			this.Hobbie = hobbie;
}
}
