# Student Master Degree Specialty Application

The Student Master Degree Specialty Application is a web-based application that allows students to submit their master's degree specialty choices along with their average grades.

## Features

- Students can create an account if does not have  one and log in.
- Students can view the list of available specialties.
- Students can select their desired specialty and submit their average grades if they are from out of the university.

## Technologies Used

- Backend: Spring Boot
- Frontend: Thymeleaf/angular I am not sure what I use in the future
- Database: MySQL

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or above
- Apache Maven
- MySQL Server

### Installation

1. Clone the repository: git clone [https://github.com/your-repository-url.git](https://github.com/hocinebouarara/Student-Master-Degree-Specialty-Application/edit/main/README.md)

2. Navigate to the project directory: cd student-master-degree-app

3. Import the project into your preferred IDE (e.g., IntelliJ, Eclipse).

4. Configure the database connection in the `application.properties` file:
   
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
   
5. Build and run the application: mvn spring-boot:run

6. Access the application in your web browser: http://localhost:8080


## Database Design

The application's database design consists of the following tables:

- Employee: Stores information about employees 
- Student: Stores information about students.
- Teacher: Stores information about teachers.
- Speciality: Stores information about master's degree specialties.
- Subject: Stores information about subjects.
- StudentSubject: Stores information about the relationship between students, subjects, and their grades.

## Usage

### Students from the university (80%)

1. Launch the application and log in as a student.

2. Enter or edit only the personal information
   
3. Browse the available specialties and select your desired specialty.

4. Submit your specialty choice

### Students from out the university (20%)

1. Launch the application and register as a student or log in if you already have an account.

2. enter the grades as a pdf file
   
3. Browse the available specialties and select your desired specialty.

4. Submit your specialty choice.

### Teachers

1. Launch the application and log in as a teacher.

2. Access the teacher dashboard to view the list of your subjects and students.

3. Assign grades to students for their respective subjects.

### Employees

1. Launch the application and log in as an employee.

2. Access the administrative dashboard to perform administrative tasks, such as managing user accounts, adding new specialties, adding new students, adding new teachers, or generating reports.

## Contributing

Contributions are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue or submit a pull request.

## License

This project is licensed for learning

## Contact

If you have any questions or inquiries, please contact [hocine bouarara](hocinbouarara08gmail.com).
