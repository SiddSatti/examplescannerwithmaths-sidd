//Scanner is not a standard built in Java feature
//as not all programs need to use Scanner for input
//so we need to specifically go get the Java library that
//has the Scanner class in it so we can use those methods


//A practice for using Scanner object to receive input from the keyboard through the console
public class UserInputPractice {

    //to take input from the user there are a number of options
    //one of the options is taking the input from the keyboard
    //through the console
    //this needs to be done from a special kind of object
    //called Scanner
    //in order to make object we need to use certain syntax
    //ClassName (in our case Scanner)
    //variable_name (we will come up with something)
    //assignment operator (=)
    //keyword new ClassName (this one should make the first one we used, so for us Scanner)
    //() where we pass in arguments that are needed to make the object


    //now that we have an object we can use the various
    //methods from the Scanner class to capture user input
    //the method we want to use depends on the data we are
    //hoping to capture
    //in order to use these methods we need to do the following
    //variable_name (this is what we called our Scanner object)
    //.methodName (we need to use the . before the methodName)
    //() any arguments that are needed to use the method
    //all the Scanner methods we will use do not have any arguments so our () will be empty


    //whenever a Scanner method is reached the program will wait for
    //input
    //without a prompt the user may have no idea that we are waiting
    //for some input
    //we now have a prompt to the user
    //we are not storing the number the user is entering
    //into any variable so we are not doing anything with it


    //the variable type we use should match the
    //type we are expecting from the user


    //once we have this value from the user we can
    //manipulate it as we want


    //we can print it out as well just as any
    //other variable


    //when using certain Scanner methods a newline
    //character is stored in the buffer and
    //unless we clear that buffer we will not be able
    //to enter Strings from the user


    //not clearing the buffer only impacts our ability
    //to take in String variable via nextLine
    //we can take in another integer or double or single character with no issues


    //clearing the buffer involves making a call to a method that
    //can capture the newline character without leaving another one behind
    //only the .nextLine() can do that
    //we make this method call without storing it into any variable as
    //we only want to clear out this buffer not user it for anything


    //once we have cleared the buffer we can then proceed to
    //get String values from the user and store them as we
    //would using other types



}
