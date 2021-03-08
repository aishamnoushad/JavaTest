JavaTest
Assignment JavaTest Assignment

Actually I tried to complete this assignment with angular as front end and java spring -boot as back end. (As told by prisy mam during interview)

To be frank I was learning angular and spring-boot along with this assignment. Unfortunately i was unable to complete this assignment. But what ever i have done i am submitting with this.

First of all I tried to install access Db but my windows product key doesn't support Microsoft Access, and its $112 to buy so i have converted access db to mysql and proceeded.

A login form has been created using angular and it will show login form when that angular project runs. after that i had tried to implement authentication and authorization in back end 1st method i tried is authentication using spring security where user details will fetch from database. but that case i have encountered the problem because user details are not saved through spring code so the user password is not encoded in db. i tried alot but i didn't get how to correct it. then i moved with in memory authentication.

but the login button click of angular project showing bad credential (http://localhost:4200/login) but

Access to XMLHttpRequest at 'http://localhost:8080/secure/rest/validateLogin' from origin 'http://localhost:4200' has been blocked by CORS policy: Response to preflight request doesn't pass access control check: No 'Access-Control-Allow-Origin' header is present on the requested resource. zone-evergreen.js:2863 GET http://localhost:8080/secure/rest/validateLogin net::ERR_FAILED

this error is comming i tried alot but couldn't resolve.

And in Back end admin search with authorization token provided through header in postman application to test the api.

in postman with get method and url: http://localhost:8080/secure/rest/auth/process authorization

image

will give the list of accounts from db abd this details is displayed in inner page. http://localhost:4200/adminPage but couldn't complete that page.

Assuming the data are comming from front end tested with postman

with post method and the url; http://localhost:8080/secure/rest/auth/getStatements

Listing statements based on the request specified amount range and account id Request body- raw json { "account_id": 1, "strFromDate":"", "strToDate":"", "fromAmount":120, "toAmount":500 }

response: [ { "id": 57, "accountIid": 1, "datefield": "2012-03-14", "amount": 332.588024293528 }, { "id": 81, "accountIid": 1, "datefield": "2012-06-20", "amount": 258.669010375204 }, { "id": 72, "accountIid": 1, "datefield": "2012-08-12", "amount": 427.37803489619 }, { "id": 46, "accountIid": 1, "datefield": "2019-05-31", "amount": 376.672352972369 }, { "id": 48, "accountIid": 1, "datefield": "2012-03-03", "amount": 373.950606558506 }, { "id": 138, "accountIid": 1, "datefield": "2020-05-24", "amount": 301.475914804549 }, { "id": 9, "accountIid": 1, "datefield": "2020-10-14", "amount": 196.801905945903 }, { "id": 29, "accountIid": 1, "datefield": "2020-05-26", "amount": 191.608098447429 }, { "id": 130, "accountIid": 1, "datefield": "2012-11-14", "amount": 376.917602681929 }, { "id": 69, "accountIid": 1, "datefield": "2012-01-08", "amount": 161.803506518358 }, { "id": 85, "accountIid": 1, "datefield": "2012-05-04", "amount": 289.279082576802 }, { "id": 39, "accountIid": 1, "datefield": "2016-10-18", "amount": 304.375774283414 }, { "id": 121, "accountIid": 1, "datefield": "2012-04-08", "amount": 452.220841246041 }, { "id": 53, "accountIid": 1, "datefield": "2012-02-20", "amount": 387.671104146657 }, { "id": 64, "accountIid": 1, "datefield": "2012-10-08", "amount": 396.809586959555 } ]

Listing statements based on the request specified date Range and account id

request body { "account_id": 1, "strFromDate":"2012-06-10", "strToDate":"2021-03-08", "fromAmount":0, "toAmount":0 }

response body [ { "id": 39, "accountIid": 1, "datefield": "2016-10-18", "amount": 304.375774283414 }, { "id": 46, "accountIid": 1, "datefield": "2019-05-31", "amount": 376.672352972369 }, { "id": 89, "accountIid": 1, "datefield": "2012-11-19", "amount": 10.4978134308631 }, { "id": 64, "accountIid": 1, "datefield": "2012-10-08", "amount": 396.809586959555 }, { "id": 29, "accountIid": 1, "datefield": "2020-05-26", "amount": 191.608098447429 }, { "id": 82, "accountIid": 1, "datefield": "2012-08-29", "amount": 537.263739510225 }, { "id": 138, "accountIid": 1, "datefield": "2020-05-24", "amount": 301.475914804549 }, { "id": 94, "accountIid": 1, "datefield": "2012-07-04", "amount": 113.405299633134 }, { "id": 130, "accountIid": 1, "datefield": "2012-11-14", "amount": 376.917602681929 }, { "id": 61, "accountIid": 1, "datefield": "2012-07-31", "amount": 828.245746980652 }, { "id": 13, "accountIid": 1, "datefield": "2020-07-01", "amount": 869.966470373683 }, { "id": 88, "accountIid": 1, "datefield": "2012-07-13", "amount": 585.269254817154 }, { "id": 43, "accountIid": 1, "datefield": "2019-10-21", "amount": 113.619329901574 }, { "id": 72, "accountIid": 1, "datefield": "2012-08-12", "amount": 427.37803489619 }, { "id": 65, "accountIid": 1, "datefield": "2012-12-30", "amount": 811.442741186215 }, { "id": 92, "accountIid": 1, "datefield": "2012-09-05", "amount": 968.120471616201 }, { "id": 14, "accountIid": 1, "datefield": "2020-05-05", "amount": 578.931756366243 }, { "id": 136, "accountIid": 1, "datefield": "2019-11-23", "amount": 103.422615473659 }, { "id": 9, "accountIid": 1, "datefield": "2020-10-14", "amount": 196.801905945903 }, { "id": 81, "accountIid": 1, "datefield": "2012-06-20", "amount": 258.669010375204 }, { "id": 117, "accountIid": 1, "datefield": "2012-06-28", "amount": 35.4587802498303 }, { "id": 45, "accountIid": 1, "datefield": "2019-05-14", "amount": 957.272849951391 } ]

Listing statements based on the request specified date Range and account id and amount range { "account_id": 1, "strFromDate":"", "strToDate":"", "fromAmount":0, "toAmount":0 }

response body

[] because there is no transaction in db between last 3 months. if i change 3 to last 6 months by changing the value in getSatementsOfTheGivenSearchCriteria function of statementservice

public List getSatementsOfTheGivenSearchCriteria(SearchDetail searchCriteria) { List statementList = null; List statementListFilterBasedOnDate = null; List statementListFilterBasedOnAmount = null; Set statementSet =null; List filteredstatementList =null;

	try {

		if(searchCriteria.getAccount_id()!=0 ) {
			statementList = StatementRepository.findAllByAccountIid(searchCriteria.getAccount_id());
			if(searchCriteria.getStrFromDate()!="" && searchCriteria.getStrToDate()!="") {
				if(searchCriteria.getFromAmount()!=0 && searchCriteria.getToAmount()!=0 ) {
					statementListFilterBasedOnDate = getStatementwithdateFiltering(searchCriteria,statementList);
					statementListFilterBasedOnAmount = getStatementwithamountFiltering(searchCriteria,statementListFilterBasedOnDate);
					statementSet = new HashSet<Statement>(statementListFilterBasedOnDate);
					statementSet.addAll(statementListFilterBasedOnAmount);
					filteredstatementList = new ArrayList<>(statementSet);
				}else{
					statementListFilterBasedOnDate = getStatementwithdateFiltering(searchCriteria,statementList);
					statementSet = new HashSet<Statement>(statementListFilterBasedOnDate);
					filteredstatementList = new ArrayList<>(statementSet);
				}
				
				
				
			}else if(searchCriteria.getFromAmount()!=0 && searchCriteria.getToAmount()!=0 ) {
				statementListFilterBasedOnAmount = getStatementwithamountFiltering(searchCriteria,statementList);
				statementSet = new HashSet<Statement>(statementListFilterBasedOnAmount);
				filteredstatementList = new ArrayList<>(statementSet);
			}else {
				LocalDate toDate = LocalDate.now();
				LocalDate start = toDate.minusMonths(3); // here # changes to 6 then we will get the last ^ months statement
				
				System.out.println("date empty,and amount zero case fromdate"+start);
				System.out.println("date empty,and amount zero case todate"+toDate);
				statementListFilterBasedOnDate=getStatementwithdateFilteringDefault(start,toDate,statementList);
				statementSet = new HashSet<Statement>(statementListFilterBasedOnDate);
				filteredstatementList = new ArrayList<>(statementSet);
			}
		}
		
			
		
	}catch(Exception E){
		throw E;
		
	}
	return filteredstatementList;
}
then response body will be

[ { "id": 9, "accountIid": 1, "datefield": "2020-10-14", "amount": 196.801905945903 } ]
