# Java-MBRDI-Training
Practicing Java Questions for Interview Preparation

----------------------------------------Java 1.7 Basic and intermediate Coding Questions-----------------------------------

1) print helloworld 10 times.
    o/p=  Hello world 1
          Hello World 2 ....  
          Hello World 10

2) print the 3rd highest from array.

3) reverse a given string. i/p="Capgemini"

4) write a code to find missing number in Integer List
    Test cases :
       a) 1,2,3,4,5,7,8,9,10
       b)2,4,6,10,12,14,16,18,20
       c)1,3,5,9,11,13,15,17

5) Write a program to get the occurrence of a specific letter in a given String.
   i/p="Hello"
   i/p=l
   o/p=2 

6) Write a java program for palindrome in normal way as well as using Command line arguments.
  i/p="MADAM"
  o/p MADAM is a Pallendrome

7) Write a program to sort a given list of intergers in ascending order
  i/p list={2,4,0,1,56,23,4}
  o/p list={0,1,2,4,4,23,56}

8) Write a program to check a given number is prime or not 
    i/p n=34

9) write a program to a sort a Array of String in ascending oreder alphabetially
   i/p String s=["Capgemini","Accenture","TCS","EPAM"]
   o/p =[Accenture,Capgemini,EPAM,TCS]

10) Write a program to check a given number is even or odd
    i/p n=34
    o/p = 34 is even number

11) write a program for fibonacci series;

12) write a program to return 2nd largest number from given array
   i/p=[2,3,5,6,1,0]
   o/p=6

13) Write a program to implement the defalut method in a Fuctional interface and override it.

14) write a program to Count the number of alphabets in a given sentence
    i/p="Capgemini"
    o/p = {C-1,a-1,p-1,g-1,e-1,m-1,i-2,n-1}

15) Write a program to store the List of prime numbers in a arrayList and print it.

16) Write a program to create POJO class of Product (Product Id, ProductName) and Store all values in any collection and Sort that values by ProductName in ascending order

17) write a program To count number of words in a given sentence.
 i/p "Hello world"
 o/p = 2 words  

18) Write a program to Reverse a string="Capgemini Training"

19) Write a program count Each vowel frequency in a String(String="capgemini training")

20) Create a class having Fields id,name ,salary and sort it based on id and name using comparator and comparable 

21) Given a string sentence, count the number of words in it and display count. The words are separated by the following characters: space (‘ ‘) or new line (‘\n’) or tab (‘\t’) or a combination of these.

22) write program to check whether a number is palindrome or not and
   1) n=101
   2) n=22022

23) Design a Prime Number between 2 to 30.

24) Swap 2 numbers without using 3rd variable.
25) Design a program to display magic number, accept a number and check it is a magic number or not.
26) Display a L shape * symbol.
27) Accept a number , find the reverse of it.
28) Write a program to display Pyramid symbol.
29) Declare a TreeSet and store the 2 Employee Objects.
30) Accept a string line and check how many vowels are there.
31) How can you find first non-repeated character in a word.
32) How can you check a string can only have alphabets and not digits.
33) How to get matching characters in a string.
34) How to get non-matching character in a string.
35) How do you prove 2 strings are anagrams.44).Find out the count of  occurance of particular character in a string.
36) How to verify if 2 strings are rotation mutually.
37) How to find out first character of string , which is not repeated.
38) How to search a missing numbers in an array, which contains integer from 1 to 100.
39) Determine largest and smallest elements of an array , which is not sorted.
40) Explain the Bubble Sort algorithm.
41) Explain the Merge Sort algorithm.
42) How to remove special character in a string that is lowercase.
43) what is process of deleting matched element from a LinkedList which is not sorted.
44) Find out the Fibonacci series between 1 to 30.
45) Find out factors of given numbers. n=34
46) Write a java program to count number of words in a string using HashMap.
47) given a Char array is there {'a','b','a','c'} Find out not duplicate character i.e. 'a'
48) Write a program to remove the duplicate elements from a list =[2,3,3,3,65,4,3,3,2]
49) Write a Java program to illustrate multiple catch block 
50) Write a Java program to get the character at the given index within the String
51) Write a Java program to get the character (Unicode code point) at the given index within the String
52) Write a Java program that checks the letters of the second string are present in the first string. Return true otherwise false.

