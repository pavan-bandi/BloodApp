# Database Document

## Users Table

| Field | Datatype | Extras |
| ------ | ------ | ------ | 
| FirstName | varchar2(40) |  |
| LastName | varchar2(40) |  |
| Email | varchar2(50) | PK |
| MobileNumber | varchar2(10) | UQ |
| City | varchar2(10) |  |
| Pincode | varchar2(6) |  |

## Hospital

| Field | Datatype | Extras |
| ------ | ------ | ------ | 
| Hid | number | AI, PK |
| HName | varchar2(40) |  |
| MobileNumber | varchar2(10) | UQ |
| HImage | varchar2(100) |  |
| DNo | varchar2(10) |  |
| Street | varchar2(20) |  |
| City | varchar2(10) |  |
| Pincode | varchar2(6) |  |

## BloodRecords Table

| Field | Datatype | Extras |
| ------ | ------ | ------ | 
| Hid | number | FK, CK |
| Bid | number | FK, CK |
| Quantity | number |  |

## BloodGroup Table

| Field | Datatype | Extras |
| ------ | ------ | ------ | 
| Bid | number | PK |  |
| GroupName | varchar2(20) |  |

## Admin Table

| Field | Datatype | Extras |
| ------ | ------ | ------ | 
| Username | varchar2(40) | PK | 
| Password | varchar2(20) |  |
