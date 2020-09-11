
let arrayNames= ['Polaris', 'Aldebaran', 'Deneb', 'Vega', 'Altair', 'Dubhe', 'Regulus'];
let arrayConstellation = ['UrsaMinor', 'Tarurus', 'Cygnus', 'Lyra', 'Aquila', 'UrsaMajor', 'Leo'];

function findSomething() {
    let name = document.getElementById("ipName").value;
    console.log(name);
    let check = arrayNames.indexOf(name);
    if (check !== -1) {
        alert('Found it!');
        document.getElementById('output').value = arrayConstellation[check];
    } else {
        alert('Not found!');
        console.log(name);
        // document.getElementById('output').value = '';
        name = '';
        document.getElementById("ipName").value = '';
        document.getElementById("ipName").focus(); //hien lai con tro chuot trong o input
    }
}