let arr = [1,35,6,3,745,54];

function min(arr) {
    let min = arr[0];
    for(let i=1; i<arr.length;i++)
    {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    alert("Gia tri min: " + min);
}

function max(arr) {
    let max = arr[0];
    for(let i=1; i<arr.length;i++)
    {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    alert("Gia tri min: " + max);
}

min(arr);
max(arr);