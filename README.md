# Deposit Cash   
Software Verification and Validation Assignment by Thanida Jongarnon 6110545538

# Prerequisite
- Java SDK [15 or above](https://www.oracle.com/java/technologies/javase-downloads.html) 
- Maven    [3.6.3 or above](https://maven.apache.org/download.cgi)                                                        

# Test Function
1) ลูกค้าสามารถฝากเงินได้ครั้งละไม่เกิน 30,000 THB
- ```deposit_Less_Than_30000_Result_Should_Be_True()```
- ```deposit_Equal_To_30000_Result_Should_Be_True()```
- ```deposit_More_Than_30000_Result_Should_Be_False()```  

2) ลูกค้าสามารถฝากเงินได้วันละไม่เกิน 50,000 THB    
- ```deposit_Cash_Less_Than_Maximum_Amount_Result_Should_Be_True()```
- ```deposit_Cash_Equal_To_Maximum_Amount_Result_Should_Be_True()```
- ```deposit_Cash_More_Than_Maximum_Amount_Result_Should_Be_False()```

3) บัญชีที่ใช้ต้องไม่เป็นบัญชีที่ถูกอาญัติ
- ```check_Suspended_Account_Should_Return_True()```
- ```check_Valid_Account_Should_Return_False()```

4) บัญชีที่ออมทรัพย์แต่ละประเภทจะมีเงื่อนไขการรับฝากเงินขั้นต่ำ (กำหนดให้เงินฝากขั้นต่ำ 100 THB)
- ```deposit_Cash_Less_Than_Minimum_Amount_Result_Should_Be_False()```
- ```deposit_Cash_Equal_To_Minimum_Amount_Result_Should_Be_True()```
- ```deposit_Cash_More_Than_Minimum_Amount_Result_Should_Be_True()```


# How to run test
1) Clone the project to your machine

``` 
git clone https://github.com/bameethanida/Deposit-Cash.git
```

2) Go to the project directory

``` 
cd Deposit-Cash
```

3) Run the following command for run test

``` 
mvn clean test
```
