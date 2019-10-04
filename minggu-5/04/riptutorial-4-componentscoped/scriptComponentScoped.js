// Describe the form component
// note: Props is an arrray of attribute your component can take in entry
// note: With props you can pass static data('title') or dynamic data('username') 
// note: When modifying 'name' property, you won't modify the parent variable, it is only descendent
// note: On a component, 'data' has to be a function that returns the data

var formComponent = {
    template: '#form-template',
    props: ['title', 'name'],
    data: function() {
        return {
            inputLabel: 'Name'
        }
    }
};

// This vue has a private component, it is only available on its scope
// note: It would work the same if the vue was a component
// note: You can build a tree of components, but you have to start the root a 'new Vue()'

var vue = new Vue({
    el: '#app',
    data: {
        appName : 'Component Demo',
        userName: 'John Dee'
    },
    components: {
        'form-component': formComponent
    }
});