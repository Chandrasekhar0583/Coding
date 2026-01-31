var nextGreatestLetter = function(letters, target) {
    let i = 0;
    let j = letters.length - 1;
    
    while (i <= j) {
        let mid = Math.floor((i + j) / 2); 
        
        if (letters[mid] > target) {
            j = mid - 1;
        } else {
            i = mid + 1;
        }
    }
    return letters[i % letters.length];
};