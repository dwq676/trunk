<style type="text/css">
    body{
        background: #d8d8d8;
    }

    p{
        font-family: sans-serif;
        color:#fff;
        text-align: center;
        font-size: 30px;
        padding-top: 19px;
    }

    /*设置蓝色球*/
    #bluebubble{
        margin:0 auto;
        position: relative;
        top:30px;
        width: 150px;
        height: 130px;
        -webkit-border-radius: 50%;
        -moz-border-radius: 50%;
        border-radius:50% ;
        background: linear-gradient(#09e4ff,#4666fe);
    }

    #pointyend{
        width: 60px;
        height: 40px;
        position: relative;
        top:100px;
        left:-5px;
        -webkit-border-radius: 50%;
        -moz-border-radius: 50%;
        border-radius:50% ;
        background: #4666fe;
        z-index: -1;

    }

    #curve{
        width: 60px;
        height: 60px;
        position: relative;
        top:-10px;
        left:-20px;
        background: #d8d8d8;
        -webkit-border-radius: 50%;
        -moz-border-radius: 50%;
        border-radius:50% ;
    }

    /*篮球设置完成，下面的图形设置类似*/
    #whitebubble{
        width:90px;
        height:80px;
        position:relative;
        border-radius:50%;
        top:30px;
        left:60px;background: linear-gradient(#E1E3E4,#A5A8AC);
    }
    #dot,#dotdot,#dotdotdot{
        position:relative;
        top:33px;
        left:16px;
        z-index:30;
        width:14px;
        height:14px;
        background:#545454;
        border-radius:50%;
    }

    #dotdot{
        top:0px;
        left:21px;
    }
    #dotdotdot{
        top:-14px;
        left: 42px;
    }
    #pointyend2{
        width:35px;
        height:26px;
        position:relative;
        top:42px;
        left:60px;
        border-radius:50%;
        background:#A9ACB0;
        z-index:-2;
        transform: rotate(-15deg);
    }

    #curve2{
        width:30px;
        height:30px;
        position:relative;
        left:10px;
        background:#D8D8D8;
        border-radius:50%;
        z-index:-1;
    }
    #circle{
        width:70px;
        height:70px;
        border-radius:50%;
        position:relative;
        top:-165px;
        left:100px;
        background:#f30808;
        box-shadow: 0px 0px 5px #404040;
    }
</style>
<div id="bluebubble" onclick="read()">

    <div id="pointyend">
        <div id="curve"></div>
    </div>

    <div id="whitebubble">
        <div id="dot">

            <div id="dotdot"></div>
            <div id="dotdotdot"></div>
        </div>
        <div id="pointyend2">
            <div id="curve2"></div>
        </div>

    </div>

    <div id="notify">
        <div id="circle">
            <p id="messages"></p>
        </div>
    </div>
</div>