let arrPhone = ["0976666666","0902188130","034329999","0386666666","0905118248"];
function find(arrPhone) {
    let arrViettel = [];
    regexp=/^(086|096|097|098|032|033|034|035|036|037|038|039)\d{7}$/;
    for (let i = 0;i<arrPhone.length;i++)
    {
        if(regexp.test(arrPhone[i])){
            arrViettel.push(arrPhone[i]);
        }
    }
    alert("SĐT Viettel: " + arrViettel.join(" - "));
}
find(arrPhone);