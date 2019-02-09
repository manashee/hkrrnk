
function factorial ( n ) {
    if ( n == 0 ) return 1;
    return n * factorial ( n -1 );
}

function tailFactorial ( n  ) {

    function tailFactorialAcc ( n , acc ) {
        if ( n == 0 ) return 1 ;
        return tailFactorialAcc ( n  * acc ) ;
    }
    
    return tailFactorialAcc ( n , 1 ) ;
}


console.log ( factorial ( 4 ) ) ; 
console.log ( tailFactorial ( 4 ) ) ; 
