function func() {

    try {
      return 1;
  
    } catch (e) {
      /* ... */
    } finally {
      alert( 'finally' );
    }
  }
  
  alert( func() ); // first works alert from finally, and then this one