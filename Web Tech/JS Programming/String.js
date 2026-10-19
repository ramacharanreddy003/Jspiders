///let str="abcdefa"
// console.log(str.length);
// console.log(str[-1]);
// console.log(str.charAt(-1));
// console.log(str.at(-1));

// console.log(str.indexOf("a"));
// console.log(str.lastIndexOf("a"));

// console.log(str.includes("a"));
// console.log(str.includes("z"));

// console.log(str.startsWith("a"));
// console.log(str.startsWith("b"));

// console.log(str.endsWith("a"));
// console.log(str.endsWith("n"));

// console.log(str.slice(3));
// console.log(str.slice(1,3)); 

// console.log(str.slice(3,1));
// console.log(str.substring(3,1));

// let words="abcd-efgh-ijklm-nopq-rstuv";
// console.log(words.split("-"));

// let mobile="500";
// console.log(mobile.padStart(10,"X"));
// console.log(mobile.padEnd(10,"X"));

// let str1="azAZ09";
// console.log(str1.charCodeAt(0));
// console.log(str1.charCodeAt(1));
// console.log(str1.charCodeAt(2));
// console.log(str1.charCodeAt(3));
// console.log(str1.charCodeAt(4));
// console.log(str1.charCodeAt(5));


//to find length of a string
// let string="laptop";
// console.log(string.length);

//WAJP to find length of a string with out using length method
// let strl="abcdef";
// let count=0;
// for(let i=0;i<strl.length;i++){
//     count++;
// }console.log(count);


// function findLength(str){
//     let i=0;
//     while(str[i]){
//         i++;
//     }
//     console.log(i);
// }
// findLength("abcdef");


//write a js program to reverse a string without inbuilt methods
// function revstr(str){
//     let res="";
//     for(let i=str.length-1;i>=0;i--){
//         res+=str[i];
//     }
//     console.log(res);
// } revstr("abcd");


//write a js program to reverse a string
// function revSTR(str){
//     return str.split("").reverse().join("");
// }
// console.log(revSTR("abcdef"));

//write a js program to check given string is a palindrome or not

// function palindrome(str){
//     let i=0;
//     let j=str.length-1;
//     while(i<j){
//         if(str.charAt(i)!=str.charAt(j)){
//             return false;
//         }
//         return true;
//     }
// }
// console.log(palindrome("madam"));

//pref
// function palindrome(str){
//     let i=0,j=str.length-1;
//     while(i<=j){
//         if(str[i]!==str[j]){
//             return false;
//         }
//         i++;
//         j--;
//     }
//     return true;
// }
// console.log(palindrome("malayalam"));
// console.log(palindrome("subdari"));


/////30/09/2026


//write a js program to count how many vowels present in a string

// let s="abcdef";
// let count=0;
// for(let i=0;i<s.length;i++){
//     if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'){
//         count++;
//     }

// }
// console.log(count);


// function countvowels(str){
//     let count=0,i=0,vowels="aeiou";

//     while(i<str.length){
//         if(vowels.includes(str[i])){
//             count++;
//         }
//         i++;

//     }
//     console.log(count);
// }
// countvowels("qwerty");


//write a js program to check frequency of each character in a string

// function frequency(str){
//     let obj={};
//     let i=0;
//     while(i<str.length){
//         let char=str[i];
//         obj[char]=(obj[char] || 0)+1;
//         i++;
//     }
//    console.log(obj);

// }frequency("hello");
// frequency("abc");




//word count 
// let str="word count";
// let count=0;
// for(let i=0;i<str.length;i++){
//     if(str==" "){
//         count++;
//     }
// }
// console.log(count); 


//find the first non-repeating charatacter "aabbcdde"->"c"



//find the first repeating charatacter "abcdea"->"b"


//count the number of words in a string  "JavaScript is awesome"->3



//anagram or not "listen"-->"silent"==>true
// function anagram(str1,str2){
//     while(str1.length>0){
//         if(str1.length!=str2.length){
//             return true;
//         }
//     }
// }



