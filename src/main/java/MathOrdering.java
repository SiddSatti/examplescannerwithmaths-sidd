public class MathOrdering {

    //in Java the same order of operations are followed
    //as they are in Math class



    //we can use variables as well



    //remember human readability is important when writing code
    //it is useful to give help whenever possible
    //there is no harm in putting parenthesis around the expression
    //to make it easier to read


    //in programming we have a new operator for Math calculations
    //you may not be familiar with it
    //it is called modulus and it is symbolized with a %
    //modulus can be thought of a clock operations
    // you create a clock with Z amount of numbers
    //you go around that clock a certain amount of time and will end
    //on a value that is you answer
    //in short modulus will return to you the remainder of division
    //we have a clock with 7 digits (0-6) we will go around that clock 11 hours
    //if we draw this out we would end up on the 4, which is our answer
    //modulus occurs on the same level as multiplication and division
    //in order of operations



    //the computer requires very specific directions when performing actions
    //if you give the computer two whole numbers to divide together it
    //will treat the answer as being a whole number only, even
    //if there is supposed to be decimals int he answer
    //even if we are storing the answer in a double or float



    //in order to get a remainder we must make at least one
    //of the values a decimal number or it must be a double variable



    //sometimes we are given a double answer, but we only care about
    //the integer portion of the answer
    //we only want the integer portion
    //we want to store the answer into an int variable
    //we cannot store a double into an int
    //we will to temporary convert our double answer to be of type int
    //for the storing
    //this is done through typecasting
    //to typecast we place (TYPE) before the answer we want to convert
    //we would replace the word TYPE with whatever datatype we want to convert to
    //Math.random() [which we will see about in more detail soon return a double number]
    //we want a number between 1 and 10, we need to typecast the answer we get from
    //the (Math.random() * 10) expression to be an int first and then add a 1 to that
    //then store that answer into the variable



    //sometimes we may need to or want to increase or decrease
    //some variable by only 1
    //instead of type variable_name + 1 or variable_name - 1 constantly
    //we can instead say variable_name++ or variable_name--
    //however the ++ or -- can go before or after the variable_name
    //and that impacts the overall results


    //using the ++ or -- after the variable_name does its operation AFTER the line
    //of code is executed
    //saying firstNumber++ means that firstNumber will be increased by one
    //however it will happen after that line of code is executed



    //using the ++ or -- before the variable_name does its operation BEFORE the other operations
    //if we were to instead say ++firstNumber this
    //means that the number is increased first then the operations happen


}
