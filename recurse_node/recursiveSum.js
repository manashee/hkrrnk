function sum ( arr ) {
    let s = 0;
    for ( let i of arr )
    {
        s = s + i;
    }
    return s;
}

// base case and recursive case
function rec_sum ( arr ) {
    if ( arr.length == 0 ) return 0 ;
    return arr[0] + rec_sum ( arr.slice (1))
}

function rec_prod ( arr ) {
    if ( arr.length == 0) return 1 ;
    return arr[0] * rec_prod ( arr.slice ( 1 ));
}
console.log ( rec_sum ( [1,2,3,4,5,6]) )
console.log ( rec_prod ( [1,2,3,4,5,6]) )
