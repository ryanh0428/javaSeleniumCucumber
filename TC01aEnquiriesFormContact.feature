

Feature: TC01aEnquiriesFormContact

Description: Test that just the first name and last name cannot be entered to register an enquiry on the Contacts Page. 

@EnquiriesFormContactFail

Scenario Outline: Test that when all mandatory contact details are not entered then the message is not sent 

    Given the user is on the FDM contact page - http://www.fdmgroup.com/contact/ 

    And the contact window is maximised 

    And the contact wait is set for two minutes 

When The user is on the CONTACT page 

Then The heading is correct: Get in touch	 

When The user enters first name 'first_name' into the general enquiries first name field 

Then First name 'first_name' is displayed in the general enquiries first name field 

When The user enters last name 'last_name' into the general enquiries last name field 

Then Last name 'last_name' is displayed in the general enquiries last name field 

When The user presses the Submit button of the general enquiries form 

Then The user should remain on the contact page with the heading Get in Touch 

And An error occurs under general enquiries email field stating This field is required 

 

Examples: 

| first_name | last_name | 

| John | Seager | 

| Sandeep | Hunjan | 