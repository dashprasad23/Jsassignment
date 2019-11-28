var city=['Beijing','Karachi' ,'Istanbul' ,'Dhaka','Tokyo','Moscow','Manila' ,'Shanghai ','Delhi','Mumbai'];
for(var i=0;i<city.length;i++)
{
    console.log(city[i]);
}
//for in loop
var touristplace=['nandihills','coorg','ooty','goa','haridwar','Rishikesh'];

var x;
for (x in touristplace) {
  console.log(x);
}
//for of loop
var religion=['Hindu','Muslims','Sikh','Christen','Juis','Buddhist','Jain','Spritualism']
var x;

for (x of religion) {
  console.log(x );
}
//for each loop
var helicaptor=[
  {
      Name:'Dhrub',
      speed:'400kmph',
      Orign:'India'
  },
  {
      Name:'MI-17',
      speed:'600kmph',
      Orign:'russia'

  },
  {
      Name:'Apache',
      speed:'600kmph',
      Orign:'USA'

  },
  {
      Name:'WesLand SeaKing',
      speed:'700kmph',
      Orign:'UK'
  },
  {
      Namee:'Kamove ka16',
      speed:'750kmph',
      Orign:'russia'

  },

  {
    Namee:'rudra',
    speed:'750kmph',
    Orign:'India'

  },
  {
    Namee:'Lch',
    speed:'750kmph',
    Orign:'India'

  },
  {
  Namee:'viper',
  speed:'750kmph',
  Orign:'USA'
  },
  {
    Namee:'puma',
    speed:'750kmph',
    Orign:'france'

  }



]
helicaptor.forEach(function(value,index)
{
  console.log('Helicaptors list:',value);
  console.log('Index of helicaptors',index);

});
