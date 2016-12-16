# Xero-Java
This is the Xero Java SDK for the Xero API. Currently, supports Accounting API. All third party libraries dependencies managed with Maven

### Xero App
You'll need to decide which type of Xero app you'll be building (Public, Private or Partner). Go to [http://app.xero.com](http://app.xero.com) and login with your Xero user account and create an app.

### Setup/Install
We haven't created a maven repository for this library yet, but it's coming soon.  In the meantime, you have everything you need to get up and running in this repo. 

1. Add the com.xero.api and com.xero.model into your src/main/java dir (we are assuming this is included in your build path)
2. Add the certs folder and config.json file into your src/main/resources dir (you'll need to add your keys and other values in config.json - see below)
3. Add the dependencies from the pom.xml file to your project's pom file.

Optional - Sample App 

1. Add our com.xero.example dir to src/main/java
2. Add webapp folder to src/main dir ... inside is your index.jsp, callback.jsp and web.xml settings to handle servlets


### config.json 
Located in src/main/resources is the config.json file.  There are examples for public, private and partner - but the Config.java will look in this folder at the config.json file in order to initialize your Java code. 

Here is an example of config.json for a Partner App.

```javascript
{ 
	"AppType" : "PARTNER",
	"UserAgent" : "Xero-Java",
	"Accept" : "application/xml", 
	"SignatureMethod" : "RSA-SHA1",
	"ConsumerKey" : "Z7DLBXXXXXXXXXXXXXXXZXHTTYC",
	"ConsumerSecret" : "71K7QLXXXXXXXXXXXXXXXQOX36S",
	"ApiBaseUrl" : "https://api.xero.com",
	"ApiEndpointPath" : "/api.xro/2.0/",
	"RequestTokenPath": "/oauth/RequestToken",
	"AuthenticateUrl" : "/oauth/Authorize",
	"AccessTokenPath"  : "/oauth/AccessToken",
	"CallbackBaseUrl" : "https://localhost:8080/MyApp",
	"CallbackPath" : "/CallbackServlet",
	"PrivateKeyCert" :  "certs/public_privatekey.pfx",
	"PrivateKeyPassword" :  "1234"
}
```

Below are the possible attributes for each App Type. 

| App Type			    | Attribute             | Purpose                               | Valid Options 
| --------------------- | --------------------- |---------------------------------------| -------------
| ALL				    | AppType               |  Defines your app type                | PUBLIC or PRIVATE or PARTNER  
| ALL					| UserAgent             |  for debugging by Xero API ssues      | unique string
| ALL					| Accept                |  format of data returned from API     | application/xml or application/json
| ALL		    		| ConsumerKey           |  for oAuth Signature                  | App Key created at app.xero.com
| ALL					| ConsumerSecret        |  for oAuth Signature       			| App Secret created at app.xero.com
| ALL					| ApiBaseUrl            |  base URL for API calls               | https://api.xero.com
| ALL					| ApiEndpointPath       |  path for API Calls                   | /api.xro/2.0/
| Public/Partner		| RequestTokenPath      |  path for Request Token               | /oauth/RequestToken
| Public/Partner 	| AuthenticateUrl       |  path for redirect to authorize       | /oauth/RequestToken
| Public/Partner 	| AccessTokenPath       |  path for Access Token                | /oauth/Authorize
| Public/Partner 	| CallbackBaseUrl       |  base URL for Callback url            | unique string
| Public/Partner 	| CallbackPath          |  path for Callback url                | unique string
| Private/Partner	| PrivateKeyCert        |  path to [Private Key Certificate](https://developer.xero.com/documentation/advanced-docs/public-private-keypair/)      | unique string
| Private/Partner	| PrivateKeyPassword    |  password for Private key             | unique string


### Xero Model
We've included a complete set of classes in `com.xero.model`.  These are generated from the  [Xero Schema XSDs](https://github.com/XeroAPI/XeroAPI-Schemas).  You can always download and generate updated classes in the future to replace the ones included in this project.

### TokenStorage
You'll want to extend this class to implement your own token storage mechanism.  The TokenStorage class currently uses a cookies to save access tokens and is for demonstration purposes only. 

### Xero Client 
We've included the XeroClient with methods to perform each action supported by endpoints.  Once you instantiate XeroClient, you can begin using classes from the model directory to create, read, update and delete data through Xero's API.

```java
TokenStorage storage = new TokenStorage();
XeroClient client = new XeroClient(request, response, storage);
		
/* CREATE ACCOUNT */
ArrayOfAccount accountArray = new ArrayOfAccount();
Account account = new Account();
account.setCode("66000");
account.setName("Office Expense");
account.setType(AccountType.EXPENSE);
accountArray.getAccount().add(account);
List<Account> newAccount = client.createAccounts(accountArray);
			
/* READ ACCOUNT using a WHERE clause */
List<Account> accountWhere = client.getAccounts(null,"Type==\"BANK\"",null);

/* READ ACCOUNT using the ID */
List<Account> accountList = client.getAccounts();
Account accountOne = client.getAccount(accountList.get(0).getAccountID());
			
/* UPDATE ACCOUNT */
newAccount.get(0).setName("Entertainment");
newAccount.get(0).setStatus(null);
List<Account> updateAccount = client.updateAccount(newAccount);

/* DELETE ACCOUNT */
String status = client.deleteAccount(newAccount.get(0).getAccountID());

// GET INVOICE MODIFIED in LAST 24 HOURS
Date date = new Date();
Calendar cal = Calendar.getInstance();
cal.setTime(date);
cal.add(Calendar.DAY_OF_MONTH, -1);
		    
List<Invoice> InvoiceList24hour = client.getInvoices(cal.getTime(),null,null);
System.out.printlin("How many invoices modified in last 24 hours?: " + InvoiceList24hour.size());

```

### Maven Dependencies 

The pom.xml file contains two library dependencies.

```xml
<dependency>
	<groupId>com.google.oauth-client</groupId>
	<artifactId>google-oauth-client</artifactId>
	<version>1.20.0</version>
</dependency>
<dependency>
	<groupId>com.googlecode.json-simple</groupId>
	<artifactId>json-simple</artifactId>
	<version>1.1.1</version>
</dependency>
```

##Acknowledgement

Special thanks to [Connectifier](https://github.com/connectifier) and [Ben Mccann](https://github.com/benmccann).  Marshalling and Unmarshalling in XeroClient was derived and extended from [Xero-Java-Client](https://github.com/connectifier/xero-java-client)
  

##License

This software is published under the [MIT License](http://en.wikipedia.org/wiki/MIT_License).

	Copyright (c) 2016 Xero Limited

	Permission is hereby granted, free of charge, to any person
	obtaining a copy of this software and associated documentation
	files (the "Software"), to deal in the Software without
	restriction, including without limitation the rights to use,
	copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the
	Software is furnished to do so, subject to the following
	conditions:

	The above copyright notice and this permission notice shall be
	included in all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
	EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
	OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
	NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
	HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
	WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
	FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
	OTHER DEALINGS IN THE SOFTWARE.