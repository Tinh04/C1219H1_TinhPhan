function dtb() {
    document.getElementById("DTB").innerText = "Diem Trung Binh: " + ((document.getElementById("vatli").value) * 1
        + (document.getElementById("hoahoc").value) * 1 + (document.getElementById("sinhhoc").value) * 1) / 3
}