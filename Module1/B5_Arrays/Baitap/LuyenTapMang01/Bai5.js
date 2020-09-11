<script>
//co 5 nguyen am: u, e, o, a, i
// duyet mang, co u e o a i thi đếm tăng lên 1
let arr = "hom nay luoi hoc qua";
let count = 0;
// let newArr = array.from(Arr);
for (let i = 0; i < arr.length; i ++)
{
    if (arr[i] == 'u' || arr[i] == 'e'||
        arr[i] == 'o'|| arr[i] == 'a'|| arr[i] == 'i')
    {
        count ++;
    }
}
alert("So nguyen am la: " + count);