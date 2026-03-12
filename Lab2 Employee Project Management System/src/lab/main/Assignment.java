package lab.main;

/**
 Task 3 — Employee Project Management System

Objective

Showcase a hybrid Spring Core setup with both Constructor and Setter Injection, 
managing employee-project relations using XML + annotation configuration.
Class-wise Design
1️. Project

Fields: projectId, projectName, duration

Constructor to inject all fields

Method: showProjectDetails()

Injection Type: Constructor (XML)

2️.Employee

Fields: employeeId, employeeName, project

Constructor: accepts employeeId, employeeName

Setter: setProject() with @Autowired

Method: showEmployeeDetails()

Injection Type:

Project → via @Autowired

Employee ID/Name → XML property

3️.Department

Fields: departmentName, employees (List<Employee>)

Constructor Injection: both fields

Method: showDepartmentInfo()

Injection Type: Constructor (XML with <list>)

4. Company

Fields: companyName, departments (Map<String, Department>)

Constructor Injection: all fields injected via XML <map>

Method: showCompanyInfo()

Injection Type: Constructor (XML map injection)

5️.SpringConfig.xml

<context:component-scan base-package="com.example.company"/>

Beans for Project, Employee, Department, and Company

Use <list> for departments → <map> for multiple departments

<context:annotation-config/> enabled

6️.MainApp

Load SpringConfig.xml

Get Company bean

Call showCompanyInfo()

Expected Output
---------------
=== Company Structure ===
Company: TechWave Solutions
Department: IT
  Employee: Alice | Project: Web Application (6 Months)
Department: HR
  Employee: Bob | Project: Recruitment System (3 Months)
 */