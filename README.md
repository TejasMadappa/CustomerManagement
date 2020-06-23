# CustomerManagement
API for performing CRUD operations on customer

# API link:
http://localhost:8081/api/customers

### Below is the sample payload for adding new customer.

	{
	  "firstName":"Tejas
	  "lastName":"HM",
	  "dob":"1990-01-07",
	  "email":"tejas.hm@cerner.com
	  "password":"test123"
  	}


Right now there are no validation performed for password. But email should be unique.
