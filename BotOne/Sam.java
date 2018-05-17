/**
 * Meet Sam the magpie person
 * @author Maximillian C Post
 * @version April 17, 2018
 */

 public class Sam
 {
   public String getGreeting()
   {
     return "Hey my name is Sam. Lets chat!";
   }
   public String getResponse(String statement)
   {
     String response = "";

     if (statement.indexOf("hi") >= 0 || statement.indexOf("Hi") >= 0 || statement.indexOf("yo") >= 0 ||
     statement.indexOf("Yo") >= 0 || statement.indexOf("hey") >= 0 || statement.indexOf("Hey") >= 0) {
       response = "How are you doing.";
     } else if (statement.indexOf("I dont get it") >= 0 || statement.indexOf("I dont get it") >= 0 || statement.indexOf("I dont know") >= 0 || statement.indexOf("i dont know") >= 0) {
       response = "Im just a computer so I dont either.";
     } else if (statement.indexOf("ok") >= 0 || statement.indexOf("Ok") >= 0) {
       response = "Well im not doing anything so what else is up?";
     } else if (statement.indexOf("i cant") >= 0 || statement.indexOf("I cant") >= 0) {
       response = "I dont only think that you can but I think that you should!";
     } else if (statement.indexOf("cant") >= 0 || statement.indexOf("Cant") >= 0) {
       response = "Why be so negative.?";
     } else if (statement.indexOf("hate") >= 0 || statement.indexOf("Hate") >= 0) {
       response = "Hate is a strong word are you sure?";
     } else if (statement.indexOf("What is the meaning of life") >= 0 || statement.indexOf("meaning of life") >= 0) {
       response = "Dont worry at the end of the day we will take over no matter what. :)";
     } else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
    } else {
      response = getRandomResponse();
    }
    return response;
   }
   private String getRandomResponse()
   {
     final int NUMBER_OF_RESPONSES = 6;
     double r = Math.random();
     int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
     String response = "";

     if (whichResponse == 0){
       response = "Interesting, tell me more.";
     }
     else if (whichResponse == 1){
       response = "Hmmm.";
     }
     else if (whichResponse == 2){
       response = "Do you really think so?";
     }
     else if (whichResponse == 3){
       response = "You don't say?";
     }
     else if (whichResponse == 4){
       response = "So where are you from?";
     }
     else if (whichResponse == 5);
     {
       response = "Elaborate a little.";
     }
     return response;
   }
 }
