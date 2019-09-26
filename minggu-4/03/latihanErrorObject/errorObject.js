try {
    lololol; // error, variable is not defined!
  } catch(err) {
    alert(err.name); // ReferenceError
    alert(err.message); // lololol is not defined
    alert(err.stack); // ReferenceError: lalala is not defined at (...call stack)
  
    // Can also show an error as a whole
    // The error is converted to string as "name: message"
    alert(err); // ReferenceError: lalala is not defined
  }