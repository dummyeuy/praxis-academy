var fs = require('fs');
var contents = fs.readFileSync('file.txt', 'utf8');
// this line is not reached until the read results are in
console.log(contents);

// Uncaught ReferenceError: require is not defined
//     at scriptBlocking.js:1