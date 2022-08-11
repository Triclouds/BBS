$(function(){
    // 头像上传样式
    $('#upload').click(function(){
        $('#file').click();
    });

    $('#account').poshytip({
        className: 'tip-yellowsimple',
        showOn: 'focus',
        alignTo: 'target',
        alignX: 'center',
        alignY: 'top',
        fade: 'true',
        content: '请输入用户名',
    });

    var password_1 = $('#password_1').val();
    var password_2 = $('#password_2').val();

    $('#password_2').blur(function() {
        if (password_1 != password_2){
            $('#password_2').poshytip({
                className: 'tip-yellowsimple',
                showOn: 'focus',
                alignTo: 'target',
                alignX: 'center',
                alignY: 'top',
                fade: 'true',
                content: '两次密码不一致',
            });
        }
    });
});