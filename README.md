# Collect

The application is developed using SpringBoot Framework in Java. It is using mongoDb for storing the responses and questions.
MongoDb database is sitting in MongoDB Atlas cloud.

I used postman to make the api calls and get and post the data into the database.

There are total three collections used for this code. A sample schema has been created and also mentioned below:

1)COLLECT (1st collection-for storing the responses0
{"_id":"5cbb5ec3c46ffc285ca30caf","username":"u1","question1":"yes","question2":"no"}
{"_id":"5cbb6390a154a719f0ce59a0","username":"u2","question1":"no","question2":"yes"}

2)QUESTION(for storing the questions. Further it can be nested to include type of questions and if mcqs then choices. That can be achieved using the nested documents. I have kept it basic for the sample purpose.)
{"_id":"5cbb63caa154a719f0ce59a1","qid":"1","desc":"Do you like cricket?"}
{"_id":"5cbb6413a154a719f0ce59a2","qid":"2","desc":"Do you like football?"}

3)USER(for storing user details)
{"_id":"5cbb6488a154a719f0ce59a4","username":"u1","name":"gourav"}
{"_id":"5cbb64aaa154a719f0ce59a5","username":"u2","name":"mukund"}

Coming to the use case for google sheets, I researched a lot of tools like Zapier,Parabola,Holisti,etc and there are lot of tools which are already developed for this automation purpose to update data from mongodb to google sheets. So i did again write a script to automate it because as allready lot of tools are there it is better to reuse the existing thing .

So i tried to use zapier in particular to automate it (one reason being it has free trial version) so created the workflow in zapier but there is some glitch from zapier end and i am trying to resolve it with the team.
But that is not fully complete because of the issue that it is not able to get collections from the database.
There are other solutions but they were licensed.

I have added a word document named screenshots where i have given the screenshots of the workflow in zapier, postman calls, mongodb atlas database schema.
