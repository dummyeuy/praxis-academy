var fs = require('fs');
fs.readFile('file.txt', 'utf8', function(err, data) {
    // called at a later time when the results are in
    console.log(data)
});
// readFile returns immediately and this line is react

// Uncaught ReferenceError: require is not defined
//     at scriptNonBlocking.js:1