Input the first string: 
 Java
Input the second string: 
 Ja
Check first string contains letters from the second string:
true

53) Write a Java program that removes a specified word from a given text. Return the new string.

("Exercises Practice Solution", " Solution") -> "Exercises Practice"
("Red Green Blue", "Green") -> "Red Blue"
("Java Number Exercises”, “Java”) -> "Number Exercises"

54) Write a Java program to remove a specified character from a given string.

Original string:
abcdefabcdeabcdaaa

remove char from given string :  "a"

Second string:
bcdefbcdebcd

55) Write a Java program to sort in ascending and descending order by length of the given array of strings.

Original unsorted colors: [Green, White, Black, Pink, Orange, Blue, Champagne, Indigo, Ivory]

Sorted color (descending order): [Champagne, Orange, Indigo, Green, White, Black, Ivory, Pink, Blue]

Sorted color (ascending order): [Pink, Blue, Green, White, Black, Ivory, Orange, Indigo, Champagne]

56) Write a Java program to create a new string repeating every character twice of a given string.

   Sample Output:

   The given string is: welcome
   The new string is: wweellccoommee
57) Write a Java program to reverse words in a given string.

Sample Input / Output:

The given string is:= Reverse words in a given string

The new string after reversed the words:= string given a in words Reverse

58) Write a Java program to find the maximum occurring character in a string.


Sample Output:

The given string is: test string
Max occurring character in the given string is: t


59) Write a Java program to test if a given string contains the specified sequence of char values.

Sample Output:

Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: "and"                                                                        
output : true

-------------------------------------------------------------------------------------------------------------------------

60) Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"



public String makeOutWord(String out, String word) {

return out.substring(0,2)+word+out.substring(2,4);
}

-------------------------------------------------------------------------------------------------------------------------
61) Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

--------------------------------------------JAVA 1.8 (Intermediate) coding Questions --------------------------------------

Q1) Given a list of integers, find out all the even numbers exist in the list using Stream functions? list=[2,34,678,3]

Q2) Given a list of integers, find out all the numbers starting with 1 using Stream functions?

Q3) How to find duplicate elements in a given integers list in java using Stream functions?

Q4) Given the list of integers, find the first element of the list using Stream functions?

Q5) Given a list of integers, find the total number of elements present in the list using Stream functions?

Q6) Given a list of integers, find the maximum value element present in it using Stream functions?

Q7) Given a String, find the first non-repeated character in it using Stream functions?

Q8) Given a String, find the first repeated character in it using Stream functions?

Q9) Given a list of integers, sort all the values present in it using Stream functions?

Q8) Given a String, find the first repeated character in it using Stream functions?

Q9) Given a list of integers, sort all the values present in it using Stream functions?

Q10) Given a list of integers, sort all the values present in it in descending order using Stream functions?

Q11) Write a Java 8 program to concatenate two Streams?

Q12 ) Write a Java 8 program to find the number of Strings in a list whose length is greater
than 5?

Q13) Explain StringJoiner Class in Java 8? How can we achieve joining multiple Strings
using StringJoiner Class?

Q14)Find the Word/number got repeated by using Stream api
   input:2,3,34,,5,5,4,3,3,3 
   output:2-1,3-4,34-1,5-2,4-1
   
Q15) Write a Java Lambda Expression to Create Thread 

Q16) How Lambda Expression and Functional Interfaces are Related?
    
Q17)Given a list of Strings .sConvert String to uppercase and Join them with coma (,) using Stream api
List=["USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"]

Q18)Given a list of Integer find square of all distinct numbers By using stream api
  list=[9, 10, 3, 4, 7, 3, 4]
  
Q19)Given a List of Integers find total count, min, max, sum, and the average for numbers by using Stream api
input  :list=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29] 
output: count=10, sum=129, min=2, average=12.900000, max=29

