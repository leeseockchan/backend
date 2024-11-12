const tabgetLink = document.querySelectorAll('.bottom_tab');
const tabContent = document.querySelectorAll('.content>ul');

tabgetLink.forEach(function (link) {
    link.addEventListener('click', function (t) {
        t.preventDefault();

        let onTarget = t.target.getAttribute('href');
        // let tabTarget = onTarget.replace("#", "");

        tabContent.forEach(function (content) {
            content.style.display = "none";
        });
        document.querySelector(onTarget).style.display = "block";
        
        tabgetLink.forEach(function (second) {
            second.classList.remove('first_tab');
            t.target.classList.add('first_tab');
        });

    });
});