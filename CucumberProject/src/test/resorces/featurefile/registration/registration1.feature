Feature: Registration.

Scenario Outline: user enters all the details for regisration
Given Navigate to application
When user click on sign in
Then user enter emailaddress "<emailaddress>"
And click on create account
And user select title as mrs
And user enters firstname "<firstname>" 
And user enters lastname "<lastname>"
And user enters password "<password>"
And user selects day "<day>"
And user selects month "<month>"
And user selects year "<year>"
And user enters address firstname "<addressfirstname>"
And user enters address lastname "<addresslastname>"
And user enters company name "<addresscompanyname>"
And user enters address"<address>"
And user enters city "<city>"
And user select state "<state>"
And user enters zipcode "<zipcode>"
And user enters mobile no "<mobilephone>"
And user enters address aias"<addressalias>"
Then click on register button
Then Verfiy registration  success

Examples:
    | emailaddress  | firstname | lastname |password|day|month|year|addressfirstname|addresslastname|addresscompanyname|address|city|state|zipcode|mobilephone|addressalias|
    | megha08jan@gmail.com | megha|jain|password|8|1|1990|addressfirstnameone|addresslastnameone|addresscompanyname1|address1|Bangalore|2|99501|9168450949|addressalias1|
   
