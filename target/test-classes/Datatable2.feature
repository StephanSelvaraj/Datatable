Feature: Datatable
Scenario: Datatable with all formats
Given user gives the datatable
When one dimension without header
|Java|Selenium|Python|

And one dimension with header
|course|java|


And Two Dimension with header

|course|Trainer|Duration|
|Java|Ram|3months|

And Two Dimension without header
|street|Balamurugan|
|city|chennai|
|State|Tamilnadu|


Then Datatable is over

