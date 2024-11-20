$(function(){
    $('.tab li').click(function(){
        var i =$(this).index();
        // alert(i);
        $('.tab li').removeClass('on');
        $('.tab li').eq(i).addClass('on');
        $('.tab_list div').removeClass('on');
        $('.tab_list div').eq(i).addClass('on');

    });
});