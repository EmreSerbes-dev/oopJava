package oop_Odev;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", 0); //�lk kursu tan�ml�yor        
		CourseManager courseManage = new CourseManager();
		courseManage.addToUsersCourse(course1); // //Tan�mlanan kursu kurslara ekliyor
		
		Courses course2 = new Courses(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demiro�", 0); // 2. kurslar� ekliyor
		CourseManager courseManage2 = new CourseManager(); 
		courseManage2.addToUsersCourse(course2); // Tan�mlanan 2. kursu kurslara ekliyor
		
		Categories category1 = new Categories(1, "Yaz�l�m"); // �lk kategori eklendi		
		CategoryManager categoryManage = new CategoryManager();
		categoryManage.addToUsersCategorys(category1); //Tan�mlanan kategoriyi kategorilere ekliyor
		
		Educators educator1 = new Educators("Engin Demiro�");
		EducatorManager educatorManage = new EducatorManager();
		educatorManage.addToUsersEducators(educator1);
	}

}
