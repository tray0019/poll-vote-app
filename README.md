# poll-vote-app

## Technologies and Tools
- Spring Web
- Lombok
- Spring Data JPA
- MySQL Driver
- IntelliJ, Maven
- Visual Studio Code
- TypeScript
- Angular

## Steps Taken
1. Create the project in spring boot and open it in IntelliJ
2. Add datasource configuration in application properties
3. Created a Poll class in my Model package. Added appropriate annotations and created 2  List one for options and vote. They have both @ElementCollection.
- EllementCollection creates a new extra table in the database
4. Created my PollController and PollService Class. Set Appropriate annotations and methods. Added a PollRepositories.
5. Opened PostMan and create a request for the Poll questions
6. Created OptionVote class that takes voteOption and voteCount
7. Modified my Poll class and use optionVote as an arraylist
8. Added getAllPolls method @GetRequest Mapping. Add a response poll that getAllPoll by id. Added vote Post mapping that post vote.
9. Created a Vote class that takes pollId and optionIndex field
10. In my PollService I created vote method. This method get poll from db, options, selected option and increment vote for selected option, it also save the increment option into the database.
11. Install Node.js and Angular
12. Create the progect in terminal
- ng new poll-app --standalone --routing --skip-tests
13. Switch to pollapp using ls and cd path. Run npm start to build the project
14. Run the app and it was succesfull
15. Move and open project in visual studio code
16. Run the server by ng serve and create a poll interface model using [ ng generate interface --type=model
17. Added Interface OptionVote. Created service poll using ng generate service poll --skip-tests
18. In my Service interface, I aded two method to get pool and vore.
19. Generate a component poll for ui [ ng generate component poll --skip-tests ]
20. Updated component imports for PollComponent. Run the script and succesfully output the ui
21. Install bootstrap "npm install bootstrap"
22. Add the bootstrap key word in angular css ib both styles
23. Added method in PollComponent, methods laod the poll and subscribe.
24. In poll component I have implemented OnInit.
25. Modified App Config added, provideHttpClient that fix the ui issue.