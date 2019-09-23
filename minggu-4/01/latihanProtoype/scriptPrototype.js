function Animal(name){

    // 'this' is an object we are about to create
    this.name = name; // add property 'name' with value recieved from argument
    
    // add a method on object
    this.getName = function() {
        // here 'this' is also the object as function belongs to the object
        return 'Animal name is => ' + this.name;
    }
}

// log prototype
console.log(Animal.prototype);

// Object
// constructor: ƒ Animal(name)
// arguments: null
// caller: null
// length: 1
// name: "Animal"
// prototype: {constructor: ƒ}
// __proto__: ƒ ()
// [[FunctionLocation]]: scriptPrototype.js:1
// [[Scopes]]: Scopes[1]
// __proto__: Object