// let json = '{"name":"John", "age": 30}'; // data from the server

// let user = JSON.parse(json); // convert the text representation to JS object

// // now user is an object with properties from the string
// alert( user.name ); // John
// alert( user.age );  // 30

let json = "{ bad json }";

try {

  let user = JSON.parse(json); // <-- when an error occurs...
  alert( user.name ); // doesn't work

} catch (e) {
  // ...the execution jumps here
  alert( "Our apologies, the data has errors, we'll try to request it one more time." );
  alert( e.name );
  alert( e.message );
}