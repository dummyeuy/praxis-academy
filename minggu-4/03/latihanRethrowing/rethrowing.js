// let json = '{ "age": 30 }'; // incomplete data
// try {

//   let user = JSON.parse(json);

//   if (!user.name) {
//     throw new SyntaxError("Incomplete data: no name");
//   }

//   blabla(); // unexpected error

//   alert( user.name );

// } catch(e) {

//   if (e.name == "SyntaxError") {
//     alert( "JSON Error: " + e.message );
//   } else {
//     throw e; // rethrow (*)
//   }

// }

function readData() {
    let json = '{ "age": 30 }';
  
    try {
      // ...
      blabla(); // error!
    } catch (e) {
      // ...
      if (e.name != 'SyntaxError') {
        throw e; // rethrow (don't know how to deal with it)
      }
    }
  }
  
  try {
    readData();
  } catch (e) {
    alert( "External catch got: " + e ); // caught it!
  }