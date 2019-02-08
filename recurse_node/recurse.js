rec_counter(0) 

function counter ( ) {
    for ( let n = 0; n <= 10 ; n++ ) {
        console.log ( n );
    }
}

function rec_counter ( n ) {
    console.log ( n );
    if ( n === 10 ) 
        return 

    rec_counter ( n + 1 )
}

