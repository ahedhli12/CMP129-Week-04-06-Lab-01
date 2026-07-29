CMP 129 – Computer Science II
Week 4 – Lab 1: Working with Arrays
Learning Objectives

After completing this lab, students should be able to:

Declare and initialize one-dimensional arrays.
Store user input in an array.
Process array elements using loops.
Compare corresponding elements in two arrays.
Validate user input.
Count and report matching or incorrect values.
Generate random numbers in Java.

Complete both programming problems. Create a separate Java file for each problem.

Problem 1: Driver’s License Exam

Create a program that grades the written portion of a driver’s license examination. The examination contains 20 multiple-choice questions.

Store the following correct answers in an array:

1. A     6. B     11. A     16. C
2. D     7. A     12. C     17. C
3. B     8. B     13. D     18. A
4. B     9. C     14. B     19. D
5. C    10. D     15. D     20. B
Program Requirements

The program must:

Store the 20 correct answers in an array.
Create a second array for the student’s answers.
Ask the user to enter an answer for each question.
Accept only A, B, C, or D.
Accept lowercase or uppercase answers.
Continue requesting an answer until the user enters a valid choice.
Compare the student’s answers with the correct answers.
Count the number of correct and incorrect answers.
Display whether the student passed or failed.
Display the question numbers answered incorrectly.

A student must correctly answer at least 15 of the 20 questions to pass.

Example Output Format
Correct answers:   16
Incorrect answers: 4
Result: PASS

Questions answered incorrectly:
3 7 12 18
Required Filename
DriversLicenseExam.java
Problem 2: Lottery Application

Create a program that simulates a five-digit lottery.

Program Requirements

The program must:

Create an integer array named lottery containing five elements.
Generate a random integer from 0 through 9 for each array element.
Create another integer array named user containing five elements.
Ask the user to enter five lottery digits.
Store the user’s digits in the user array.
Accept only values from 0 through 9.
Continue requesting a digit until the user enters a valid value.
Compare corresponding elements in the two arrays.
Count how many digits match in the same positions.
Display the generated lottery numbers.
Display the user’s lottery numbers.
Display the total number of matching digits.
Display a grand-prize message if all five digits match.

For example:

Lottery array: 7 4 9 1 3
User array:    4 2 9 7 3

In this example, two digits match in the same positions: the third and fifth digits.

Example Output Format
Lottery numbers: 7 4 9 1 3
Your numbers:    4 2 9 7 3
Matching digits: 2

If every digit matches:

Congratulations! You are the grand-prize winner!
Required Filename
Lottery.java
General Requirements
Use arrays to store all answers and lottery digits.
Use loops to receive, process, and display array elements.
Validate all user input as required.
Use meaningful variable names.
Follow standard Java naming and formatting conventions.
Include comments explaining important parts of each program.
Do not place all program logic inside one large section without organization.
Test each program with multiple sets of input.
Both programs must compile and run without errors.
You must be able to explain every part of your submitted code.
Follow the course AI-use policy.
Record AI assistance in AI-Use-Report.md.
Required Organization
Week-04
└── Lab-01
    ├── CMP129-Week-04-Lab-01.docx
    ├── AI-Use-Report.md
    └── src
        ├── DriversLicenseExam.java
        └── Lottery.java

The Java files may initially contain only:

/*
 * Student Name:
 * Course: CMP 129
 * Week: 4
 * Lab: 1
 * Problem:
 * Date:
 */

Use these problem labels:

Problem 1 – Driver’s License Exam
Problem 2 – Lottery Application
Submission

Students must push:

Lab-01/src/DriversLicenseExam.java
Lab-01/src/Lottery.java
Lab-01/AI-Use-Report.md

Suggested commit messages:

Complete driver license exam program
Add lottery array simulation
