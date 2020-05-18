## Dealership Program
### Authors

~ Wade
~ Mx

#### Main Idea 

We have an application that will deal with cars at a dealership. The business owner who is the only user will be able to sell and buy cars which will be added to the database. The cars bought and sold should modify his bank details. This program should allow him to keep stock of all the cars he has in his inventory and the profits or loses he has made that month.

## Database 
### Tables

#### Account
 ###### fields
 1.) User_name ~ String
 2.) Password ~ String
 3.) Bank account balance ~ Float

as it stands there will be only one user. the business owner who will input his bank account balance his chosen password and user name

#### Cars
 ###### fields
 1.) Model ~ String
 2.) Age ~ int
 3.) Brand ~ String
 4.) Mileage ~ longInt
 5.) Colour ~ String
 6.) Price ~ Float
 7.) NumberPlate ~ String

So when he registers a car he will be saying that he has bought this car and the amount will be deducted from his Account balance.
Otherwise he will give the number plate of the car and he will say how much he sold this car for. The car will be removed from the database and the amount will be added to his Account Balance.

As we go own with the project potential tables include ; Employees. Each addition table will require refactoring so we dont plan on adding many more unless the requirements require it.