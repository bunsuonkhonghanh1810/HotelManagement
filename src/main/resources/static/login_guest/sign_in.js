const email = document.getElementsByName("email")[0];
const pass = document.getElementById("password");

function check(event) {
    // Prevent form submission
    event.preventDefault();

    let e = email.value.trim();
    let p = pass.value.trim();

    if (!e || !p) {
        alert("Điền đủ thông tin vào ?");
        return;
    }

    if (!validateEmail(e)) {
        alert("Email không hợp lệ");
        return;
    }

    if (!checkPassword(p)) {
        if (p.length < 8) {
            alert("Mật khẩu phải có ít nhất 8 ký tự.");
        } else {
            alert("Mật khẩu phải bao gồm chữ in hoa, chữ thường, số và ký tự đặc biệt.");
        }

        return;
    }
}

function checkPassword(password) {
    const cHoa = /[A-Z]/.test(password);
    const cThuong = /[a-z]/.test(password);
    const cSo = /\d/.test(password);
    const kytu = /[!@#$%^&*(),.?":{}|<>]/.test(password);

    return password.length >= 8 && cHoa && cThuong && cSo && kytu;
}

function validateEmail(email) {
    const regex = /^[^\s@]+@gmail\.com$/;
    return regex.test(email);
}
