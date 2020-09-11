let number = parseInt(prompt("Nhap phan tu can tim:"));
let nums = [];
function create() {
    for (let i = 0; i <= 8; i++) {
        nums[i] = Math.floor(Math.random() * 9);
        nums.push(nums[i]);
        // return nums;
    }
    alert(nums);
}

function find(nums,number) {
    let count = 0;
    for (let j = 0; j < nums.length; j++) {
        if (nums[j] === number) {
            count++;
        }
    }
    if ( count !== 0 ) {
        alert("So lan phan tu " + number + " xuat hien trong mang la: " + count);

    } else {
        alert("Phan tu " + number + " khong co trong mang");
    }
}

create();
find(nums,number);