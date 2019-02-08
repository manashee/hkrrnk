function move ( disk, from, to , helper ) { 

    if ( disk === 0 )
        return

    move ( disk - 1 , from , helper, to ) ;  
    console.log ( "moving " + disk + " from " + from + " to " + to ); 
    move ( disk - 1 , helper, to , from ) ;
}

move ( 4 , 'A', 'B', 'C');
