setTimeout(function() {
    try {
      noSuchVariable; // try..catch handles the error!
    } catch {
      alert( "error is caught here!" );
    }
  }, 1000);