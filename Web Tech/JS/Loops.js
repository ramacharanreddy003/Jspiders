// let i=1;
// while(i<=5){
//     console.log(i);
//     i++;
// }


// let i=50;
// while(i>=40){
//     console.log(i);
//     i--;
// }

// let i=1;
// do{
//     console.log(i);
//     i++;
// }while(i<=10);


// let i=10;
// do{
//     console.log(i);
//     i++;

// }while(i<=8);

//let n=15.5;
//console.log(Math.trunc(n));

//let m=45.4;
//console.log(Math.floor(m)); 

//sum of num
// let num=125;
// let sum=0;
// while(num>0){
//    let r=num%10;
//    sum+=r;
//    num=Math.trunc(num/10);

// }
// console.log(sum);


//number of digits
// let count=0,sum=0;
// for(let n=12345;n>0;n=Math.trunc(n/10)){
//     sum+=(n%10);
//     count++;
// }
// console.log(count);





// let nums=[45,18,7,10,77];
// console.log(nums);
// for(let i=0;i<nums.length;i++) {
//     if(nums[i]%2==0)
//         console.log(`${nums[i]} is even number`);
//     else
//         console.log(`${nums[i]} is odd number`);
// }


//let nums=[1,2,3,4,5];
// for(let i in nums)
// {
//     if(nums[i]%2==0) console.log(`${nums[i]} is Even`);
//     else console.log(`${nums[i]} is Odd`);
// }

// for(let n of nums){
//     if(n%2==0){
//         console.log(`${n} is Even`);

//     }else{
//         console.log(`${n} is  Odd`);
//     }
// }


// let str="";
// for(let  i=1;i<=5;i++)
//     //console.log(i);
//     if(i<=4) str=str+i+" ";
//     else str=str+i;
// console.log(str);


for (let i = 1; i <= 10; i++) {
    if (i % 2 == 0){
        //break;
        //continue;
        return;
    }
    console.log(i);
}
console.log("Outside loop");
