$(function(){

    var visual = $('#brandVisual > ul > li'); // 큰사진
    var button1 = $('#buttonList > li');// pager 클릭할 버튼
    var current = 0; // 현재 상태
    var id;

    button1.click(function(){
        var i = $(this).index();
        // alert(i);
        button1.removeClass('on');
        button1.eq(i).addClass('on');
        move(i);    // 매개변수 i라는 변수를 빼준다.
    });



    function move(i){
        // move() 매개변수
        // 위에 있는 지역변수 i를 호출해오는것과 같다.
        if(current == i)return;
        // 현재 활성화 된 button과 클릭한 버튼이 같으면 빠져 나간다.
        var curr = visual.eq(current);
        var next = visual.eq(i);
        
        curr.css('left','0').stop().animate({ 'left':'-100%'},500);
        next.css('left','100%').stop().animate({'left':'0%'}),500;
        current = i;
    }

    function timer(){
        id = setInterval(function(){
    // 추후에 멈추는 기능을 만들기 위해
    // id 변수에 setInterval을 넣어줬다.
            var n = current + 1;
            if(n == 3){
                n=0;
            }
            button1.eq(n).trigger('click');
        }, 2000);
    }
    timer();

});