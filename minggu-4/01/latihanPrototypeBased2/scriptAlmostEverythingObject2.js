var mike = {name= "Mike"} ;
var odd = [1];
var morning = function() {return "Greetings!";}
morning.info = 'Morning greeting function';

// re-assign to new varibles
var evening = morning;
var john = mike;
var even = odd;

// re-assign to new variables and modify values
var kate = mike;
kate = {name: 'Kate'};

// modify properties
evening.info = 'Evening greeting function';
john.name = 'John';
even[0] = 1;

console.log('first ==> ', morning.info, mike, odd);
console.log('second ==> ', evening.info, john, even);

// Uncaught SyntaxError: Invalid shorthand property initializer