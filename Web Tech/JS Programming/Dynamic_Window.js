
// // //Find the length of the longest contiguous subarray whose sum is less than or equal to 7. Input: [2,1,5,1,3,2]  Output: 3

// function longestSubArray(arr, k) {
//     let left = 0;
//     let sum = 0;
//     let maxLength = 0;

//     for (let right = 0; right < arr.length; right++) {

//         sum += arr[right];

//         while (sum > k) {
//             sum -= arr[left];
//             left++;
//         }

//         let length = right - left + 1;
//         maxLength = Math.max(maxLength, length);

//     }
//     return maxLength;
// }

// let arr=[2,1,5,1,3,2];
// let k=7;
// console.log(longestSubArray(arr,k));



// function longestsubarray(arr,k){
//     let left=0;
//     let sum=0;
//     let maxLength=0;
//     let start=0;
//     let end=-1;

//     for(let right=0;right<arr.length;right++){
//         sum+=arr[right];

//         while(sum>k)
//         {
//             sum+=arr[left];
//             left++
//         }

//         let length=right-left+1;

//         if(length>maxLength){
//             maxLength=length;
//             start=left;
//             end=right;
//         }
//         // console.log(maxLength);
//     }
//     console.log(maxLength);
//     console.log(arr.slice(start,end+1));

// }


//3. Find the maximum length of contiguous subarray whose sum is at least 7. Input:- arr=[2,3,1,2,4,3], k=7, Output: 2
//Explanation [4,3] has sum 7 and lenght 2

// function maxLength(arr, k) {
//     let left = 0;
//     let sum = 0;
//     let maxLength = 0;
//     let start = 0;
//     let end = -1;
//     for (let right = 0; right < arr.length; right++) {
//         sum += arr[right];
//         while (sum > k) {
//             sum+=arr[left];
//             left++;

//         }
//         let length=right-left+1;


//     }
// }


// minsubarr
function minsubarray(arr, k) {
    let left = 0;
    let sum = 0;
    let minlength = Infinity;

    for (let right = 0; right < arr.length; right++) {
        sum += arr[right];

        while (sum > k) {
            let length = right - left + 1;
            minlength = Math.min(minlength, left);
            sum -= arr[left];
            left++
        }

    }
    return minlength === Infinity ? 0 : minlength;
}
let arr=[3,6,1,8,2,5];
console.log(longestsubarray,2)