// function isanagram(s1,s2){
//     while(true){
//         if(s1.length!=s2.length)
//             return false;
//         if(s1.length==0&&s2.length==0)
//             return true;
//         let char=s1.charCodeAt(0);
//         s1=s1.replace(char+"","");
//         s2=s2.replace(char+"","");
//     }
// }
// console.log(isanagram("silent","listen"));



///////////////////////////////////////////////////////////////////////////

//word count
// function countwords(str) {
//     let words = [];
//     let word = "";
//     for (let i = 0; i < str.length; i++) {
//         let char = str[i];
//         if (char === " ") {
//             words.push(word)
//             word = ""
//         }
//         else {
//             word += char;
//         }
//     }
//     if (word !== "") {
//         words.push(word)
//         word = ""
//     }

//     console.log(words.length);
// }
// countwords("I am a boy");


//remove duplicate characters

// let res="hello";
// for(let char of res){
//     if(!res.includes(char))
//         res+=char;

// console.log(char);}


//reverse words in a sentence
// function reversewords(str)
// {
//     let words=[];
//     let word="";

//     for(let i=0;i<str.length;i++){
//         let char=str[i];

//         if(char===" "){
//             if(word!=="")
//                  words.push(word);
//                 word="";

//         }else{
//             word+=char;
//         }
//     }
//     if(word!=""){
//         words.push(word);
//     }
//     for(let i=words.length-1;i>=0;i--)
//         console.log(words[i]);

// }
// reversewords("I am a Boy");
// reversewords("I Love JavaScript");



//largest word in a sentence 

// function longestword(str) {
//     let word = "";
//     let longest = "";

//     for (let i = 0; i < str.length; i++) {
//         let char = str[i];

//         if (char === " ") {
//             if (word.length > longest.length)
//                 longest = word;
//             word = "";
//         }
//         else {
//             word += char;
//         }
//     }
//     if(word.length>longest.length)
//         longest=word;

//     console.log(longest);
// }
// longestword("I am a Developer");



//largest word in a sentence
// function largestword(sentence){
//     let array=split.words(sentence);
//     let largest=arr[0];
//     for(let i=1;i<arr.length;i++){
//         if(arr[i].length>largest.length){
//             largest=arr[i];
//         }
//     }
//     console.log(largest);
// }
// largestword("Java is a programming language");


//capitalize the first letter of every word
// function Capitalize(str){
//     let result="";
//     let firstletter=true;

//     for(let i=0;i<str.length;i++){
//         let char=str[i];

//         if(char===" "){
//             result+=char;
//             firstletter=true;
//         }
//         else{
//             if(firstletter){
//                 result+=char.toUpperCase();
//                 firstletter=false;
//             }else{
//                 result+=char;
//             }
//         }

//     }
//     console.log(result);
// }
// Capitalize("I am a developer");



//check if  string contains only digits
//"1234"--->true
//"123a5"-->false

// function onlydigit(str){
//     for(let i=0;i<str.length;i++){
//         let char=str[i];

//         if(char<'0' || char>'9')
//             return false;

//     }return true;
// }
// console.log(onlydigit("12345"));
// console.log(onlydigit("213h77"));

/////////////////////////

//most frequent character
// function mostfrequent(str) {
//     let count = {};

//     for (let i = 0; i < str.length; i++) {
//         let char = str[i];

//         if (count[char]) {
//             count[char]++;

//         } else {
//             count[char] = 1;
//         }
//     }
//     let maxchar = "";
//     let maxcount = 0;

//     for (let char in count) {
//         if (count[char] > maxcount) {
//             maxcount = count[char];
//             maxchar = char;
//         }
//     }
//     console.log(maxchar);
//     console.log(maxcount);
// }
// mostfrequent("programming");


//capitalize word first letter

// let str="hello how are you";
// let result=str.split(" ").map((word)=>word[0].toUpperCase()+word.slice(1).toLowerCase()).join(" ");
// console.log(result);


////sorting / reversing


