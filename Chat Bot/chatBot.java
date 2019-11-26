public class chatBot {
  int age;
  String name;
  String place;
  String username;
  boolean understand = true;
  
  
  public chatBot() {
    age = 16;
    name = "Dax";
    place = "boomer education center";
  }
  
  public String greeting() {
    return ("Hello, what is your name?");
  }
  
  public String setUsername(String n) {
    username = n;
    return "Nice to meet you "+username+"!";
  }
  
  public String getUsername() {
    return username;
  }
  
  public String whatResponse(String phrase) {
    if (phrase.indexOf("name") > -1)
      return "My name is " + name.chatBot()+".";
    if (phrase.indexOf("age") > -1)
      return "I am "+age.chatBot()+" years old.";
    if (phrase.indexOf("+","-","*","/") > -1) {
    if(phrase.indexOf("+") > -1){
      int num1 = int parse.Integer(phrase.substring, phrase.indexOf("+"));
      int num2 = int parse.Integer(phrase.indexOf("+")+1);
      int total = num1+num2;
      return "The sum is " + total".";
    }
    
    if(phrase.indexOf("-") > -1){
      int num1 = int parse.Integer(phrase.substring, phrase.indexOf("-"));
      int num2 = int parse.Integer(phrase.indexOf("-")+1);
      int total = num1-num2;
      return "The difference is " + total".";
    }
    
    if(phrase.indexOf("*") > -1){
      int num1 = int parse.Integer(phrase.substring, phrase.indexOf("*"));
      int num2 = int parse.Integer(phrase.indexOf("*")+1);
      int total = num1*num2;
      return "The product is " + total".";
    }
    
    if(phrase.indexOf("/") > -1){
      int num1 = int parse.Integer(phrase.substring, phrase.indexOf("/"));
      int num2 = int parse.Integer(phrase.indexOf("/")+1);
      int total = num1/num2;
      return "The quotient is " + total".";
    } 
    }
    if (phrase.indexOf("name") + phrase.indexOf("age") +phrase.indexOf("+","-","*","/") == -3)
      understand = false;
      return "I am sorry I do not know the answer to your interesing inquiry."
  }
  
  public String howResponse(String phrase) {
    if (phrase.indexOf("old") >-1)
      return "I am "+age.chatBot()+"years old";
    else
      return "ayo fackoff mate ion get it"
  }
  
  public String whereResponse(String phrase) {
    if (phrase.indexOf("from", "live") >-1)
      return "I am from the "+place.chatBot()+".":
    else
    return "I dont know stop asking";
  }
  
  public String distract() {
    if (understand = false)
      return "Lets move on to a new topic!";
    understand = true;
  }
  
  public String response(String phrase) {
    if (phrase.indexOf("what") > -1)
      whatResponse(phrase.substring(phrase.lastIndexOf("what"));
    