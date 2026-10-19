//09-10-2026
//Two pointer approach

//--write a JS program to find duplicate elements in a given array

// function findDuplicate(arr){
//     let flag=true;
//     for(let i=0;i<arr.length;i++){
//         for(let j=0;j<arr.length;j++){
//             if(arr[i]==arr[j])
//                 flag=false;
//         }
//         if(flag)
//             console.log(arr[i]);
//     }
// }
// findDuplicate([1,1,2,3,4,5,3]);

// function  findDup(arr){
//     let res=[];
//     for(let i=0;i<arr.length;i++){
//         for(let j=i+1;j<arr.length;j++){
//             if(arr[i]===arr[j])
//                 if(!res.includes(arr[i]))
//                     res.push(arr[i]);
//         }
//     }
//     console.log(res);
// }
// findDup([1,2,3,4,4,5,3,2,1]);



///---sum of two elements--[1,2,4,6,13,7]

// let arr = [1, 2, 4, 6, 13, 7,15,5];
// let target = 20;
// for (let i = 0; i < arr.length; i++) {
//     for (let j = i + 1; j < arr.length; j++) {
//         if (arr[i] + arr[j] === target) {
//             console.log(arr[i], arr[j]);

//         }

//     }
// }

// function findSumofele(arr, target) {
//     let res=[];
//     for (let i = 0; i < arr.length; i++) {
//         for (let j = i + 1; j < arr.length; j++) {
//             if (arr[i] + arr[j] === target) {
//                 res.push([arr[i], arr[j]])

//             }

//         }
//     } console.log(res);

// }
// findSumofele([1,2,3,4,5,6,14,3],20);


//---Remove Duplicates from an array
// function RemoveDuplicates(arr){
//     for(let i=0;i<arr.length;i++){
//         for(let j=0;j<arr.length;j++){
//             if(arr[i]==arr[j])
//                 arr.splice(1,j);
//         }
//     }
//     console.log(arr);
// }
// RemoveDuplicates([1,2,3,1,2,3]);


//program to validate a password
//->1 uppercase; 1 lowercase; 1 digit; 1 special char; min 8 char length
//-->if any one is not matching that need to return
let p = "ram";
for (let i = 0; i < p.length; i++) {
    let char = p.charAt(i);
    if (!char >= 'a' && char <= 'a') {
        console.log("No lowercase");
    } else if (char >= 'A' && char <= 'Z') {
        console.log("No uppercase");
    } else if (char >= 0 && char <= 9) {
        console.log("no num ")
    }
     
    console.log(char);
    
}


