# Criterion E: Evaluation

|                         Requirements                         |                          Discussion                          |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| Allow for people to register for the talent show and record their team name, a summary of what they're performing, their email address, and their phone numbers in a form and click submit | **MET**: There is a form with entries for a team name, a summary, an email address, and their phone number. |
| If the form data they entered is wrong, notify the users that they need to fill out the form again. | MET: If I fill out each part of the form incorrectly (or didn't fill it out at all) a distinct notification pops up saying that you have filled out that part of the form incorrectly. |
| Have the data from that form directly transfer to a spreadsheet to more easily facilitate manipulations of the data by the organizers. | MET: The data from the web form is directly transferred to a form using Ajax and artificially clicks the submit form to have Google format the data itself in the spreadsheet. |
| After the organizers determine times for each of the performers in the spreadsheet and put the times next to each performer. | MET: When my dad used a sample spreadsheet to come up with random times, it took him very little time -- about as much time as the Google Form solution. |
| Have an algorithm that calls the data in the spreadsheet and formats it into an appropriate dictionary with nested lists | MET: I have coded this in a file. It reads the data in the Google Sheet using the API. There is another function that creates an empty dictionary, and another function that puts in the values from the spreadsheet into the dictionary. |
| Have an algorithm that checks the current time and compares it with the times in the formatted dictionary to determine whether to start the notifier program. | MET: A made a simple function that calculates the current time, adds ten minutes, pipes it to another function as a string to compare the current time with the performance time in the dictionary. |
| After checking them in on the day of the event, show the participants what times they are performing and provide them with two reminders to get ready for the performance. | MET: I wrote a script using Twilio to send texts to people.  |

### Overall Evaluation (*refer to Appendix for more information*)

I met with my client and demoed the application for him. Mr. Kukunooru is very impressed with my product and agrees with me that I have met all the success criteria. Some feedback he provided:

* Create a front-end for the texting application to show the people texted and the time left until the next step. Also, have a utility that pauses the program for a while and that instantly allows you to move the program to the next person in the queue. 
* Use the Google Sheets API instead of the hacky Ajax solution. 

### Further Development

I went into this project with intermediate experience in HTML/CSS/JS and Python. From this project, I learned a great deal about manipulating parts of different APIs to accomplish a goal. I also learned how to use procedural decomposition to split up the program in multiple files. 

Some things that I would like to work on:

1. Based on the feedback from my client, I would like to use Python in web development, and explore its advantages and disadvantages. Python Flask is fast becoming a viable web development path, and I would like to learn how to use it before it becomes completely mainstream.
2. I would like to make a web app using Flutter for the web form. This way, I can simultaneously learn how to use Flutter (a scripting language similar to Java) and also make a web app that is more fast and easier for people to use than navigating to a website on mobile. 

