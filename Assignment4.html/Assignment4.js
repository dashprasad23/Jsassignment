const items=[{
    name:'Ear ring',
    id:1,
    price:5000
}
,
{
    name:'Kajal',
    id:2,
    price:1000
},
{
    name:'Trimer',
    id:3,
    price:3000
},
{
    name:'Beardo',
    id:4,
    price:170
}
]
const xy=items.map(value=>
    {
        value.price=value.price+300;
        return value;
    });
console.log('price after adding 300',xy);
const ww=items.filter(i=>i.price>1000);
console.log('price grater than 1000',ww);
//array and string function