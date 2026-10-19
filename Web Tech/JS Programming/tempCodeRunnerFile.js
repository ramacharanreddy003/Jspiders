
function findSmallestElement(arr){
    let small=arr[0];
    for(let i=0;i<arr.length;i++){
        if(arr[i]<small){
            small=arr[i];
        }
    }
    console.log(small);
}
findSmallestElement([10,25,7,45,18]);