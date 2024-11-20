// const targetLink = document.querySelectorAll('.tab_menu a'); //탭버튼
// const tabContent = document.querySelectorAll('#tabContent>div');// 탭내용

// //targetLink 배열을 forEach로 순회

// targetLink.forEach(function (link) {

//     link.addEventListener('click', function (e) {
//         e.preventDefault(); //링크금지
//         let orgTarget = e.target.getAttribute('href'); //ex) #tabs2

//         let tabTarget = orgTarget.replace("#", "");    //ex) #tabs2 => tabs2


//         document.getElementById(tabTarget).style.display = "block";
//         // id = tabs2라는 선택자 보이기

//         tabContent.forEach(function (content) {
//             content.style.display = "none";
//             //컨텐츠 내용 숨기기
//         });

//         targetLink.forEach(function (link2) {
//             link2.classList.remove('active');
//             e.target.classList.add('active');
//         });


//     });

// });

$('.tab_menu a').click(function () {
    // let orgTarget = e.target.getAttribute('href');
    // jquery 로 쓴다면
    let orgTarget = $(this).attr('href');
    $('#tabContent>div').hide();    // 컨텐츠 내용 숨기기
    $(orgTarget).show();            // 컨텐츠 내용 보이기
    $('.tab_menu a').removeClass('active');
    $(this).addClass('active');

    return false;
});
