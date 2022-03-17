/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmarks;

/**
 *
 * @author JUDITH
 */
import java.util.Scanner; 

public class StudentMarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  Scanner input = new Scanner(System.in);
  
               // Getting student first name input
        System.out.print("Enter the student first name: ");
        String studentFirstName = input.next();
        
               // Getting student second name input
        System.out.print("Enter the student second name: ");
        String studentSecondName = input.next();
        System.out.println();
    	
               // Getting subjects and marks input
        System.out.print("Enter the first subject name: ");
        String subjectName1 = input.next();
    	
        System.out.print( subjectName1 + " score: ");
        int marks1 = input.nextInt();
        
        System.out.print("Enter the second subject name: ");
        String subjectName2 = input.next();
    	
        System.out.print( subjectName2 + " score: ");
        int marks2 = input.nextInt();
        
        System.out.print("Enter the third subject name: ");
        String subjectName3 = input.next();
    	
        System.out.print( subjectName3 + " score: ");
        int marks3 = input.nextInt();
        
        System.out.print("Enter the forth subject name: ");
        String subjectName4 = input.next();
    	
        System.out.print( subjectName4 + " score: ");
        int marks4 = input.nextInt();
        
        System.out.print("Enter the fifth subject: ");
        String subjectName5 = input.next();
    	
        System.out.print( subjectName5 + " score: ");
        int marks5 = input.nextInt();
        System.out.println();
       
        
        //Giving the output

System.out.println(studentFirstName+"\t"+studentSecondName + " scored the grades below in their subjects:");  
System.out.println();

System.out.println(subjectName1+":" + marks1);  
 if(marks1 >=90) {
            System.out.println("Grade A");
        }else if (marks1 >= 70 && marks1 <= 89){
            System.out.println("Grade B");
        }else if (marks1 >=50 && marks1 <=69){
            System.out.println("Grade C");
        }else if (marks1 >=40 && marks1 <=49){
            System.out.println("Grade D");
        }else if (marks1 <40)
            System.out.println("Grade F");
 System.out.println();
 
System.out.println(subjectName2+":" + marks2); 
 if(marks2 >=90) {
            System.out.println("Grade A");
        }else if (marks2 >= 70 && marks2 <= 89){
            System.out.println("Grade B");
        }else if (marks2 >=50 && marks2 <=69){
            System.out.println("Grade C");
        }else if (marks2 >=40 && marks2 <=49){
            System.out.println("Grade D");
        }else if (marks2 <40)
            System.out.println("Grade F");
 System.out.println();
 
System.out.println(subjectName3+":" + marks3); 
if(marks3 >=90) {
            System.out.println("Grade A");
        }else if (marks3 >= 70 && marks3 <= 89){
            System.out.println("Grade B");
        }else if (marks3 >=50 && marks3 <=69){
            System.out.println("Grade C");
        }else if (marks3 >=40 && marks3 <=49){
            System.out.println("Grade D");
        }else if (marks3 <40)
            System.out.println("Grade F");
System.out.println();


System.out.println(subjectName4+":" + marks4); 
 if(marks1 >=90) {
            System.out.println("Grade A");
        }else if (marks4 >= 70 && marks4 <= 89){
            System.out.println("Grade B");
        }else if (marks4 >=50 && marks4 <=69){
            System.out.println("Grade C");
        }else if (marks4 >=40 && marks4 <=49){
            System.out.println("Grade D");
        }else if (marks4 <40)
            System.out.println("Grade F");
 System.out.println();
 
System.out.println(subjectName5+":" + marks5); 
if(marks5 >=90) {
            System.out.println("Grade A");
        }else if (marks5 >= 70 && marks5 <= 89){
            System.out.println("Grade B");
        }else if (marks5 >=50 && marks5 <=69){
            System.out.println("Grade C");
        }else if (marks5 >=40 && marks5 <=49){
            System.out.println("Grade D");
        }else if (marks5 <40)
            System.out.println("Grade F");
System.out.println();
        
    }
    
}
