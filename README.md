# Homework for Inbank
## Project setup
### Open this project
1. This project was made in IntellJ Ultimate which is recommended to open this project.
2. In IntellJ - File > New > Project from version control > URL: https://github.com/SanderKondratjev/homeWorkforInbank

### Run server
1. After project has been opened run 'HomeWorkApplication'
2. Just press Shift+F10
3. Or go homeWork > src > main > java > HomeWorkApplication - run this file

FYI
After you have run the server, automatically the database is filled with customer data (code can be found in 'changelog-1.0.xml).
The customer data what is the database is following:
1. 49002010965 - debt
2. 49002010976 - segment 1 (credit_modifier = 100)
3. 49002010987 - segment 2 (credit_modifier = 300)
4. 49002010998 - segment 3 (credit_modifier = 1000)

### Run tests - one way
1. Go to your browser and write in url next testcases:
2. Testcase 1: http://localhost:8080/loan-decision?customerid=49002010965&loanamount=6000&loanperiod=12
3. Testcase 2: http://localhost:8080/loan-decision?customerid=49002010976&loanamount=6000&loanperiod=12
4. Testcase 3: http://localhost:8080/loan-decision?customerid=49002010987&loanamount=6000&loanperiod=12
5. Testcase 4: http://localhost:8080/loan-decision?customerid=49002010998&loanamount=6000&loanperiod=12
6. Or you can make your own testcases, just write values in 'AMOUNT' and 'PERIOD'
7. Blank URL: http://localhost:8080/loan-decision?customerid=49002010998&loanamount=AMOUNT&loanperiod=PERIOD

### Run tests - other way
1. Run 'HomeWorkApplicationTests'
2. homeWork > src > test > java > ee.forInbank.homeWork > HomeWorkApplicationTests - run this file.
3. Watch the magic happen. You can open this file and see what is tested and what outcome is needed (same test cases as in above)

### Have fun

### How project was done
1. Made a new project in https://start.spring.io/ where dependencies were added
2. Made database in PostgreSQL and added code in 'changelog-1.0.xml' where was added customer data which would automatically go in database when you run 'HomeWorkApplication' 
3. Made a code to to get customer credit modifier using customer ID (Repository)
4. Checked if creditscore is under 1 then loan application would be denied and over 1 approved.
5. Added if statement for min and max loan amount and loan period.
6. Added if statement where creditscore is under 1 to see if it possible to approve smaller loan request if not, then longer loan period.
7. Added if statement where creditscore is over 1 to see if is possible to approve larger loan request.

### Next steps
1. Front-end development (lack of time it was not made)
