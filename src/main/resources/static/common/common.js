/**
 * Created by Administrator on 2018/6/22.
 */
//加载侧边栏

    $("#sidebar_in").load("sidebar.html");

$('#sidebar .sub-menu > a').click(function () {
    var last = $('.sub-menu.open', $('#sidebar'));
    $('.menu-arrow').removeClass('arrow_carrot-right');
    $('.sub', last).slideUp(200);
    var sub = $(this).next();
    if (sub.is(":visible")) {
        $('.menu-arrow').addClass('arrow_carrot-right');
        sub.slideUp(200);
    } else {
        $('.menu-arrow').addClass('arrow_carrot-down');
        sub.slideDown(200);
    }
    var o = ($(this).offset());
    diff = 200 - o.top;
    if(diff>0)
        $("#sidebar").scrollTo("-="+Math.abs(diff),500);
    else
        $("#sidebar").scrollTo("+="+Math.abs(diff),500);
});

// sidebar menu toggle
$(function() {
    function responsiveView() {
        var wSize = $(window).width();
        if (wSize <= 768) {
            $('#container').addClass('sidebar-close');
            $('#sidebar > ul').hide();
        }

        if (wSize > 768) {
            $('#container').removeClass('sidebar-close');
            $('#sidebar > ul').show();
        }
    }
    $(window).on('load', responsiveView);
    $(window).on('resize', responsiveView);
});
