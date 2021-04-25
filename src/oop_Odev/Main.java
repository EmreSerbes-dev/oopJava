package oop_Odev;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", 0); //Ýlk kursu tanýmlýyor        
		CourseManager courseManage = new CourseManager();
		courseManage.addToUsersCourse(course1); // //Tanýmlanan kursu kurslara ekliyor
		
		Courses course2 = new Courses(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demiroð", 0); // 2. kurslarý ekliyor
		CourseManager courseManage2 = new CourseManager(); 
		courseManage2.addToUsersCourse(course2); // Tanýmlanan 2. kursu kurslara ekliyor
		
		Categories category1 = new Categories(1, "Yazýlým"); // Ýlk kategori eklendi		
		CategoryManager categoryManage = new CategoryManager();
		categoryManage.addToUsersCategorys(category1); //Tanýmlanan kategoriyi kategorilere ekliyor
		
		Educators educator1 = new Educators("Engin Demiroð");
		EducatorManager educatorManage = new EducatorManager();
		educatorManage.addToUsersEducators(educator1);
	}

}
