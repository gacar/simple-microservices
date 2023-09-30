# simple-rest-services
This project basic element of microservices, api-gateway, service-registery and two rest services

These applications should be started in the following order.
- Discovery Server
- Email Servive and Sms Service
- ApiGateway Service


## Testing applications
Discovery Server is using 8761
Email service is using 8081
Sms service is using 8091
ApiGateway is using 8080

Email service and Sms service are empty services, they are not sending any sms or email
Each services have one method for displaying routing system.
Sms service can be tested in http://localhost:8091/sms/sendEmail or http://localhost:8091/sms/sendEmail?message=test
Email service can be tested in http://localhost:8081/email/sendEmail or http://localhost:8081/email/sendEmail?message?test2

for using these services from Api Gateway, below addresses can be used. 
http://localhost:8080/sms/sendSms or http://localhost:8080/email/sendEmail
Api Gateway is routing requests from 8080 port. 


  


