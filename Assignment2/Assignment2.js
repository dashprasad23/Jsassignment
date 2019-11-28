//named function
console.log("______________circumferance of circle_________");
function circle(r)
{
    var res=2*3.414*r;
    console.log('circumference of the circle is=',res);
}
circle(5);
//2.Function Expression(Anonymus)
var cir=function(num)
{
    var res1=2*3.414*num;
    console.log('circumference of the circle is=',res1);

}
cir(4);
//3.self invoked function
(function(re){
    var result=2*3.414*re;
    console.log('circumference of the circle is',result);
})(43);
//4.fat arrow function
var res=(f)=>
{
    var res23=2*3.414*f;
    console.log('circumference of the circle is',res23);
}
res(34);
//-------------------------------------------
//Named function
console.log('_____________Fibonacy number___________________');
function fibonacy(num){
    var a=0;
    var b=1;
    var sum;
    for(var i=0;i<=num;i++)
    {
        sum=a+b;
        a=b;
        b=sum;
        console.log(a);
    }
    
}fibonacy(6);
console.log('------------------');
//2.Function Expression(Anonymus)
var fib=function(num1)
{
    var x=0;
    var y=1;
    var sum;
    for(var i=0;i<=num1;i++)
    {
        sum=x+y;
        x=y;
        y=sum;
        console.log(y);

    }
}
fib(6);
console.log('------------------');
//3.self invoked function
(function(numx){
    var x1=0;
    var y1=1;
    var sum1;
    for(var i=0;i<=numx;i++)
    {
        sum1=x1+y1;
        x1=y1;
        y1=sum1;
        console.log(y1);

    }


})(6);
console.log('------------------');
//4.fat arrow function
var fib=(b)=>
{
    var num1=0;
    var num2=1;
    var sum=0;
    for(var i=0;i<=b;i++)
    {
        sum=num1+num2;
        num1=num2;
        num2=sum;
        console.log(num2);

    }

}
fib(6);
//factorial
//1.Named function
console.log('___________factorial________________');
var fact=1;
function factorial(num1){
    for(var i=num1;i>0;i--)
    {
        fact*=i;
    }
    console.log("the factorial of number is=",fact);
    
    
}factorial(5);
//2.Function Expression(Anonymus)
var fact1=1;
var fact=function(num1)
{
    for(var i=num1;i>0;i--)
    {
        fact1*=i;

    }
    console.log("Factorial of number is",fact1);
}
fact(5);
//3.Self Invoked Function
var res=1;
(function(x){
    for(var i=x;i>0;i--)
    {
        res*=i;
    }
    console.log("the factorial of number is",res)

})(5)
//4.Fat arrow function
var y=1;
var div=(q)=>{
    for(var i=q;i>0;i--)
    {
        y*=i;

    }
console.log("the factorial of the number is",y)
}
div(5)
//named function
console.log('__________________array sum________________');
function arrsum(){
    var sum=0;
var arr=[23,45,76,87];
for(var i=0;i<arr.length;i++)
{
    sum+=arr[i];
}
console.log('array sum is',sum);

}arrsum();
//2.Function Expression(Anonymus)
var sur=function(){
    var sum1=0;
    var arr1=[10,10,10,10];
    for(var i=0;i<arr1.length;i++)
    {
        sum1+=arr1[i];
    }
    console.log('array sum is',sum1);
    
    
}
sur();
//self invoked function
(function(){
    var s=0;
    var ar=[2,622,900,13445];
    for(var i=0;i<ar.length;i++)
    {
        s+=ar[i];
    }
    console.log('array sum is',s);
    
})();
//flat arrow function
var sar=()=>
{
    var sum2=0;
    var arr2=[10,20,30,40];
    for(var i=0;i<arr2.length;i++)
    {
        sum2+=arr2[i];
    }
    console.log('array sum is',sum2);
    

}
sar();
//named function
console.log('_________________prime number_____________');
function pr1(num)
{
    var count=0;
    for(var i=1;i<=num;i++)
    {
        if(num%i===0)
        {
            count+=1;
        }
    }
    if(count>2)
    {
        console.log(num,'is not prime');
    }
    else{
        console.log(num,'is prime');
    }
}pr1(5);
//2.Function Expression(Anonymus)
var pr1=function(num1){
    var count=0;
    for(var i=1;i<=num1;i++)
    {
        if(num1%i===0)
        {
            count+=1;
        }
    }
    if(count>2)
    {
        console.log(num1,'is not prime');
    }
    else{
        console.log(num1,'is prime');
    }

}
pr1(12);
//3.self invoked function
(function(x){
    var cr=0
    for(var i=1;i<=x;i++)
    {
        if(x%i===0)
        {
            cr+=1;
        }
    }
    if(cr>2)
    {
        console.log(x,'is not prime');
    }
    else{
        console.log(x,'is prime');
    }}
    )(15);
//4.flat arrow function
var prm=(numw)=>
{
    var c=0;
    for(var i=1;i<=numw;i++)
    {
        if(numw%i===0)
        {
            c+=1;
        }
    }
    if(c>2)
    {
        console.log(numw,'is not prime');
    }
    else{
        console.log(numw,'is prime');
    }
    
}
prm(43);