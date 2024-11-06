function toggleDropdown(element) {
    var parentLi = element.parentElement;
    parentLi.classList.toggle("active");
}

function loadContent(page) {
    fetch(page)
    .then(response => response.text())
    .then(data => {

        document.querySelector('main').innerHTML = data;

        const scripts = document.querySelector("main").querySelectorAll('script');
        scripts.forEach(script => {
            if (script.src) {
                const newScript = document.createElement('script');
                newScript.src = script.src;
                newScript.onload = () => {
                };
                document.body.appendChild(newScript);
                document.body.removeChild(newScript);
            } else {
                const newScript = document.createElement('script');
                newScript.textContent = script.textContent;
                document.body.appendChild(newScript);
                document.body.removeChild(newScript);
            }
        });
    })
}

document.addEventListener('click', function (e) {
    const anchor = e.target.closest('a');
    if (anchor && anchor.hasAttribute('data-content')) {
        e.preventDefault();
        const page = anchor.getAttribute('data-content');
        loadContent(page);
    }
});
document.addEventListener("DOMContentLoaded", function () {
    loadContent('./home_func/dashboard/dashboard.html');
});