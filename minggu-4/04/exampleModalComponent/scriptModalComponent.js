// register modal component
Vue.component('modal', {
    template: '#modal-template'
})

// start app
new Vuew ({
    el: '#app',
    data: {
        showModal: false
    }
})