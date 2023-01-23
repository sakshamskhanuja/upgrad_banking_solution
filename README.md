## The Banking solution

### Description

People usually take a home loan to buy a new house, and almost every bank offers home loans but the rate of interest varies across banks. You need to suggest a bank to a user on the basis of the interest rate charged to suit their needs. Create an abstract class <b>Homeloan</b> with two abstract methods <b>getRateOfIntererst</b> and <b>SimpleInterest</b>. Also, create classes <b>Bank1</b> and <b>Bank2</b> where you can implement the two abstract methods. The rate of interest for Bank 1 is 7.2 and for Bank 2 is 8.1. Using this, you can calculate the simple interest and suggest a bank to the user.

<b>Note</b>: Simple Interest = (principle*rate*time)/100

### Input

Your program should take two lines of input:

1. The amount of loan that they want from the bank.
2. The time for which they want to take the loan (in years).

### Output

The output of your program must consist of two lines:

1. If <b>Bank1</b> provides the loan at a lower rate of interest, print “File for a loan in Bank1”; else, print “File for a loan in Bank2”.
2. The amount that they have to pay back to the bank, i.e. principal + interest.

<b>Note</b>: If a user inputs a negative/0 loan amount or time, print “invalid input”.

### Sample Input

23400.2<br>
2

### Sample Output

File for a loan in Bank1<br>
26769.8288
