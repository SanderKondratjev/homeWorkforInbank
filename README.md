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


### Have fun with

