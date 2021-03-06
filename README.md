﻿# LifeJacket
To start the front-end server type:
    cd client
    npm install
    ng serve --open  OR ng s -o
    
To start java backend:
    To run the java portion of the LifeJacket project in intelliji you need to first
    pull the project on the computer. Next open the Intelliji IDE. Select import project,
    then select gradle project. After a file explorer should open you will have to open
    the pulled LifeJacket project. If intelliji cannot automatically tell where your main file is,
    you may have to open the project into a more specific folder. Once imported you should be able
    to press the run button to have the code run. If it does not, please make sure you have imported Gradle changes. 
    Also check the java compiler version by going to (file, setting, compiler, java compiler). The build.gradle specifies 
    java version 11, and is meant to be automatically sensed. However if experience difficulty, try to set the java version manually.
    
To start the middleware, cd to the project directory, then run cd to the correct directory and then run using the command 'dotnet run' 
(https://docs.microsoft.com/en-us/dotnet/core/tools/dotnet-run)
which will build and run:

cd C:\Users\{username}\source\repos\LifeJacket\Auth>
C:\Users\{username}\source\repos\LifeJacket\Auth>dotnet run

On the dev environmnet, my port is 44375.  But in production, 
the port number will be displayed in the command line window: 

the info: Microsoft.Hosting.Lifetime[0]
      Now listening on: https://localhost:5001
info: Microsoft.Hosting.Lifetime[0]
      Now listening on: http://localhost:5000

To test run the app, then use Postman and replace the port number with the correct port i.e. <5001> (for https)
(or one of the port numbers displayed in the command line) i.e.
https://localhost:5001/api/Login

***(need to add postman config files to github for Postman tests?)***

or call with client code, or nagivate to same url in browser (or curl?)

The Post method expects a json object as a parameter that is bound using the request body.
However you will get an empty result unless passing in the proper json in POST Method of the body
For example this is what you will see in the browser with no data passed in:


The POST() method of the LoginController expects a json structure similar to below to be posted in the body:
{
    "name": "Brandon Roberts",
    "email": "brandon.roberts@email.com",
    "photoUrl": "https://lh3.googleusercontent.com/a-/AAuE7mBr5bTYig1ynT...",
    "firstName": "Brandon",
    "lastName": "Roberts",
    "authToken": "ya29....XYZ",
    "idToken": "eyJhbGc--...nIqq3M2Iw",
    "provider": "GOOGLE"
}

And will return the following if successful:
brandon.roberts@ruralsourcing.com

For this controller route:  https://localhost:44375/api/login  There are 3 actions:  

Post (expects json user object in body) writes to user table and returns email string 
Get (returns all users as json) returns json with all users in user table.
Delete (expects json [From Body] _ returns confirmation or error message.

