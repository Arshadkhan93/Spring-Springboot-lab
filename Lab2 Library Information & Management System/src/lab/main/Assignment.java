package lab.main;

/*
 Task 2 — Library Information & Management System
Objective
Demonstrate hybrid Spring dependency injection between multiple beans (Book, Author, Library, and Librarian) using both constructor and setter injection, configured via XML and annotations.
Class-wise Design
1️.Author

Fields: authorId, authorName

Constructor for both fields (constructor injection)

Method: displayAuthorInfo()

Injection: Constructor (XML)

2️. Book

Fields: bookId, bookTitle, author

Constructor: accepts bookId, bookTitle

Setter: setAuthor() annotated with @Autowired

Method: displayBookDetails()

Injection:

Author → via @Autowired

bookId, bookTitle → via XML properties

3️.Library

Fields: libraryName, books (List<Book>)

Constructor for both fields (constructor injection)

Method: showLibraryData()

Injection: Constructor Injection (XML with <list> of books)

4️.Librarian

Fields: library, employeeName

Setter: setLibrary() annotated with @Autowired

Method: manageLibrary()

Injection:

Library → Annotation

employeeName → XML property

5️.SpringConfig.xml

Component scan → <context:component-scan base-package="com.example.library"/>

Beans for Author, Book, Library, Librarian

<list> used for book collection injection

<context:annotation-config/>

6. MainApp

Load XML context

Retrieve Librarian bean

Call manageLibrary()

Expected Output
---------------
=== Library Information System ===
Library: City Central Library
Managed By: Mr. John
Books Available:
  - Book: Spring Framework Essentials | Author: Martin Fowler
  - Book: Clean Code | Author: Robert C. Martin 
 */
