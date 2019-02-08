const items = [[1,2,3],[4,5,6]]
const items2 = [[1,2,3],[4,5,[6]]]

// iteration is brittle because level of nesting is assumed. 
function findNo( items, no ) {
    let hasNo = false;

    items.forEach(element => {
        element.forEach ( e => { 
            if ( e === no ) { 
            hasNo = true;
                console.log ( "Found no : " + no )
            }
        });
    });
    return hasNo;
}

// recursion is suitable when the level of nesting is unknown. 
function rec_findNo( items, no ) {
    let hasNo = false;
    if ( Array.isArray (items)) {
        items.forEach ( element => { 
            hasNo = rec_findNo ( element , no )
            if ( hasNo === true ) 
                return hasNo; 
        });
    } 
    else 
    {
        hasNo = check ( items , no ) ;
    }

    function check ( i , no ) { 
        return ( i === no ) 
    }
return hasNo;
}

console.log ( rec_findNo ( items2 , 7) )
