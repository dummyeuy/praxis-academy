// let error = new Error("Things happen o_O");

// alert(error.name); // Error
// alert(error.message); // Things happen o_O

// try {
//     JSON.parse("{ bad json o_O }");
//   } catch(e) {
//     alert(e.name); // SyntaxError
//     alert(e.message); // Unexpected token o in JSON at position 2
//   }

let json = '{ "age": 30 }'; // incomplete data

try {

  let user = JSON.parse(json); // <-- no errors

  if (!user.name) {
    throw new SyntaxError("Incomplete data: no name"); // (*)
  }

  alert( user.name );

} catch(e) {
  alert( "JSON Error: " + e.message ); // JSON Error: Incomplete data: no name
}