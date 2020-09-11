function conv() {
    let dictionaryEng = ["Name", "Age", "Job"];
    let dictionaryVie = ["Tên", "Tuổi", "Nghề nghiệp"];

    // Ở đây mới get phần tử thôi, chưa có get giá trị nè
    let word = document.getElementById("inputWord").value;

    console.log(word)
    //kiemtra chu nhap vao co trong mang khong
    let check = dictionaryEng.indexOf(word);
    if (check !== -1) {
        document.getElementById('outputWord').value = dictionaryVie[check];
    } else {
        alert('Không tìm thấy từ bạn cần ! ')
        document.getElementById('outputWord').value = '';
    }
}
    // let from = document.getElementById("from").value;
    // let to = document.getElementById("to").value;
    //check ok

    // if (word == " ")
    //     document.getElementById("outputWord").value = "No find this word."
    // if (from.value === "English" && to.value === "Vietnamese") {
    //     // for (let i = 0; i < dictionaryEng.length; i++) {
    //     //     if (word === dictionaryEng [i]) {
    //     //         document.getElementById("outputWord").innerText = dictionaryVie[i].value;
    //     //     } else {
    //     //         document.getElementById("outputWord").innerText = "No find this word.";
    //     //     }
    //     // }
    // } else {
    //     for (let i = 0; i < dictionaryVie.length; i++) {
    //         if (word === dictionaryVie [i]) {
    //             document.getElementById("outputWord").innerText = dictionaryEng[i].value;
    //         } else {
    //             document.getElementById("outputWord").innerText = "No find this word.";
    //         }
    //     }
    // }
