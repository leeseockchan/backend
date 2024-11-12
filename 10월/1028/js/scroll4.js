$(function () {
    $(window).scroll(function () {
        var sct = $(this).scrollTop();
        // 마우스의 세로 스크롤의 값을 sct에 저장
        $('.s_top').html(sct);
        if (sct >= 450 && sct <= 1600) {
            $('.left1').addClass('on');
        } else {
            $('.left1').removeClass('on');
        }
        if (sct >= 1200 && sct <= 1800) {
            $('.right1').addClass('on');
        } else {
            $('.right1').removeClass('on');
        }

        if(sct >= 2500){
            $('.s4_cover').addClass('active');
        }

        
    });
});