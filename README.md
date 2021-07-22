# EnterHourWebApp
This is a CRUD app for employee and his worked hours in job.

#THIS IS NOT THE LAST VERSION OF APP.
WHAT ELSE I NEED TO DO?
- SECURITY
- TYPE OF MAIN KEY SHOULD BE LONG - done (why Long? - because the default value of int is '0' (so user can't know that is it true value from db) then Long can be null or anything else)
- EACH EMPLOYEE NEED DB FOR ADDING HOURS - @OneToMany 
- SOLVE THE PROBLEM OF AUTO '0' IN 'HOURS' FIELD - the problem is already solved by changed a type of hours from int to Integer
- MORE INFORMATIONS = MORE COLUMNS (LIKE YO, WHAT KIND OF CONTRACT DOES EMPLOYEE HAVE)
- A LITTLE BIT MORE PRETTY DESIGN (BUT IT'S NOT IMPORTANT FOR THIS MOMENT)
- SOME MATH CALCULATIONS LIKE SUM OF HOURS
- OPTIONS 'DELETE' NEED CONFIRM LIKE 'ARE YOU SURE Y/N'
- THE HTML FILES NEED THE RIGH URL TO ELIMNATE WARNINGS - already solved by adding url xmlns:th="http://www.thymeleaf.org"
- ....

#Technology used:
 *JAVA*,
 *MySQL*,
 *Hibernate*,
 *Spring Data JPA*,
 *Spring MVC*,
 *Thymeleaf*.

#Options in app:

  *Add Employee* - some fileds to put informations about employee like firstName, lastName, email;
  
  *Update* - if there is anything to change you can also update informations for any employee;
  
  *Delete* - for any reason you can delete employee that you add;
  
  *Back to home* - a button just for back to the home page;
  
#Screens
  *Add Employee*
  
![image](https://user-images.githubusercontent.com/80509103/125859105-67e8aba8-da55-4171-8be2-0e4dc7a42d8a.png)

  *List Of Employees* - after save by using button 'Add Employee'
![image](https://user-images.githubusercontent.com/80509103/125859269-47cfa80e-8b04-4899-8ac6-15665e31fe3d.png)

  *Update Employee*
  
 ![image](https://user-images.githubusercontent.com/80509103/125859354-235f25fc-c00d-438a-8873-0eb79fbd88b1.png)

  *List Of Employees* - after update
  
  ![image](https://user-images.githubusercontent.com/80509103/125859608-de824123-b209-4c35-8b9c-2e2b8d2f9d3f.png)

  *Employee Hours* - after save by using button 'Add Hours'
  
  ![image](https://user-images.githubusercontent.com/80509103/125999191-ebf79af0-da46-4dcf-b45d-2b77bf4c3f60.png)
  
  *Add Hours*
  
  ![image](https://user-images.githubusercontent.com/80509103/125999074-29755fc2-80f1-4346-8994-835a7be2f8fb.png)

  *Update hours*
  
  ![image](https://user-images.githubusercontent.com/80509103/125999326-d8c3954e-4df5-454b-b07a-6931c29385a4.png)
  
  *Employee hours* - after update
  
  ![image](https://user-images.githubusercontent.com/80509103/125999715-631bb968-1bf5-453a-b322-3e5cbe28a038.png)

  