// let arr=[3,4,5,1,2,3,4,9,4];

// arr.sort((a,b)=>a-b)
// let ascendingarray=arr.toSorted((a,b)=>a-b);
// arr.reverse();


// let reverseArray=arr.toReversed();
// console.log(arr);
// console.log(reverseArray);

// console.log(ascendingarray);


//let arr1=['a','b','c','d',65];
// console.log(arr1[-1]);
// console.log(arr1.at[-1]);
// console.log(arr1.toString());

// console.log(arr1.toLocaleString());

// console.log(Array.isArray(arr1));

// let str="abcdefg";
// console.log(Array.from (str));
// console.log(Array.of(str));


////Array programming questions - Fresher level


// //Easy level
// //1. Find the largest Element
// //Given an integer array, find largest element without using built-in sorting methods
// //exmple: 
// //input: [10, 25, 7, 45, 18] output: 45
// function findLArgestElement(arr){
//     let largest=arr[0];
//     for(let i=0;i<arr.length;i++){
//         if(arr[i]>largest){
//             largest=arr[i];
//         }
//     }
//     console.log(largest);
// }
// findLArgestElement([10,25,7,45,18]);



//2. find smallest element
//find the smallest element in an array
//ex: input [12,5,18,3,9] output: 3

// function findSmallestElement(arr){
//     let small=arr[0];
//     for(let i=0;i<arr.length;i++){
//         if(arr[i]<small){
//             small=arr[i];
//         }
//     }
//     console.log(small);
// }
// findSmallestElement([10,25,7,45,18]);


///3. Calculate the Sum and Average
//Find the Sum and average of all elements in an array
//Example:
//input{10,20,30,40,50}
//sum: 150   Average : 30.0

// function SumAndAvg(arr){
//     let sum=0;
//     let avg=0;
//     for(let i=0;i<arr.length;i++){
//         sum+=arr[i];
//         avg=sum/arr.length;

//     }
//     console.log(sum);
//     console.log(avg);

// }
// SumAndAvg([10,20,30,40,50]);


//4.Search an element
//given an array and a target value, check whether the target exists in the array. If it exists, print its index, otherwise print -1
//Example
//Input: {10, 20, 30, 40, 50} Target: 30
//Output: Element found at index 2

// function SearchElement(arr){

//     for(let i=0;i<arr.length;i++){

//     }
// }







//6.Reverse an array 
//reverse the elements of an array without creating another array.
//example: input: {10, 20, 30, 40, 50} output: {50, 40, 30, 20, 10}



//7. Find the Second Larget element
//find the second largest distinct element in an array without using sorting
//example: input:  {10, 25, 7, 45, 25, 18} output : 25



//=====08-10-2026=======


//===recursion 
//==basecase --breakpoint
//==recursive case --looping statement
// function demo(n){
//     if(n===1){
//         console.log(n);
//        return;
//     }
//     console.log(n);
//     demo(n-1);
// }
// demo(5);


//print 1 to 100 without loop

// function numbers(n){
//      console.log(n);
//     if(n===100)

//         return;
//     console.log(n);
//     numbers(n+1);
// }
// numbers(1)


//1.write a js progrm to print sum of 1 to 5 nums

// function sum(n) {

//     if (n === 1)
//         return n;
//     return n+sum(n-1);
// }
// console.log(sum(5));  


//1. print numbers from 1 to n

// function numbers(n){
//   console.log(n);
//     if(n===1)
//         return;
//     numbers(n-1); 
// }
// numbers(100)



//2. nums from N to 1





//3. factorial of a given number
// function factorial(n){
//     if(n===1) return n;
//     return n*factorial(n-1);
// }
// console.log(factorial(5));


//4.power of a number
// function power(n,exponent=n) {
//     if(exponent===0)
//         return 1;
//     return n*power(n,exponent-1)

// }
// console.log(power(3));


//count no of digits
// function count(n){
//     if(n===0)
//         return n;
//     return 1+count(Math.floor(n/10))

// }
// console.log(count(19848));


