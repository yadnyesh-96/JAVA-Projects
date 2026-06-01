let value = document.getElementById("mobile");

function clickMe() {
    let num = value.value.trim();

    if (num.length !== 10) {
        value.style.border = "1px solid red";
        alert("Invalid Number");
    } else {
        value.style.border = "";
        alert("Valid Number");
    }
}