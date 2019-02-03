const arr1=['a','d','f','g'];
const arr2=['a','h','u'];


function containsCommonItem(arr1,arr2){
//loop through first array and create object
let map={};
for (let i=0;i<arr1.length;i++){
  if(!map[arr1[i]]){
    const item=arr1[i];
    map[item]=true;
  }
}
//loop thgitrough second array and and check if items are there in second array
for(let j=0;j<=arr2.length;j++){
  if(map[arr2[j]]){
    return true;
    }
return false
}

containsCommonItem(arr1,arr2)


//using built-in function
function containsCommonItem3(arr1,arr2){
  return arr1.some(item=>arr2.includes(item))
}

containsCommonItem3(arr1,arr2)
